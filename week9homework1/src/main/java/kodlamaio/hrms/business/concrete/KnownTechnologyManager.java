package kodlamaio.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.KnownTechnologyService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.KnownTechnologyDao;
import kodlamaio.hrms.entities.concrete.KnownTechnology;
@Service
public class KnownTechnologyManager implements KnownTechnologyService {
  private KnownTechnologyDao dao;
  @Autowired
  public KnownTechnologyManager(KnownTechnologyDao dao) {
	  this.dao=dao;
  }
	@Override
	public DataResult<List<KnownTechnology>> getAll() {
		
		return new SuccessDataResult<List<KnownTechnology>>(dao.findAll());
	}

	@Override
	public void add(KnownTechnology tech) {
		dao.save(tech);
		
	}
	

}
