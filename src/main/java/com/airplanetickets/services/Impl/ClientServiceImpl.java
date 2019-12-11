package com.airplanetickets.services.Impl;

import com.airplanetickets.data.domain.Client;
import com.airplanetickets.data.repository.ClientRepository;
import com.airplanetickets.exceptions.ClientNotFoundException;
import com.airplanetickets.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public Client findById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new ClientNotFoundException("Client not found!"));
    }

    @Override
    public List<Client> findByFirstName(String firstName) {
        return clientRepository.findByFirstName(firstName);
    }

    @Override
    public List<Client> findByLastName(String lastName) {
        return clientRepository.findByLastName(lastName);
    }

    @Override
    public Client save(Client client) {
        return clientRepository.save(client); // метод save() наследуется в интерфейсе ClientRepository от класса JpaRepository
    }

    @Override
    public void deleteById(Long id) {
        clientRepository.deleteById(id); // метод deleteById() наследуется в интерфейсе ClientRepository от класса JpaRepository
    }

}
