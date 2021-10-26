package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.concrete.Employer;
@Repository
public interface EmployerDao extends JpaRepository<Employer,Integer>{
boolean existsByUserEPosta(String ePosta);
 
}
