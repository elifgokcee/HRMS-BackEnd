package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.entities.concrete.University;

import java.util.List;

public interface UniversityService {
public DataResult<List<University>> getAll();
}
