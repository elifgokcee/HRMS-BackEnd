package kodlamaio.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.LanguageDegreeService;
import kodlamaio.hrms.dataAccess.abstracts.LanguageDegreeDao;
import kodlamaio.hrms.entities.concrete.LanguageDegree;
@Service
public class LanguageDegreeManager implements LanguageDegreeService{
@Autowired
private LanguageDegreeDao dao;
	@Override
	public List<LanguageDegree> getAll() {
		
		return dao.findAll();
	}

}
