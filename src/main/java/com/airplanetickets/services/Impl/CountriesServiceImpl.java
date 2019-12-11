package com.airplanetickets.services.Impl;

import com.airplanetickets.data.domain.Countries;
import com.airplanetickets.data.repository.CountriesRepository;
import com.airplanetickets.exceptions.CountriesNotFoundException;
import com.airplanetickets.services.CountriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CountriesServiceImpl implements CountriesService {

    private final CountriesRepository countriesRepository;

    @Override
    public Countries findById(Long id) {
        return countriesRepository.findById(id)
                .orElseThrow(() -> new CountriesNotFoundException("County not found!"));
    }

    @Override
    public Countries findByName(String name) {
        return countriesRepository.findByName(name)
                .orElseThrow(() -> new CountriesNotFoundException("County not found!"));
    }

    @Override
    public Countries save(Countries countries) {
        return countriesRepository.save(countries);
    }

    @Override
    public void deleteById (Long id) {
        countriesRepository.deleteById(id);
    }

}
