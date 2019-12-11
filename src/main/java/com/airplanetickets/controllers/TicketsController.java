package com.airplanetickets.controllers;

import com.airplanetickets.data.domain.Tickets;
import com.airplanetickets.services.TicketsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("tickets")
public class TicketsController {

    private final TicketsService ticketsService;

    @GetMapping("{id}")
    public Tickets getById(@PathVariable Long id) {
        return ticketsService.findById(id);
    }

    @GetMapping("{sale_date}")
    public List<Tickets> getBySaleDate(@PathVariable LocalDate saleDate) {
        return ticketsService.findBySaleDate(saleDate);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tickets save(@RequestBody Tickets tickets) {
        return ticketsService.save(tickets);
    }

    @DeleteMapping
    public void deleteById(@PathVariable Long id) {
        ticketsService.deleteById(id);
    }

}
