package com.aerolinea.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long idCliente;

    String nombreCliente;
    String apellidoCliente;
    String direccionCliente;
    String telefonoCliente;
    String correoCliente;

    @OneToOne(mappedBy = "idCliente")
    Reserva reserva;
}
