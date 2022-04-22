package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.University;

public interface UniversityDao extends JpaRepository<University,Integer>{

}
