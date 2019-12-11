package com.airplanetickets.services;

import com.airplanetickets.data.domain.Phone;

public interface PhoneService {

    Phone findById(Long id);

    Phone findByPhoneNumber(String phoneNumber);

    Phone save(Phone phone);

    void deleteById(Long id);

}
