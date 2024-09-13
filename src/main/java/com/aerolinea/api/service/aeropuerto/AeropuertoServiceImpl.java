package com.aerolinea.api.service.aeropuerto;

import com.aerolinea.api.model.Aeropuerto;
import com.aerolinea.api.repository.AeropuertoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AeropuertoServiceImpl implements AeropuertoService{
    private final AeropuertoRepository aeropuertoRepository;

    @Override
    public List<Aeropuerto> findAllAeropuerto() {
        return aeropuertoRepository.findAll();
    }

    @Override
    public List<Aeropuerto> findAeropuertoByNombre(String nombre) {
        return aeropuertoRepository.findByNombreAeropuerto(nombre);
    }

    @Override
    public List<Aeropuerto> findAeropuertoByPais(String pais) {
        return aeropuertoRepository.findByPaisAeropuerto(pais);
    }

    @Override
    public List<Aeropuerto> findAeropuertoByCiudad(String ciudad) {
        return aeropuertoRepository.findByCiudadAeropuerto(ciudad);
    }

    @Override
    public Aeropuerto findAeropuertoById(Long id) {
        return aeropuertoRepository.findById(id).orElse(null);
    }

    @Override
    public Aeropuerto saveAeropuerto(Aeropuerto aeropuerto) {
        return aeropuertoRepository.save(aeropuerto);
    }

    @Override
    public void deleteAeropuertoById(Long id) {
        aeropuertoRepository.deleteById(id);
    }

    @Override
    public Aeropuerto updateAeropuerto(Aeropuerto aeropuerto, Long id) {
        return aeropuertoRepository
                .findById(id)
                .map(a -> {
                    a.setNombreAeropuerto(aeropuerto.getNombreAeropuerto());
                    a.setPaisAeropuerto(aeropuerto.getPaisAeropuerto());
                    a.setCiudadAeropuerto(aeropuerto.getCiudadAeropuerto());
                    return aeropuertoRepository.save(a);
                })
                .orElse(null);
    }
}
