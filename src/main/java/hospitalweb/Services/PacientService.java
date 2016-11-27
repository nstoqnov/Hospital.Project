package hospitalweb.Services;

import hospitalweb.entities.Doctor;
import hospitalweb.entities.Pacient;

public interface PacientService {
    void register(Pacient pacient);

    Pacient retrieve(long id);
}
