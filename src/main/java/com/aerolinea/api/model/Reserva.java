package com.aerolinea.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idReserva;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_cliente")
    private Cliente idCliente;

    private Long idVuelo;
    private Date fechaReserva;
    private Short numeroPasajeros;

    @OneToMany(mappedBy = "reserva")
    private Set<Pasajero> pasajeros;

    @ManyToMany
    @JoinTable(
            name = "reserva_vuelos",
            joinColumns = @JoinColumn(name = "id_reserva"),
            inverseJoinColumns = @JoinColumn(name = "id_vuelo")
    )
    private Set<Vuelo> vuelos;
}
