package kodlamaio.hrms.business.concrete;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.MailCheckservice;
import kodlamaio.hrms.entities.concrete.User;
@Service
public class MailCheckManager implements MailCheckservice{
	

	@Override
	public boolean confirm(User user) {
             System.out.println("Mail doğrulandı") ;
             return true;
	}

}
