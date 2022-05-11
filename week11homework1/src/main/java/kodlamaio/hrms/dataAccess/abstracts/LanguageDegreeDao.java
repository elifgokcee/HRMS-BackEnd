package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.LanguageDegree;

public interface LanguageDegreeDao extends JpaRepository<LanguageDegree,Integer>{

}
