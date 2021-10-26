package kodlamaio.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.business.abstracts.MailCheckservice;
import kodlamaio.hrms.business.abstracts.MernisCheckService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.ErrorResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessDataResult;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessResult;
import kodlamaio.hrms.core.adapter.utilites.validatör.JobSeekerValidatör;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concrete.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {
	private MailCheckservice mailCheckservice;
	private MernisCheckService mernisServiceAdapter;
	private JobSeekerDao dao;
	private JobSeekerValidatör validatör;

	@Autowired
	public JobSeekerManager(JobSeekerDao seekerDao, MailCheckservice mailService, MernisCheckService mernisService,
			JobSeekerValidatör validatör) {
		super();

		this.mailCheckservice = mailService;
		this.mernisServiceAdapter = mernisService;
		this.dao = seekerDao;
		this.validatör = validatör;
	}

	public Result save(JobSeeker jobseeker) {
		if (mailCheckservice.confirm(jobseeker) && mernisServiceAdapter.confirm(jobseeker)
				&& validatör.jobSeekerValidatör(jobseeker, dao).isSuccess()) {
			dao.save(jobseeker);
			return new SuccessResult("İş arayan kullanıcı mail doğrulaması ve  Mernis doğrulaması ile eklendi");
		}
		return new ErrorResult("Kullanıcı onaylanmadı ");
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.dao.findAll(), "İş arayan kullanıcılar listelendi");
	}
}
