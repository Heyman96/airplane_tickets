package com.airplanetickets.controllers;


import com.airplanetickets.data.domain.Seats;
import com.airplanetickets.services.SeatsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("seats")
public class SeatsController {

    private final SeatsService seatsService;

    @GetMapping("{id}")
    public Seats getById(@PathVariable Long id) {
        return seatsService.findById(id);
    }

    @GetMapping("{seat_number}")
    public Seats getBySeatNumber(@PathVariable int seatNumber) {
        return seatsService.findBySeatNumber(seatNumber);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Seats save(@RequestBody Seats seats) {
        return seatsService.save(seats);
    }

    @DeleteMapping
    public void deleteById(@PathVariable Long id) {
        seatsService.deleteById(id);
    }

}
