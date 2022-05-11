package kodlamaio.hrms.core.adapter.utilites.validatör;



import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.adapter.utilites.results.ErrorResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concrete.Employer;
@Service
public class EmployerValidatör {
	
	

	public Result employerValidatör(Employer employer,EmployerDao dao) {
		if(employer.getCompanyName().isEmpty()) {
		
			return new ErrorResult("Şirket ismi boş bırakılamaz");
		}
		else if(employer.getCompanyWebsite().isEmpty()) {
			
			return new ErrorResult("Şirket websitesi  boş bırakılamaz");

		}
		else 	if(employer.getPassword().isEmpty()) {
		
			return new ErrorResult("Şifre boş bırakılamaz");

		}
		else if(employer.getTelephoneNumber().isEmpty()) {
			
			return new ErrorResult("Telefon boş bırakılamaz");

		}
		else if(!employer.getPasswordRepeat().equals(employer.getPassword())) {
			return new ErrorResult("Şifreler eşleşmelidir");

		}
		else if(dao.existsByUserEPosta(employer.getUserEPosta())) {
			
			return new ErrorResult("Bu e-posta kullanımdadır!");
			  
		}
	
		return new SuccessResult("Kullanıcı doğrulandı");
		
		
	

}
}