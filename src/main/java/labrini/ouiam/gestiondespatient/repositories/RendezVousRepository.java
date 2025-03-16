package labrini.ouiam.gestiondespatient.repositories;

import labrini.ouiam.gestiondespatient.entities.Consultation;
import labrini.ouiam.gestiondespatient.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous, Long> {
}
