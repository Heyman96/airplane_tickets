package com.airplanetickets.services;

import com.airplanetickets.data.domain.Client;

import java.util.List;

public interface ClientService {

    Client findById(Long id);

    List<Client> findByFirstName(String firstName);

    List<Client> findByLastName(String lastName);

    Client save(Client client);

    void deleteById(Long id);

}
