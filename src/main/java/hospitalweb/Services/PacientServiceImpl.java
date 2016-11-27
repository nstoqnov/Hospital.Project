package hospitalweb.Services;

import hospitalweb.Dao.PacientDao;
import hospitalweb.entities.Pacient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacientServiceImpl implements PacientService {

    @Autowired
    PacientDao pacientDao;

    @Override
    public void register(Pacient pacient) {
        pacientDao.saveAndFlush(pacient);
    }

    @Override
    public Pacient retrieve(long id) {
        return pacientDao.findOne(id);
    }
}
