package com.airplanetickets.controllers;


import com.airplanetickets.data.domain.Cities;
import com.airplanetickets.services.CitiesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("cities")
public class CitiesController {

    private final CitiesService citiesService;

    @GetMapping("{id}")
    public Cities getById(@PathVariable Long id) {
        return citiesService.findById(id);
    }

    @GetMapping("{name}")
    public Optional<Cities> getByName(@PathVariable String name) {
        return citiesService.findByName(name);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cities save(@RequestBody Cities cities) {
        return citiesService.save(cities);
    }

    @DeleteMapping
    public void deleteById(@PathVariable Long id) {
        citiesService.deleteById(id);
    }

}
