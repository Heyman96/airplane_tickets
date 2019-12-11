package com.airplanetickets.data.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Data
public class PassportData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String passportSeries;

    @NotBlank
    @Column(unique = true, nullable = false)
    private Long passportNumber;

    @NotBlank
    @Column(nullable = false)
    private LocalDate birthDate;

    @NotBlank
    @Column(nullable = false)
    private String birthPlace;

    @NotBlank
    @Column(nullable = false)
    private Character sex;

    @NotBlank
    @Column(nullable = false)
    private String issuePlace;

    @NotBlank
    @Column(nullable = false)
    private LocalDate issueDate;

    @NotBlank
    @Column(nullable = false)
    private String registration;

}
