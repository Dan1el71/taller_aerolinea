package com.aerolinea.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_vuelo;

    private Date fechaSalida;
    private LocalDateTime horaSalida;
    private Short duracion;
    private Short capacidad;

    @ManyToOne
    @JoinColumn(name = "id_aeropuerto_origen")
    private Aeropuerto aeropuertoOrigen;

    @ManyToOne
    @JoinColumn(name = "id_aeropuerto_destino")
    private Aeropuerto aeropuertoDestino;

    @ManyToOne
    @JoinColumn(name = "id_aerolinea")
    private Aerolinea aerolinea;

    @ManyToMany(mappedBy = "vuelos")
    private Set<Reserva> reservas;
}
