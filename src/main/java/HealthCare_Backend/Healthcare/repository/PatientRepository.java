package HealthCare_Backend.Healthcare.repository;

import HealthCare_Backend.Healthcare.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientEntity, Long> {

}
