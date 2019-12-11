package com.airplanetickets.controllers;


import com.airplanetickets.data.domain.Airplane;
import com.airplanetickets.services.AirplaneService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("airplanes")
public class AirplaneController {

    private final AirplaneService airplaneService;

    @GetMapping("{id}")
    public Airplane getById(@PathVariable Long id) {
        return airplaneService.findById(id);
    }

    @GetMapping("{name}")
    public List<Airplane> getByFirstName(@PathVariable String name) {
        return airplaneService.findByName(name);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Airplane save(@RequestBody Airplane airplane) {
        return airplaneService.save(airplane);
    }

    @DeleteMapping
    public void deleteById(@PathVariable Long id) {
        airplaneService.deleteById(id);
    }

}
