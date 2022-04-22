package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.Languages;

public interface LanguageDao extends JpaRepository<Languages,Integer>{

}
