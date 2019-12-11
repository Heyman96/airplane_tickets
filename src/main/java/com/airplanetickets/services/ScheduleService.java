package com.airplanetickets.services;

import com.airplanetickets.data.domain.Schedule;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ScheduleService {

    Schedule findById(Long id);

    List<Schedule> findByDepartureDate(LocalDate departureDate);

    List<Schedule> findByTime(LocalDateTime time);

    Schedule save(Schedule schedule);

    void deleteById(Long id);

}
