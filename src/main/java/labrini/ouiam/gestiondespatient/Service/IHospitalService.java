package labrini.ouiam.gestiondespatient.Service;

import labrini.ouiam.gestiondespatient.entities.Consultation;
import labrini.ouiam.gestiondespatient.entities.Medecin;
import labrini.ouiam.gestiondespatient.entities.Patient;
import labrini.ouiam.gestiondespatient.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}
