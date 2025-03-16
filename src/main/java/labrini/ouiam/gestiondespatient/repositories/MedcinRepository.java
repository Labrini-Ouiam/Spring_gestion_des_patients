package labrini.ouiam.gestiondespatient.repositories;

import labrini.ouiam.gestiondespatient.entities.Consultation;
import labrini.ouiam.gestiondespatient.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedcinRepository extends JpaRepository<Medecin, Long> {
    Medecin findByNom(String nom);
}
