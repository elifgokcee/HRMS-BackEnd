package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.entities.concrete.Employer;
import kodlamaio.hrms.core.adapter.utilites.results.Result;


public interface EmployerService {
	public Result save(Employer employer);
	DataResult<List<Employer>>getAll();
    
}
