package kodlamaio.hrms.business.concrete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CoverLetterService;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
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
	public Result delete(CoverLetter letter) {
		dao.delete(letter);
		return new SuccessResult("Önyazı silindi");
		
	}

	@Override
	public Result update(CoverLetter letter,String text) {
		
		letter.setCoverLetter(text);
		return new SuccessResult("Önyazı güncellendi");
		
	}

}
