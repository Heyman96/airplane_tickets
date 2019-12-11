package com.airplanetickets.data.repository;

import com.airplanetickets.data.domain.Flights;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightsRepository extends JpaRepository<Flights, Long> {
}
