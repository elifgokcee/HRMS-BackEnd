package kodlamaio.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.KnownLanguageService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.KnownLanguageDao;
import kodlamaio.hrms.entities.concrete.KnownLanguage;
@Service

public class KnownLanguageManager implements KnownLanguageService {

	private KnownLanguageDao dao;
	@Autowired
	public KnownLanguageManager(KnownLanguageDao dao){
		this.dao=dao;
	}
	@Override
	public void add(KnownLanguage language) {
		dao.save(language);
		
	}
	@Override
	public DataResult<List<KnownLanguage>> getAll() {
		return new SuccessDataResult<List<KnownLanguage>>(dao.findAll());
	}

}
