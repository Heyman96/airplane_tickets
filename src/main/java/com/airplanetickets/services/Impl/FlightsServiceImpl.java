package com.airplanetickets.services.Impl;

import com.airplanetickets.data.domain.Flights;
import com.airplanetickets.data.repository.FlightsRepository;
import com.airplanetickets.exceptions.FlightsNotFoundException;
import com.airplanetickets.services.FlightsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class FlightsServiceImpl implements FlightsService {

    public final FlightsRepository flightsRepository;

    @Override
    public Flights findById(Long id) {
        return flightsRepository.findById(id)
                .orElseThrow(() -> new FlightsNotFoundException("County not found!"));
    }

    @Override
    public Flights save(Flights flights) {
        return flightsRepository.save(flights);
    }

    @Override
    public void deleteById(Long id) {
        flightsRepository.deleteById(id);
    }

}
