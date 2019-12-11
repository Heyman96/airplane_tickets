package com.airplanetickets.services;

import com.airplanetickets.data.domain.Tickets;

import java.time.LocalDate;
import java.util.List;

public interface TicketsService {

    Tickets findById(Long id);

    List<Tickets> findBySaleDate(LocalDate saleDate);

    Tickets save(Tickets seats);

    void deleteById(Long id);

}
