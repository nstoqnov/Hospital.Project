package hospitalweb.Services;

import hospitalweb.Dao.DoctorDao;
import hospitalweb.entities.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService{

    @Autowired
    DoctorDao doctorDao;

    @Override
    public void register(Doctor doctor) {
        doctorDao.saveAndFlush(doctor);
    }

    @Override
    public Doctor retrieve(long id) {

        return doctorDao.findOne(id);
    }
}
