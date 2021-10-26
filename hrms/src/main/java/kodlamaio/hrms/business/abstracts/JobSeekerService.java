package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.entities.concrete.JobSeeker;

public interface JobSeekerService {
	public Result save(JobSeeker jobSeeker);
	DataResult<List<JobSeeker>>getAll();

}
