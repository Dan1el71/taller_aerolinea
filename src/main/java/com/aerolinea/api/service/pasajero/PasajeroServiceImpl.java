package com.aerolinea.api.service.pasajero;

import com.aerolinea.api.model.Pasajero;
import com.aerolinea.api.repository.PasajeroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PasajeroServiceImpl implements PasajeroService{
    private final PasajeroRepository pasajeroRepository;

    @Override
    public List<Pasajero> findAllPasajero() {
        return pasajeroRepository.findAll();
    }

    @Override
    public List<Pasajero> findPasajeroByNombre(String nombre) {
        return pasajeroRepository.findByNombrePasajero(nombre);
    }

    @Override
    public List<Pasajero> findPasajeroByApellido(String apellido) {
        return pasajeroRepository.findByApellidoPasajero(apellido);
    }

    @Override
    public Optional<Pasajero> findPasajeroById(Long id) {
        return pasajeroRepository.findById(id);
    }

    @Override
    public Pasajero savePasajero(Pasajero pasajero) {
        return pasajeroRepository.save(pasajero);
    }

    @Override
    public Optional<Pasajero> updatePasajero(Pasajero pasajero, Long id) {
        return pasajeroRepository.findById(id)
                .map(pasajero1 -> {
                    pasajero1.setNombrePasajero(pasajero.getNombrePasajero());
                    pasajero1.setApellidoPasajero(pasajero.getApellidoPasajero());
                    return pasajeroRepository.save(pasajero1);
                });
    }

    @Override
    public void deletePasajero(Long id) {
        pasajeroRepository.deleteById(id);
    }
}
