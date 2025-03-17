package labrini.ouiam.gestiondespatient.web;

import labrini.ouiam.gestiondespatient.entities.Patient;
import labrini.ouiam.gestiondespatient.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class PatientRestController {
    @Autowired
    private PatientRepository patientRepository;
    @GetMapping("/patients")
    public List<Patient> PatientList() {
        return patientRepository.findAll();
    }
}
