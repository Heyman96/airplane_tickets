package com.airplanetickets.services;

import com.airplanetickets.data.domain.Airplane;

import java.util.List;

public interface AirplaneService {

    Airplane findById(Long id);

    List<Airplane> findByName(String name);

    Airplane save(Airplane airplane);

    void deleteById(Long id);

}
