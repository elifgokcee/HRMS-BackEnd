package kodlamaio.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UniversityService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.UniversityDao;
import kodlamaio.hrms.entities.concrete.University;
@Service
public class UniversityManager implements UniversityService {

private UniversityDao dao;
@Autowired
public UniversityManager(UniversityDao dao) {
	super();
	this.dao=dao;
}
	@Override
	public DataResult<List<University>> getAll() {
		return new SuccessDataResult<List<University>>(this.dao.findAll());
	}

}
