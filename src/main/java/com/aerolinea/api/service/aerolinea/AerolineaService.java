package com.aerolinea.api.service.aerolinea;

import com.aerolinea.api.model.Aerolinea;

import java.util.List;
import java.util.Optional;

public interface AerolineaService {
    public List<Aerolinea> getAerolineas();
    public Optional<Aerolinea> getAerolineaById(Long id);
    public Aerolinea saveAerolinea(Aerolinea aerolinea);
    public Optional<Aerolinea> updateAerolinea(Aerolinea aerolinea, Long id);
    public void deleteAerolinea(Long id);
}
