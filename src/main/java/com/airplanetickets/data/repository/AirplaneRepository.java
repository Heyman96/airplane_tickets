package com.airplanetickets.data.repository;

import com.airplanetickets.data.domain.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AirplaneRepository extends JpaRepository<Airplane, Long> {

    List<Airplane> findByName(String name);

}
