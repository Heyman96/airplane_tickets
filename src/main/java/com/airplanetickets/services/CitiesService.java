package com.airplanetickets.services;

import com.airplanetickets.data.domain.Cities;

import java.util.Optional;

public interface CitiesService {

    Cities findById(Long id);

    Optional<Cities> findByName(String name);

    Cities save(Cities cities);

    void deleteById(Long id);

}
