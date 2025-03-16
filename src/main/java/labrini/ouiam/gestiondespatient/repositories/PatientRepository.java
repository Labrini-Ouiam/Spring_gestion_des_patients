package labrini.ouiam.gestiondespatient.repositories;

import labrini.ouiam.gestiondespatient.entities.Consultation;
import labrini.ouiam.gestiondespatient.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByNom(String nom);
}
