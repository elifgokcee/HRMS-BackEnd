package kodlamaio.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import kodlamaio.hrms.business.abstracts.CoverLetterService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessDataResult;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CoverLetterDao;
import kodlamaio.hrms.entities.concrete.CoverLetter;
@Service
public class CoverLetterManager implements CoverLetterService {
	private CoverLetterDao dao;
	@Autowired
public CoverLetterManager(CoverLetterDao dao) {
	this.dao=dao;
}
	@Override
	public Result add(CoverLetter letter) {
	this.dao.save(letter);
	return new SuccessResult("Önyazı eklendi");
	
		
	}

	@Override
	public Result delete(int id) {
		dao.delete(dao.findById(id));
		return new SuccessResult("Önyazı silindi");
		
	}

	@Override
	public Result update(int letterId,String text) {
		
		(dao.findById(letterId)).setLetter(text);
	dao.save(dao.findById(letterId));
		return new SuccessResult("Önyazı güncellendi");
		
	}
	@Override
	public DataResult<List<CoverLetter>> getAll() {
		
		return new SuccessDataResult<List<CoverLetter>>(dao.findAll());
	}
	@Override
	public CoverLetter findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

}
