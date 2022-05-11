package kodlamaio.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EducationService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessDataResult;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EducationDao;
import kodlamaio.hrms.entities.concrete.Education;
@Service
public class EducationManager implements EducationService {
	
private EducationDao dao;
@Autowired
	public EducationManager(EducationDao dao){
	super();
		this.dao=dao;
	}
	@Override
	public Result add(Education education) {
		dao.save(education);
		return new SuccessResult("Eğitim bilgisi eklendi");
	}

	@Override
	public Result delete(int eduId) {
		dao.deleteById(eduId);
		return new SuccessResult("Eğitim bilgisi silindi");
	}

	@Override
	public Result update(int eduId) {
		Education education=dao.getById(eduId);
		dao.save(education);
		dao.delete(dao.getById(eduId));
		return new SuccessResult("Eğitim bilgisi güncellendi");
		}

	@Override
	public DataResult<List<Education>> getBySortedEducationDesc() {
		
		return new SuccessDataResult<List<Education>>(dao.getAllByOrderByStartDateAsc(),"Sıralandı");
	}

}
