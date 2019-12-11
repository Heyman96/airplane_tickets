package com.airplanetickets.data.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Tickets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private LocalDate saleDate;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "schedule_id")
    private List<Schedule> schedule;

    @OneToMany
    @JoinColumn(name = "client_id")
    private List<Client> client;

    @OneToMany
    @JoinColumn(name = "seat_id")
    private List<Seats> seat;
}
