package com.aerolinea.api.repository;

import com.aerolinea.api.model.Aeropuerto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AeropuertoRepository extends JpaRepository<Aeropuerto,Long> {
    List<Aeropuerto> findByNombreAeropuerto(String nombre);
    List<Aeropuerto> findByCiudadAeropuerto(String ciudad);
    List<Aeropuerto> findByPaisAeropuerto(String pais);
}
