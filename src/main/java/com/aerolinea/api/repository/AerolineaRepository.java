package com.aerolinea.api.repository;

import com.aerolinea.api.model.Aerolinea;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AerolineaRepository extends JpaRepository<Aerolinea, Long> {
    List<Aerolinea> findByNombreAerolinea(String nombre);
    Aerolinea findByCodigoAerolinea(Long codigoAerolinea);
}
