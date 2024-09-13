package com.aerolinea.api.repository;

import com.aerolinea.api.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    List<Cliente> findByNombreCliente(String nombre);
    List<Cliente> findByIdClienteIn(Collection<Long> ids);
}
