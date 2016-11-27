package hospitalweb.Dao;

import hospitalweb.entities.Pacient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacientDao extends JpaRepository<Pacient,Long> {
}
