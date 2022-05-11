package kodlamaio.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CityService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CityDao;
import kodlamaio.hrms.entities.concrete.City;
@Service
public class CityManager implements CityService{
@Autowired
private CityDao dao;
	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(dao.findAll());
	}

}
