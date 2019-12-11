package com.airplanetickets.services.Impl;

import com.airplanetickets.data.domain.Schedule;
import com.airplanetickets.data.domain.Seats;
import com.airplanetickets.data.repository.SeatsRepository;
import com.airplanetickets.exceptions.ScheduleNotFoundException;
import com.airplanetickets.exceptions.SeatsNotFoundException;
import com.airplanetickets.services.SeatsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class SeatsServiceImpl implements SeatsService {

    private final SeatsRepository seatsRepository;

    @Override
    public Seats findById(Long id) {
        return seatsRepository.findById(id)
                .orElseThrow(() -> new SeatsNotFoundException("Schedule not found!"));
    }

    @Override
    public Seats findBySeatNumber(int seatNumber) {
        return seatsRepository.findBySeatNumber(seatNumber)
                .orElseThrow(() -> new SeatsNotFoundException("Seat number not found!"));
    }

    @Override
    public Seats save(Seats seats) {
        return seatsRepository.save(seats);
    }

    @Override
    public void deleteById(Long id) {
        seatsRepository.deleteById(id);
    }
}
