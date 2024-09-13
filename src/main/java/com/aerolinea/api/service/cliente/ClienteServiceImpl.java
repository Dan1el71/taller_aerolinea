package com.aerolinea.api.service.cliente;

import com.aerolinea.api.model.Cliente;
import com.aerolinea.api.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;

    @Override
    public Cliente guardar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Optional<Cliente> buscarClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public List<Cliente> buscarClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public List<Cliente> buscarClientesByIDs(List<Long> ids) {
        return clienteRepository.findAllById(ids);
    }

    @Override
    public List<Cliente> buscarClienteByNombre(String nombre) {
        return clienteRepository.findByNombreCliente(nombre);
    }

    @Override
    public Optional<Cliente> actualizarCliente(Cliente cliente, Long id) {
        return clienteRepository.findById(id)
                .map(c -> {
                    c.setNombreCliente(cliente.getNombreCliente());
                    c.setApellidoCliente(cliente.getApellidoCliente());
                    c.setDireccionCliente(cliente.getDireccionCliente());
                    c.setTelefonoCliente(cliente.getTelefonoCliente());
                    c.setCorreoCliente(cliente.getCorreoCliente());
                    return clienteRepository.save(c);
                });
    }
}
