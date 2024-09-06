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
    private Long id_aeropuerto;
    private String nombre;
    private String ciudad;
    private String pais;

    @OneToMany(mappedBy = "aeropuerto_origen")
    Set<Vuelo> vuelos_origen;

    @OneToMany(mappedBy = "aeropuerto_destino")
    Set<Vuelo> vuelos_destino;
}
