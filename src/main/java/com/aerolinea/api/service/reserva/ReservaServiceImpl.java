package com.aerolinea.api.service.reserva;

import com.aerolinea.api.model.Cliente;
import com.aerolinea.api.model.Reserva;
import com.aerolinea.api.repository.ReservaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReservaServiceImpl implements ReservaService {
    private final ReservaRepository reservaRepository;

    @Override
    public List<Reserva> findAllReservas() {
        return reservaRepository.findAll();
    }

    @Override
    public Optional<Reserva> findReservaById(Long id) {
        return reservaRepository.findById(id);
    }

    @Override
    public List<Reserva> findReservasByClienteId(Cliente id) {
        return reservaRepository.findByIdCliente(id);
    }

    @Override
    public List<Reserva> findReservasByVueloId(Long id) {
        return reservaRepository.findByIdVuelo(id);
    }

    @Override
    public Reserva saveReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @Override
    public Optional<Reserva> updateReserva(Reserva reserva, Long id) {
        return reservaRepository.findById(id).map(r -> {
            r.setIdCliente(reserva.getIdCliente());
            r.setIdVuelo(reserva.getIdVuelo());
            r.setFechaReserva(reserva.getFechaReserva());
            return reservaRepository.save(r);
        });
    }

    @Override
    public void deleteReserva(Long id) {

    }
}
