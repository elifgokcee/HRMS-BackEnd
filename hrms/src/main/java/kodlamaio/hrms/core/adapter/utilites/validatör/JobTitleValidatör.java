package kodlamaio.hrms.core.adapter.utilites.validatör;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.adapter.utilites.results.ErrorResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.IJobTitleDao;
import kodlamaio.hrms.entities.concrete.JobTitle;
@Service
public class JobTitleValidatör {

	public Result jobTitleValidatör (JobTitle title,IJobTitleDao dao) {
		if(dao.existsByJobName(title.getJobName())) {
			return new ErrorResult("Aynı isimle meslek ismi eklenemez");
		}
		return new SuccessResult();
		
	}
		
	
}

