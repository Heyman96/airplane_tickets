package com.airplanetickets.controllers;


import com.airplanetickets.data.domain.Countries;
import com.airplanetickets.services.CountriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("countries")
public class CountriesController {

    private final CountriesService countriesService;

    @GetMapping("{id}")
    public Countries getById(@PathVariable Long id) {
        return countriesService.findById(id);
    }

    @GetMapping("{name}")
    public Countries getByFirstName(@PathVariable String firstName) {
        return countriesService.findByName(firstName);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Countries save(@RequestBody Countries countries) {
        return countriesService.save(countries);
    }

    @DeleteMapping
    public void deleteById(@PathVariable Long id) {
        countriesService.deleteById(id);
    }

}
