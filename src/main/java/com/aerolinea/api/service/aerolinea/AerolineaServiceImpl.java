package com.aerolinea.api.service.aerolinea;

import com.aerolinea.api.model.Aerolinea;
import com.aerolinea.api.repository.AerolineaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AerolineaServiceImpl implements AerolineaService{
    private final AerolineaRepository aerolineaRepository;

    @Override
    public List<Aerolinea> getAerolineas() {
        return aerolineaRepository.findAll();
    }

    @Override
    public Optional<Aerolinea> getAerolineaById(Long id) {
        return aerolineaRepository.findById(id);
    }

    @Override
    public Aerolinea saveAerolinea(Aerolinea aerolinea) {
        return aerolineaRepository.save(aerolinea);
    }

    @Override
    public Optional<Aerolinea> updateAerolinea(Aerolinea aerolinea, Long id) {
        return aerolineaRepository.findById(id).map(a -> {
            a.setNombreAerolinea(aerolinea.getNombreAerolinea());
            a.setPaisOrigen(aerolinea.getPaisOrigen());
            return aerolineaRepository.save(a);
        });
    }

    @Override
    public void deleteAerolinea(Long id) {
        aerolineaRepository.deleteById(id);
    }
}
