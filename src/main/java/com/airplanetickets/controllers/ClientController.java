package com.airplanetickets.controllers;

import com.airplanetickets.data.domain.Client;
import com.airplanetickets.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("clients")
public class ClientController {

    private final ClientService clientService;

    @GetMapping("{id}")
    public Client getById(@PathVariable Long id) {
        return clientService.findById(id);
    }

    @GetMapping("{first_name}")
    public List<Client> getByFirstName(@PathVariable String firstName) {
        return clientService.findByFirstName(firstName);
    }

    @GetMapping("{last_name}")
    public List<Client> getByLastName(@PathVariable String lastName) {
        return clientService.findByLastName(lastName);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(@RequestBody Client client) {
        return clientService.save(client);
    }

    @DeleteMapping
    public void deleteById(@PathVariable Long id) {
        clientService.deleteById(id);
    }

}
