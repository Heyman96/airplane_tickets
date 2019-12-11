package com.airplanetickets.data.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String phoneNumber;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
