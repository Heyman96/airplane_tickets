package com.airplanetickets.services;

import com.airplanetickets.data.domain.Flights;

public interface FlightsService {

    Flights findById(Long id);

    Flights save(Flights flights);

    void deleteById(Long id);

}
