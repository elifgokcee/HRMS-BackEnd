package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concrete.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience ,Integer> {
	
	 @Query("Select a From JobExperience a order by a.workFinishDate")
			  
List <JobExperience> findAllOrderByWorkFinishDateAsc();

}
