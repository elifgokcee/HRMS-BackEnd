package kodlamaio.hrms.core.adapter.externalservices;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.MernisCheckService;
import kodlamaio.hrms.entities.concrete.User;
@Service
public class MernisServiceAdapter implements MernisCheckService {

	
	@Override
	
	public boolean confirm(User user) {
		
			return true ;
	}}

