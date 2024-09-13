package com.aerolinea.api.service.vuelo;

import com.aerolinea.api.model.Vuelo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface VueloService {
    List<Vuelo> findALlVuelos();
    Optional<Vuelo> findVueloById(Long id);
    List<Vuelo> findVueloByAeropuertoOrigenIdAeropuerto(Long idAeropuerto);
    List<Vuelo> findVueloByAeropuertoDestinoIdAeropuerto(Long idAeropuerto);
    List<Vuelo> findVueloByAerolineaIdAerolinea(Long idAerolinea);
    List<Vuelo> findVueloByHora_salidaBetween(LocalDateTime horaInicio, LocalDateTime horaFin);
    Vuelo saveVuelo(Vuelo vuelo);
    Optional<Vuelo> updateVuelo(Vuelo vuelo,Long id);
    void deleteVueloById(Long id);

}
