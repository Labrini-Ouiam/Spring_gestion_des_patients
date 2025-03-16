package labrini.ouiam.gestiondespatient.repositories;

import labrini.ouiam.gestiondespatient.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
