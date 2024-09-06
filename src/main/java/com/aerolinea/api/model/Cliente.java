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
    Long id;

    String nombre;
    String apellido;
    String direccion;
    String telefono;
    String correo;

    @OneToOne(mappedBy = "id_cliente")
    Reserva reserva;
}
