package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.entities.concrete.User;
import java.util.List;

public interface UserService {
	User getByUserId(int id);
	DataResult<List<User>>getAll();

}
