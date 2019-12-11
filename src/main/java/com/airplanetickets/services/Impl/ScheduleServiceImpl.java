package com.airplanetickets.services.Impl;

import com.airplanetickets.data.domain.Schedule;
import com.airplanetickets.data.repository.ScheduleRepository;
import com.airplanetickets.exceptions.ClientNotFoundException;
import com.airplanetickets.exceptions.ScheduleNotFoundException;
import com.airplanetickets.services.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository scheduleRepository;

    @Override
    public Schedule findById(Long id) {
        return scheduleRepository.findById(id)
                .orElseThrow(() -> new ScheduleNotFoundException("Schedule not found!"));
    }

    @Override
    public List<Schedule> findByDepartureDate(LocalDate departureDate) {
        return scheduleRepository.findByDepartureDate(departureDate);
    }

    @Override
    public List<Schedule> findByTime(LocalDateTime time) {
        return scheduleRepository.findByTime(time);
    }

    @Override
    public Schedule save(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    @Override
    public void deleteById(Long id) {
        scheduleRepository.deleteById(id);
    }
}
