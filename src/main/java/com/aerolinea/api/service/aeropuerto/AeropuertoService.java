package com.aerolinea.api.service.aeropuerto;

import com.aerolinea.api.model.Aeropuerto;

import java.util.List;

public interface AeropuertoService {
    List<Aeropuerto> findAllAeropuerto();
    List<Aeropuerto> findAeropuertoByNombre(String nombre);
    List<Aeropuerto> findAeropuertoByPais(String pais);
    List<Aeropuerto> findAeropuertoByCiudad(String ciudad);
    Aeropuerto findAeropuertoById(Long id);
    Aeropuerto updateAeropuerto(Aeropuerto aeropuerto, Long id);
    Aeropuerto saveAeropuerto(Aeropuerto aeropuerto);
    void deleteAeropuertoById(Long id);
}
