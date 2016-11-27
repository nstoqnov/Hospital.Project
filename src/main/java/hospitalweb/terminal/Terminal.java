package hospitalweb.terminal;

import hospitalweb.Services.DoctorService;
import hospitalweb.Services.PacientService;
import hospitalweb.entities.Doctor;
import hospitalweb.entities.Pacient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Terminal implements CommandLineRunner {
    @Autowired
    DoctorService doctorService;

    @Autowired
    PacientService pacientService;

    @Override
    public void run(String... strings) throws Exception {

        Doctor doctor = new Doctor();
        doctor.setDoctorSpecialization("bashDoctor");
        doctor.setEgn("9601019082");
        doctor.setName("Pesho");
        doctor.setNickName("peshoasd");
        doctor.setPassword("1234");

        Pacient pacient = new Pacient();
        pacient.setName("Gosho");
        pacient.setNickName("goshoasd");
        pacient.setEgn("981212");
        pacient.setPassword("1234");
        pacient.setIllness("Skleroza");

        doctorService.register(doctor);
        pacientService.register(pacient);
    }
}
