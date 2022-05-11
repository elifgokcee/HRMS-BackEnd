package kodlamaio.hrms.business.concrete;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import kodlamaio.hrms.business.abstracts.CurriculumVitaeService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessDataResult;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CurriculumVitaeDao;
import kodlamaio.hrms.entities.concrete.CurriculumVitae;



@Service
public class CurriculumVitaeManager implements CurriculumVitaeService{
private CurriculumVitaeDao dao;

@Autowired
public CurriculumVitaeManager(CurriculumVitaeDao dao) {
	super();
	this.dao=dao;
	
}
	@Override
	public Result add(CurriculumVitae vitae) {
		this.dao.save(vitae);
		
		return new SuccessResult("Özgeçmiş eklendi");
	}

	@Override
	public Result delete(@PathVariable int id) {
		this.dao.delete(dao.findById(id));
		
		return new SuccessResult("Özgeçmiş kaldırıldı");
	}
	@Override
	public DataResult<List<CurriculumVitae>> getAll() {
		return new SuccessDataResult<List<CurriculumVitae>>(this.dao.findAll(),"Tüm özgeçmişlerim:");
	}
	@Override
	public DataResult<List<CurriculumVitae>> getByJobSeekerId(int seekerId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<CurriculumVitae>>(dao.getByJobSeeker_UserId(seekerId),"Kullanıcı özgeçmişleri");
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}