package com.airplanetickets.data.repository;

import com.airplanetickets.data.domain.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    List<Schedule> findByDepartureDate(LocalDate departureDate);

    List<Schedule> findByTime(LocalDateTime time);

    List<Schedule> findByPrice(Float price);

}