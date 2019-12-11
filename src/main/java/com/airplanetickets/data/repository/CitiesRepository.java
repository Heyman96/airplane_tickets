package com.airplanetickets.data.repository;

import com.airplanetickets.data.domain.Cities;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CitiesRepository extends JpaRepository<Cities, Long> {

    Optional<Cities> findByName(String name);

}
