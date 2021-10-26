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
		if(employer.getCompanyWebsite().isEmpty()) {

			return new ErrorResult("Şirket websitesi  boş bırakılamaz");

		}
		if(employer.getPassword().isEmpty()) {
			return new ErrorResult("Şifre boş bırakılamaz");

		}
		if(employer.getTelephoneNumber().isEmpty()) {
			return new ErrorResult("Telefon boş bırakılamaz");

		}
		if(employer.getPasswordRepeat()!=employer.getPassword()) {
			return new ErrorResult("Şifreler eşleşmelidir");

		}
		if(dao.existsByUserEPosta(employer.getUserEPosta())) {
			return new ErrorResult("Bu e-posta kullanımdadır!");

		}
		String x=employer.getCompanyWebsite().substring(4,employer.getCompanyWebsite().length()
				-(employer.getCompanyWebsite().indexOf(".com")-4));
		if(!employer.getUserEPosta().contains(x)) {
			return new ErrorResult("E-postanız websiteniz ile aynı domaine sahiip olmalıdır");
		}
		return new SuccessResult();
		
		
	

}
}