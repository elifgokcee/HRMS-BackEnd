package kodlamaio.hrms.business.concrete;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.IPersonelConfirmCheckService;
import kodlamaio.hrms.entities.concrete.User;
@Service
public class PersonelConfirmManager implements IPersonelConfirmCheckService{
	
	@Override
	public Boolean confirm(User user) {
		return true;
	}

}
