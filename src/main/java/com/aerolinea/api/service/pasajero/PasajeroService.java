package com.aerolinea.api.service.pasajero;

import com.aerolinea.api.model.Pasajero;

import java.util.List;
import java.util.Optional;

public interface PasajeroService {
    List<Pasajero> findAllPasajero();
    List<Pasajero> findPasajeroByNombre(String nombre);
    List<Pasajero> findPasajeroByApellido(String apellido);
    Optional<Pasajero> findPasajeroById(Long id);
    Pasajero savePasajero(Pasajero pasajero);
    Optional<Pasajero> updatePasajero(Pasajero pasajero, Long id);
    void deletePasajero(Long id);

}
