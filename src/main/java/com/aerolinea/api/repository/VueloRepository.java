package com.aerolinea.api.repository;

import com.aerolinea.api.model.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VueloRepository extends JpaRepository<Vuelo,Long> {
}
