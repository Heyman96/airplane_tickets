package com.airplanetickets.data.repository;

import com.airplanetickets.data.domain.Seats;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SeatsRepository extends JpaRepository<Seats, Long> {

    Optional<Seats> findBySeatNumber(int seatNumber);

}