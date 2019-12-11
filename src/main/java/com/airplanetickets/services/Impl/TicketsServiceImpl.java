package com.airplanetickets.services.Impl;

import com.airplanetickets.data.domain.Seats;
import com.airplanetickets.data.domain.Tickets;
import com.airplanetickets.data.repository.TicketsRepository;
import com.airplanetickets.exceptions.TicketsNotFoundException;
import com.airplanetickets.services.TicketsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Service
@RequiredArgsConstructor
public class TicketsServiceImpl implements TicketsService {

    private final TicketsRepository ticketsRepository;

    @Override
    @Transactional
    public Tickets findById(Long id) {
        return ticketsRepository.findById(id)
                .orElseThrow(() -> new TicketsNotFoundException("Ticket not found!"));
    }

    @Override
    public List<Tickets> findBySaleDate(LocalDate saleDate) {
        return ticketsRepository.findBySaleDate(saleDate);
    }

    @Override
    public Tickets save(Tickets seats) {
        return ticketsRepository.save(seats);
    }

    @Override
    public void deleteById(Long id) {
        ticketsRepository.deleteById(id);
    }
}
