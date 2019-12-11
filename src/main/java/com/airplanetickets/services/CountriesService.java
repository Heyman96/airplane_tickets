package com.airplanetickets.services;

import com.airplanetickets.data.domain.Countries;

public interface CountriesService {

    Countries findById(Long id);

    Countries findByName(String name);

    Countries save(Countries countries);

    void deleteById(Long id);

}
