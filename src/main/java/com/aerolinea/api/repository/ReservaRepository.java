package com.aerolinea.api.repository;

import com.aerolinea.api.model.Cliente;
import com.aerolinea.api.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva,Long> {
    List<Reserva> findByIdCliente(Cliente idCliente);
    List<Reserva> findByIdVuelo(Long id);
}
