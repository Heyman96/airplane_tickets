package com.airplanetickets.data.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Flights {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "departure_city_id")
    private Cities departureCity;

    @OneToOne
    @JoinColumn(name = "arrival_city_id")
    private Cities arrivalCity;
}
