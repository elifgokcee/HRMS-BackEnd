package kodlamaio.hrms.business.concrete;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobExperienceService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessDataResult;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobExperienceDao;
import kodlamaio.hrms.entities.concrete.JobExperience;
@Service
public class JobExperienceManager implements JobExperienceService {

	private JobExperienceDao dao;
	@Autowired
	public JobExperienceManager (JobExperienceDao dao) {
		this.dao=dao;
	}
	@Override
	public Result add(JobExperience experience) {
		dao.save(experience);
		return new SuccessResult("Added work experience.");
		
	}

	@Override
	public DataResult<List<JobExperience>> getAllJobExperience() {
		
		return new SuccessDataResult<>(dao.findAllOrderByWorkFinishDateAsc(),"Work experiences:");
	}

}
