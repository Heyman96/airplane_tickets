package com.airplanetickets.services.Impl;

import com.airplanetickets.data.domain.PassportData;
import com.airplanetickets.data.repository.PassportDataRepository;
import com.airplanetickets.exceptions.PassportDataNotFoundException;
import com.airplanetickets.services.PassportDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
@RequiredArgsConstructor
public class PassportDataServiceImpl implements PassportDataService {

    private final PassportDataRepository passportDataRepository;

    @Override
    public PassportData findById(Long id) {
        return passportDataRepository.findById(id)
                .orElseThrow(() -> new PassportDataNotFoundException("Passport data not found!"));
    }

    @Override
    public List<PassportData> findByPassportSeries(String passportSeries) {
        return passportDataRepository.findByPassportSeries(passportSeries);
    }

    @Override
    public PassportData findByPassportNumber(Long passportNumber) {
        return passportDataRepository.findByPassportNumber(passportNumber)
                .orElseThrow(() -> new PassportDataNotFoundException("Passport number data not found!"));
    }

    @Override
    public List<PassportData> findByBirthDate(LocalDate birthDate) {
        return passportDataRepository.findByBirthDate(birthDate);
    }

    @Override
    public List<PassportData> findByBirthPlace(String birthPlace) {
        return passportDataRepository.findByBirthPlace(birthPlace);
    }

    @Override
    public List<PassportData> findBySex(Character sex) {
        return passportDataRepository.findBySex(sex);
    }

    @Override
    public PassportData findByIssuePlace(String issuePlace) {
        return passportDataRepository.findByIssuePlace(issuePlace)
                .orElseThrow(() -> new PassportDataNotFoundException("Issue place not found!"));
    }

    @Override
    public List<PassportData> findByIssueDate(LocalDate issueDate) {
        return passportDataRepository.findByIssueDate(issueDate);
    }

    @Override
    public List<PassportData> findByRegistration(String registration) {
        return passportDataRepository.findByRegistration(registration);
    }

    @Override
    public PassportData save(PassportData passportData) {
        return passportDataRepository.save(passportData);
    }

    @Override
    public void deleteById(Long id) {
        passportDataRepository.deleteById(id);
    }
}
