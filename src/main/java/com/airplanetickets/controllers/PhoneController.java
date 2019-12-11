package com.airplanetickets.controllers;


import com.airplanetickets.data.domain.Phone;
import com.airplanetickets.services.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("phones")
public class PhoneController {

    private final PhoneService phoneService;

    @GetMapping("{id}")
    public Phone getById(@PathVariable Long id) {
        return phoneService.findById(id);
    }

    @GetMapping("{phone_number}")
    public Phone getByPhoneNumber(@PathVariable String phoneNumber) {
        return phoneService.findByPhoneNumber(phoneNumber);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Phone save(@RequestBody Phone phone) {
        return phoneService.save(phone);
    }

    @DeleteMapping
    public void deleteById(@PathVariable Long id) {
        phoneService.deleteById(id);
    }

}
