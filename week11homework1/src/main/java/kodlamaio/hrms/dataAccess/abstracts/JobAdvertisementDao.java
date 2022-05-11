package kodlamaio.hrms.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import kodlamaio.hrms.entities.concrete.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.EmployerWithJobAdvertisementDto;

public interface JobAdvertisementDao extends JpaRepository <JobAdvertisement ,Integer>{
	public JobAdvertisement findById(int id);
	@Query("Select new kodlamaio.hrms.entities.dtos.EmployerWithJobAdvertisementDto"
			+"(a.id,e.companyName,p.jobName,a.numberOfPositions,a.releaseDate,a.lastApplicationDate,a.explanation)"
            +"FROM JobAdvertisement  a LEFT JOIN a.employer  e left join a.title  p"
            + " where a.jobStatus=true ")
	List<EmployerWithJobAdvertisementDto> getByJobStatus();

	@Query("Select new kodlamaio.hrms.entities.dtos.EmployerWithJobAdvertisementDto"
			+"(a.id,e.companyName,p.jobName,a.numberOfPositions,a.releaseDate,a.lastApplicationDate,a.explanation)"
             +"FROM JobAdvertisement  a Inner JOIN a.employer  e Inner join a.title  p "
             + " where a.jobStatus=true and e.companyName=:companyName")
	List<EmployerWithJobAdvertisementDto> getByJobStatusAndCompanyName(@Param("companyName")String companyName);
	
	
	  @Query("Select new kodlamaio.hrms.entities.dtos.EmployerWithJobAdvertisementDto"
	  +"(a.id,e.companyName,p.jobName,a.numberOfPositions,a.releaseDate,a.lastApplicationDate,a.explanation)"
	  +"FROM JobAdvertisement  a Left JOIN a.employer  e left join a.title  p" +
	  " where a.jobStatus=true Order By a.releaseDate DESC")
	  List<EmployerWithJobAdvertisementDto> getByJobStatusOrderByReleaseDateDesc();
	  @Modifying
	  @Transactional
	  @Query("Update JobAdvertisement e Set e.jobStatus=false")
	  public void updateStatusToFalse(JobAdvertisement jobAdvertisement);
	  
	  @Modifying
	  @Transactional
	  @Query("Update JobAdvertisement e Set e.jobStatus=true")
	  public void updateStatusToTrue(JobAdvertisement jobAdvertisement);
}
