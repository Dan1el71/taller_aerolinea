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
@Data
@Builder
public class Aerolinea {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAerolinea;

    private String nombreAerolinea;
    private Long codigoAerolinea;
    private String paisOrigen;

    @OneToMany(mappedBy = "aerolinea")
    Set<Vuelo> vuelos;
}
