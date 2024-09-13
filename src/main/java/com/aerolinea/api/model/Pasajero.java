package com.aerolinea.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pasajero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPasajero;

    String nombrePasajero;
    String apellidoPasajero;

    @ManyToOne
    @JoinColumn(name = "id_reserva")
    private Reserva reserva;
}
