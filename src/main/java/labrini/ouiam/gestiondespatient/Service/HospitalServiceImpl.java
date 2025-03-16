package labrini.ouiam.gestiondespatient.Service;

import jakarta.transaction.Transactional;
import labrini.ouiam.gestiondespatient.entities.Consultation;
import labrini.ouiam.gestiondespatient.entities.Medecin;
import labrini.ouiam.gestiondespatient.entities.Patient;
import labrini.ouiam.gestiondespatient.entities.RendezVous;
import labrini.ouiam.gestiondespatient.repositories.ConsultationRepository;
import labrini.ouiam.gestiondespatient.repositories.MedcinRepository;
import labrini.ouiam.gestiondespatient.repositories.PatientRepository;
import labrini.ouiam.gestiondespatient.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;

@Service
 @Transactional
public class HospitalServiceImpl implements IHospitalService {

    private PatientRepository patientRepository;
    private ConsultationRepository consultationRepository;
    private RendezVousRepository rendezVousRepository;
    private MedcinRepository medecinRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, ConsultationRepository consultationRepository, RendezVousRepository rendezVousRepository, MedcinRepository medecinRepository) {
        this.patientRepository = patientRepository;
        this.consultationRepository = consultationRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.medecinRepository = medecinRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {

        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {

        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {

        return consultationRepository.save(consultation);
    }
}
