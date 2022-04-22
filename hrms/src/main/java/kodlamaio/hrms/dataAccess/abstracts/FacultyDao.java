package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.Faculty;

public interface FacultyDao  extends JpaRepository<Faculty,Integer>{

}
