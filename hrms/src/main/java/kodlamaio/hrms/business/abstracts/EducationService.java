package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import java.util.List;
import kodlamaio.hrms.entities.concrete.Education;

public interface EducationService {
public Result add(Education education);
public Result delete(Education education);
public Result update(int educationId);
DataResult<List<Education>>getBySortedEducationDesc();
}
