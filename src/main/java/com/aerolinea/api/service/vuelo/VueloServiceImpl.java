package com.aerolinea.api.service.vuelo;

import com.aerolinea.api.model.Vuelo;
import com.aerolinea.api.repository.VueloRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VueloServiceImpl implements VueloService{
    private final VueloRepository vueloRepository;


    @Override
    public List<Vuelo> findALlVuelos() {
        return vueloRepository.findAll();
    }

    @Override
    public Optional<Vuelo> findVueloById(Long id) {
        return vueloRepository.findById(id);
    }

    @Override
    public List<Vuelo> findVueloByAeropuertoOrigenIdAeropuerto(Long idAeropuerto) {
        return vueloRepository.findByAeropuertoOrigenIdAeropuerto(idAeropuerto);
    }

    @Override
    public List<Vuelo> findVueloByAeropuertoDestinoIdAeropuerto(Long idAeropuerto) {
        return vueloRepository.findByAeropuertoDestinoIdAeropuerto(idAeropuerto);
    }

    @Override
    public List<Vuelo> findVueloByAerolineaIdAerolinea(Long idAerolinea) {
        return vueloRepository.findByAerolineaIdAerolinea(idAerolinea);
    }

    @Override
    public List<Vuelo> findVueloByHora_salidaBetween(LocalDateTime horaInicio, LocalDateTime horaFin) {
        return vueloRepository.findByHoraSalidaBetween(horaInicio,horaFin);
    }

    @Override
    public Vuelo saveVuelo(Vuelo vuelo) {
        return vueloRepository.save(vuelo);
    }

    @Override
    public Optional<Vuelo> updateVuelo(Vuelo vuelo,Long id) {
        return vueloRepository.findById(id)
                .map(vuelo1 -> {
                    vuelo1.setAeropuertoOrigen(vuelo.getAeropuertoOrigen());
                    vuelo1.setAeropuertoDestino(vuelo.getAeropuertoDestino());
                    vuelo1.setAerolinea(vuelo.getAerolinea());
                    vuelo1.setHoraSalida(vuelo.getHoraSalida());
                    return vueloRepository.save(vuelo1);
                });
    }

    @Override
    public void deleteVueloById(Long id) {
        vueloRepository.deleteById(id);
    }
}
