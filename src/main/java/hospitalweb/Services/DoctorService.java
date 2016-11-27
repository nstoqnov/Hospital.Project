package hospitalweb.Services;

import hospitalweb.entities.Doctor;

public interface DoctorService {
    void register(Doctor doctor);

    Doctor retrieve(long id);
}
