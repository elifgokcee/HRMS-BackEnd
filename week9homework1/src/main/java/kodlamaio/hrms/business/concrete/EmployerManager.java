package kodlamaio.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.business.abstracts.IPersonelConfirmCheckService;
import kodlamaio.hrms.business.abstracts.MailCheckservice;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.ErrorResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessDataResult;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessResult;
import kodlamaio.hrms.core.adapter.utilites.validatör.EmployerValidatör;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concrete.Employer;

@Service
public class EmployerManager implements EmployerService {
	private EmployerDao employerDao;
	private MailCheckservice mailCheckservice;
	private IPersonelConfirmCheckService service;
	private EmployerValidatör validatör;

	@Autowired
	public EmployerManager(EmployerDao employerDao, MailCheckservice mailCheckservice,
			IPersonelConfirmCheckService service, EmployerValidatör validatör) {
		super();
		this.mailCheckservice = mailCheckservice;
		this.service = service;
		this.employerDao = employerDao;
		this.validatör = validatör;

	}

	@Override
	public Result save(Employer employer) {
		if (mailCheckservice.confirm(employer) &&service.confirm(employer)
				&& validatör.employerValidatör(employer, this.employerDao).isSuccess()) {
			this.employerDao.save(employer);
			return new SuccessResult("İşveren kullanıcı sisteme personel onayı ve mail doğrulaması ile kaydedildi "
					+ employer.getCompanyName());
			
		}else {
			return new ErrorResult("Kullanıcı doğrulaması gerçekleştirilemedi");
			
		}
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "İşverenler listelendi");

	}
}