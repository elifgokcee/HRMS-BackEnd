package kodlamaio.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.IJobTitleService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.ErrorResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessDataResult;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessResult;
import kodlamaio.hrms.core.adapter.utilites.validatör.JobTitleValidatör;
import kodlamaio.hrms.dataAccess.abstracts.IJobTitleDao;
import kodlamaio.hrms.entities.concrete.JobTitle;
@Service
public class JobTitleManager implements IJobTitleService {
	private IJobTitleDao jobTitleDao;
	private JobTitleValidatör validatör;

	@Autowired
	public JobTitleManager(IJobTitleDao jobTitleDao, JobTitleValidatör validatör) {
        super();

		this.jobTitleDao = jobTitleDao;
		this.validatör=validatör;
	}
	

	@Override
	public Result add(JobTitle title) {
		if(validatör.jobTitleValidatör(title, jobTitleDao).isSuccess()) {
         jobTitleDao.save(title);
         return new SuccessResult("İş pozisyonu eklendi");
         }
		return new ErrorResult("Aynı isimde iş pozisyonu zaten mevcut");
		}

	@Override
	public DataResult<List<JobTitle>> getAll() {

		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(),"iş pozisyonları listelendi");
	}

}  