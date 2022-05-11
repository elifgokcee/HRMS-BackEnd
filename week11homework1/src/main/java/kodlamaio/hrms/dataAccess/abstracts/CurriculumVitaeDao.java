package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.CurriculumVitae;
import java.util.List;

public interface CurriculumVitaeDao extends JpaRepository<CurriculumVitae,Integer>{
	List<CurriculumVitae> getByJobSeeker_UserId(int userId);
	public CurriculumVitae findById(int id);

}
