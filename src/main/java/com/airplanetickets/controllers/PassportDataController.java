package com.airplanetickets.controllers;


import com.airplanetickets.data.domain.PassportData;
import com.airplanetickets.services.PassportDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("passport_data")
public class PassportDataController {

    private final PassportDataService passportDataService;

    @GetMapping("{id}")
    public PassportData getById(@PathVariable Long id) {
        return passportDataService.findById(id);
    }

    @GetMapping("{passport_series}")
    public List<PassportData> getByPassportSeries(@PathVariable String passportSeries) {
        return passportDataService.findByPassportSeries(passportSeries);
    }

    @GetMapping("{passport_number}")
    public PassportData getByPassportNumber(@PathVariable Long passportNumber) {
        return passportDataService.findByPassportNumber(passportNumber);
    }

    @GetMapping("{birth_date}")
    public List<PassportData> getByBirthDate(@PathVariable LocalDate birthDate) {
        return passportDataService.findByBirthDate(birthDate);
    }

    @GetMapping("{birth_place}")
    public List<PassportData> getByBirthPlace(@PathVariable String birthPlace) {
        return passportDataService.findByBirthPlace(birthPlace);
    }

    @GetMapping("{sex}")
    public List<PassportData> getBySex(@PathVariable Character sex) {
        return passportDataService.findBySex(sex);
    }

    @GetMapping("{issue_place}")
    public PassportData getByIssuePlace(@PathVariable String issuePlace) {
        return passportDataService.findByIssuePlace(issuePlace);
    }

    @GetMapping("{issue_date}")
    public List<PassportData> getByIssueDate(@PathVariable LocalDate issueDate) {
        return passportDataService.findByIssueDate(issueDate);
    }

    @GetMapping("{registration}")
    public List<PassportData> getByRegistration(@PathVariable String registration) {
        return passportDataService.findByRegistration(registration);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PassportData save(@RequestBody PassportData passportData) {
        return passportDataService.save(passportData);
    }

    @DeleteMapping
    public void deleteById(@PathVariable Long id) {
        passportDataService.deleteById(id);
    }

}
