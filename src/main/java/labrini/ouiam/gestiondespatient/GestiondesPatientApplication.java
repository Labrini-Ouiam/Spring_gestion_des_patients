package labrini.ouiam.gestiondespatient;

import labrini.ouiam.gestiondespatient.entities.*;
import labrini.ouiam.gestiondespatient.repositories.ConsultationRepository;
import labrini.ouiam.gestiondespatient.repositories.MedcinRepository;
import labrini.ouiam.gestiondespatient.repositories.PatientRepository;
import labrini.ouiam.gestiondespatient.repositories.RendezVousRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class GestiondesPatientApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestiondesPatientApplication.class, args);
    }

    @Bean
    CommandLineRunner start(PatientRepository patientRepository, MedcinRepository medcinRepository, RendezVousRepository rendezVousRepository , ConsultationRepository consultationRepository) {
        return args -> {
            Stream.of("OUIAM","KAWTAR","RABIAA")
                    .forEach(name -> {
                        Patient patient = new Patient();
                        patient.setNom(name);
                        patient.setMalade(false);
                        patient.setDateNaissance(new Date());
                        patientRepository.save(patient);
                    });

            Stream.of("Lahcen","mourad","jihane")
                    .forEach(name -> {
                        Medecin medecin = new Medecin();
                        medecin.setNom(name);
                        medecin.setEmail(name+"@gmail.com");
                        medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
                        medcinRepository.save(medecin);
                    });

            Patient patient = patientRepository.findById(1L).orElse(null);
            Patient patient2 = patientRepository.findByNom("KAWTAR");

            Medecin medecin=medcinRepository.findByNom("Lahcen");


            RendezVous rendezVous=new RendezVous();
            rendezVous.setMedecin(medecin);
            rendezVous.setPatient(patient);
            rendezVous.setStatus(StatusRDV.PENDING);
            rendezVous.setDate(new Date());
            rendezVousRepository.save(rendezVous);


            RendezVous rendezVous2=rendezVousRepository.findById(1L).orElse(null);
            Consultation consultation=new Consultation();
            consultation.setDateConsultation(new Date());
            consultation.setRendezVous(rendezVous2);
            consultation.setRapport("Rapport de consultation .......");
            consultationRepository.save(consultation);


        };
    }

}
