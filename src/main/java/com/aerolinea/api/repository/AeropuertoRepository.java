package com.aerolinea.api.repository;

import com.aerolinea.api.model.Aeropuerto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AeropuertoRepository extends JpaRepository<Aeropuerto,Long> {
}
