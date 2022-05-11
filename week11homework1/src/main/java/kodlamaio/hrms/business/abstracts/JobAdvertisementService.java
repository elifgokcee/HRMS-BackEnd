package kodlamaio.hrms.business.abstracts;

import java.util.List;



import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.entities.concrete.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.EmployerWithJobAdvertisementDto;

public interface JobAdvertisementService {
	public DataResult<JobAdvertisement> getById(int id);
	public Result add( JobAdvertisement  jobAdvertisement);
	public Result updateJobStatuToFalse( JobAdvertisement  jobAdvertisement);
	public Result updateJobStatuToTrue( JobAdvertisement  jobAdvertisement);
	public Result update(int advertId);
    DataResult<List<EmployerWithJobAdvertisementDto>> getByJobStatus();
	DataResult<List<EmployerWithJobAdvertisementDto>> getByJobStatusAndCompanyName(String companyName);
	DataResult<List<EmployerWithJobAdvertisementDto>>getByJobStatusOrderByReleaseDateDesc();
	
}
