package com.airplanetickets.controllers;

import com.airplanetickets.data.domain.Flights;
import com.airplanetickets.services.FlightsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("flights")
public class FlightsController {

    private final FlightsService flightsService;

    @GetMapping("{id}")
    public Flights getById(@PathVariable Long id) {
        return flightsService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Flights save(@RequestBody Flights flights) {
        return flightsService.save(flights);
    }

    @DeleteMapping
    public void deleteById(@PathVariable Long id) {
        flightsService.deleteById(id);
    }

}
