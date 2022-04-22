package kodlamaio.hrms.business.concrete;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public Result delete(CurriculumVitae vitae) {
		this.dao.delete(vitae);
		
		return new SuccessResult("Özgeçmiş kaldırıldı");
	}
	@Override
	public DataResult<List<CurriculumVitae>> getAll() {
		return new SuccessDataResult<List<CurriculumVitae>>(this.dao.findAll(),"Tüm özgeçmişlerim:");
	}
	@Override
	public DataResult<CurriculumVitae> getByJobSeekerId(int seekerId){
		return new SuccessDataResult<CurriculumVitae>(this.dao.getById(seekerId),"Kullanıcı özgeçmişi:");
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}