package kodlamaio.hrms.business.abstracts;


import kodlamaio.hrms.entities.concrete.User;

public interface MernisCheckService{
	public boolean confirm(User user);

}
