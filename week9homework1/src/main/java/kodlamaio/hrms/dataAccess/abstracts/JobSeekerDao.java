package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.JobSeeker;


public interface JobSeekerDao extends JpaRepository <JobSeeker,Integer>{
boolean existsByUserEPosta(String ePosta);
boolean existsByJobSeekerNationalityId(String nationalityId);
}
