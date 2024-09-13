package com.aerolinea.api.repository;

import com.aerolinea.api.model.Pasajero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PasajeroRepository extends JpaRepository<Pasajero, Long> {
    List<Pasajero> findByNombrePasajero(String nombre);
    List<Pasajero> findByApellidoPasajero(String apellido);
}
