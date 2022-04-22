package kodlamaio.hrms.business.concrete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.FacultyDao;
import kodlamaio.hrms.entities.concrete.Faculty;

@Service
public class FacultyManager {
	@Autowired
	private FacultyDao dao;
public Result add(Faculty faculty) {
  this.dao.save(faculty);
  return new SuccessResult();
}
}
