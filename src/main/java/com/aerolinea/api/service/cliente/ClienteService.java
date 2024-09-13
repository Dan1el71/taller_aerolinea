package com.aerolinea.api.service.cliente;
import com.aerolinea.api.model.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    Cliente guardar(Cliente cliente);
    Optional<Cliente> buscarClientePorId(Long id);
    List<Cliente> buscarClientes();
    List<Cliente> buscarClientesByIDs(List<Long> ids);
    List<Cliente> buscarClienteByNombre(String nombre);
    Optional<Cliente> actualizarCliente(Cliente cliente, Long id);
}
