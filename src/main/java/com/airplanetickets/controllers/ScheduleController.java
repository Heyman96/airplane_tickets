package com.airplanetickets.controllers;


import com.airplanetickets.data.domain.Schedule;
import com.airplanetickets.services.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("schedules")
public class ScheduleController {

    private final ScheduleService scheduleService;

    @GetMapping("{id}")
    public Schedule getById(@PathVariable Long id) {
        return scheduleService.findById(id);
    }

    @GetMapping("{departure_date}")
    public List<Schedule> getByDepartureDate(@PathVariable LocalDate departureDate) {
        return scheduleService.findByDepartureDate(departureDate);
    }

    @GetMapping("{time}")
    public List<Schedule> getByTime(@PathVariable LocalDateTime time) {
        return scheduleService.findByTime(time);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Schedule save(@RequestBody Schedule schedule) {
        return scheduleService.save(schedule);
    }

    @DeleteMapping
    public void deleteById(@PathVariable Long id) {
        scheduleService.deleteById(id);
    }

}
