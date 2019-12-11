package com.airplanetickets.data.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private LocalDate departureDate;

    @NotBlank
    @Column(nullable = false)
    private LocalDateTime time;

    @NotBlank
    @Column(nullable = false)
    private Float price;

    @OneToMany
    @JoinColumn(name = "flight_id")
    private List<Flights> flight;

    @OneToMany
    @JoinColumn(name = "airplane_id")
    private List<Airplane> airplane;
}
