package com.airplanetickets.data.repository;

import com.airplanetickets.data.domain.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountriesRepository extends JpaRepository<Countries, Long> {

    Optional<Countries> findByName(String name);

}
