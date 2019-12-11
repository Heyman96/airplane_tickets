package com.airplanetickets.services.Impl;

import com.airplanetickets.data.domain.Phone;
import com.airplanetickets.data.repository.PhoneRepository;
import com.airplanetickets.exceptions.ClientNotFoundException;
import com.airplanetickets.services.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PhoneServiceImpl implements PhoneService {

    private final PhoneRepository phoneRepository;

    @Override
    public Phone findById(Long id) {
        return phoneRepository.findById(id)
                .orElseThrow(() -> new ClientNotFoundException("Phone not found!"));
    }

    @Override
    public Phone findByPhoneNumber(String phoneNumber) {
        return phoneRepository.findByPhoneNumber(phoneNumber)
                .orElseThrow(() -> new ClientNotFoundException("Phone number not found!"));
    }

    @Override
    public Phone save(Phone phone) {
        return phoneRepository.save(phone);
    }

    @Override
    public void deleteById(Long id) {
        phoneRepository.deleteById(id);
    }
}
