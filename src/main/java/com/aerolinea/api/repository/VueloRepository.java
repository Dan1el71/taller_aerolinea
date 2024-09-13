package com.aerolinea.api.repository;

import com.aerolinea.api.model.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface VueloRepository extends JpaRepository<Vuelo,Long> {
    List<Vuelo> findByAeropuertoOrigenIdAeropuerto(Long idAeropuerto);
    List<Vuelo> findByAeropuertoDestinoIdAeropuerto(Long idAeropuerto);
    List<Vuelo> findByAerolineaIdAerolinea(Long idAerolinea);
    List<Vuelo> findByHoraSalidaBetween(LocalDateTime horaInicio, LocalDateTime horaFin);

}
