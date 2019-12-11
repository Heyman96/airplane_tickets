package com.airplanetickets.services.Impl;

import com.airplanetickets.data.domain.Airplane;
import com.airplanetickets.data.repository.AirplaneRepository;
import com.airplanetickets.exceptions.AirplaneNotFoundException;
import com.airplanetickets.services.AirplaneService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AirplaneServiceImpl implements AirplaneService {

    private final AirplaneRepository airplaneRepository;

    @Override
    public Airplane findById(Long id) {
        return airplaneRepository.findById(id)
                .orElseThrow(() -> new AirplaneNotFoundException("Airplane not found!"));
    }

    @Override
    public List<Airplane> findByName(String name) {
        return airplaneRepository.findByName(name);
    }

    @Override
    public Airplane save(Airplane airplane) {
        return airplaneRepository.save(airplane);
    }

    @Override
    public void deleteById(Long id) {
        airplaneRepository.deleteById(id);
    }

}
