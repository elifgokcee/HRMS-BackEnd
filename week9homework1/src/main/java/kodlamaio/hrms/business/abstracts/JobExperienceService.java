package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.entities.concrete.JobExperience;

public interface JobExperienceService {
public Result add(JobExperience experience);
DataResult<List<JobExperience>>  getAllJobExperience();


}
