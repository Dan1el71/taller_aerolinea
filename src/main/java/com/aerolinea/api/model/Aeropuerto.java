package com.aerolinea.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Aeropuerto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAeropuerto;
    private String nombreAeropuerto;
    private String ciudadAeropuerto;
    private String paisAeropuerto;

    @OneToMany(mappedBy = "aeropuertoOrigen")
    Set<Vuelo> vuelosOrigen;

    @OneToMany(mappedBy = "aeropuertoDestino")
    Set<Vuelo> vuelosDestino;
}
