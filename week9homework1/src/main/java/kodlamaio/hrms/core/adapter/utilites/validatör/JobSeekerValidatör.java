package kodlamaio.hrms.core.adapter.utilites.validatör;


import org.springframework.stereotype.Service;
import kodlamaio.hrms.core.adapter.utilites.results.ErrorResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concrete.JobSeeker;
@Service
public class JobSeekerValidatör {

	

		public Result jobSeekerValidatör(JobSeeker  jobSeeker,JobSeekerDao dao) {
			if(jobSeeker.getJobSeekerName().isEmpty()) {
				return new ErrorResult("İsim boş bırakılamaz! ");
			}
			if(jobSeeker.getJobSeekerSurname().isEmpty())
			{
				return new ErrorResult("Soy isim boş bırakılamaz! ");
				
			}
			if(String.valueOf(jobSeeker.getJobSeekerBirthyear()).isEmpty()
			||String.valueOf(jobSeeker.getJobSeekerBirthyear()).length()!=4) {
				return new ErrorResult("Doğum yılı boş bırakılamaz ve dört haneli olmalıdır. ");
			}
			if(jobSeeker.getPassword().isEmpty()||jobSeeker.getPassword().length()<6)
			{
				return new ErrorResult("En az altı haneli bir şifre girmelisiniz ");
			}
			
			if(jobSeeker.getJobSeekerNationalityId().isEmpty()||jobSeeker.getJobSeekerNationalityId().length()!=11) {
				return new ErrorResult("TC boş bırakılamaz ve 11 haneli olmalıdır! ");
			}
			
			if(jobSeeker.getUserEPosta().isEmpty()) {
				return new ErrorResult("E-posta girmelisiniz ");
			}
			if(dao.existsByUserEPosta(jobSeeker.getUserEPosta())) {
				return new ErrorResult("Bu e-posta kullanımdadır ");
			}
			
			
			if(dao.existsByJobSeekerNationalityId(jobSeeker.getJobSeekerNationalityId())) {
				return new ErrorResult("Aynı kimlik numarası ile daha önce kayıt olunmuş ");
			}
			
			return new SuccessResult();
		}
	}


