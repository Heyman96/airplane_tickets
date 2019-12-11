package com.airplanetickets.services;

import com.airplanetickets.data.domain.Seats;


public interface SeatsService {

    Seats findById(Long id);

    Seats findBySeatNumber(int seatNumber);

    Seats save(Seats seats);

    void deleteById(Long id);

}
