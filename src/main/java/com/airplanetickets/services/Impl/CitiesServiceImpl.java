package com.airplanetickets.services.Impl;

import com.airplanetickets.data.domain.Cities;
import com.airplanetickets.data.repository.CitiesRepository;
import com.airplanetickets.exceptions.CitiesNotFoundException;
import com.airplanetickets.services.CitiesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class CitiesServiceImpl implements CitiesService {

    private final CitiesRepository citiesRepository;

    @Override
    public Cities findById(Long id) {
        return citiesRepository.findById(id)
                .orElseThrow(() -> new CitiesNotFoundException("City not found!"));
    }

    @Override
    public Optional<Cities> findByName(String name) {
        return citiesRepository.findByName(name);
    }

    @Override
    public Cities save(Cities cities) {
        return citiesRepository.save(cities);
    }

    @Override
    public void deleteById(Long id) {
        citiesRepository.deleteById(id);
    }
}
