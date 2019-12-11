package com.airplanetickets.services;

import com.airplanetickets.data.domain.PassportData;

import java.time.LocalDate;
import java.util.List;

public interface PassportDataService {

    PassportData findById(Long id);

    List<PassportData> findByPassportSeries(String passportSeries);

    PassportData findByPassportNumber(Long passportNumber);

    List<PassportData> findByBirthDate(LocalDate birthDate);

    List<PassportData> findByBirthPlace(String birthPlace);

    List<PassportData> findBySex(Character sex);

    PassportData findByIssuePlace(String issuePlace);

    List<PassportData> findByIssueDate(LocalDate issueDate);

    List<PassportData> findByRegistration(String registration);

    PassportData save(PassportData passportData);

    void deleteById(Long id);

}
