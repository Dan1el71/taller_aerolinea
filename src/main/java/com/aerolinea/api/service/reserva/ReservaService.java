package com.aerolinea.api.service.reserva;

import com.aerolinea.api.model.Cliente;
import com.aerolinea.api.model.Reserva;

import java.util.List;
import java.util.Optional;

public interface ReservaService {
    List<Reserva> findAllReservas();
    Optional<Reserva> findReservaById(Long id);
    List<Reserva> findReservasByClienteId(Cliente id);
    List<Reserva> findReservasByVueloId(Long id);
    Reserva saveReserva(Reserva reserva);
    Optional<Reserva> updateReserva(Reserva reserva, Long id);
    void deleteReserva(Long id);
}
