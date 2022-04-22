package kodlamaio.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessDataResult;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concrete.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.EmployerWithJobAdvertisementDto;
@Service
public class JobAdvertisementManager implements JobAdvertisementService{
	private JobAdvertisementDao dao;
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao dao) {
		super();
		this.dao=dao;
	}
	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.dao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı eklenmiştir");
	
	}

	@Override
	public DataResult<List<EmployerWithJobAdvertisementDto>> getByJobStatus() {
		return new SuccessDataResult<List<EmployerWithJobAdvertisementDto>>(dao.getByJobStatus(),
				"Tüm aktif iş ilanları listelenmektedir");
	}

	@Override
	public DataResult<List<EmployerWithJobAdvertisementDto>> getByJobStatusAndCompanyName(String companyName) {
		return new SuccessDataResult<List<EmployerWithJobAdvertisementDto>>
		(dao.getByJobStatusAndCompanyName(companyName));
		
	}

	
	
	  @Override public DataResult<List<EmployerWithJobAdvertisementDto>>
	  getByJobStatusOrderByReleaseDateDesc() { return new
	  SuccessDataResult<List<EmployerWithJobAdvertisementDto>>
	  (dao.getByJobStatusOrderByReleaseDateDesc()
	  ,"En yeni iş ilanından itibaren aktif ilanlar sıralanmıştır"); }
	 
	@Override
	public Result updateJobStatuToFalse(JobAdvertisement jobAdvertisement) {
		jobAdvertisement.setJobStatus(false);
		dao.updateStatusToFalse(jobAdvertisement);
		return new SuccessResult("İlan pasif hale getirilmiştir");
	}
	@Override
	public Result updateJobStatuToTrue(JobAdvertisement jobAdvertisement) {
		jobAdvertisement.setJobStatus(true);
		dao.updateStatusToTrue(jobAdvertisement);
		return new SuccessResult("İlan aktif hale getirilmiştir");
	}
public Result update(int advertId) {
	
	JobAdvertisement advertisement=this.dao.getById(advertId);
	dao.save(advertisement);
	dao.delete(this.dao.getById(advertId));
	return new SuccessResult("İlan güncel hale getirilmiştir");
	
	
	
	
	
	
	
	
}

}
