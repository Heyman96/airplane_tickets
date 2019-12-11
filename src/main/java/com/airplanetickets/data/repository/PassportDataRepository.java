package com.airplanetickets.data.repository;

import com.airplanetickets.data.domain.PassportData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface PassportDataRepository extends JpaRepository<PassportData, Long> {

    List<PassportData> findByPassportSeries(String passportSeries);

    Optional<PassportData> findByPassportNumber(Long passportNumber);

    List<PassportData> findByBirthDate(LocalDate birthDate);

    List<PassportData> findByBirthPlace(String birthPlace);

    List<PassportData> findBySex(Character sex);

    Optional<PassportData> findByIssuePlace(String issuePlace);

    List<PassportData> findByIssueDate(LocalDate issueDate);

    List<PassportData> findByRegistration(String registration);
}
