package com.airplanetickets.data.repository;

import com.airplanetickets.data.domain.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TicketsRepository extends JpaRepository<Tickets, Long> {

    List<Tickets> findBySaleDate(LocalDate saleDate);

}
