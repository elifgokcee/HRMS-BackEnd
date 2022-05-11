package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concrete.SystemPersonel;

public interface SystemPersonelService {
	public void save(SystemPersonel systempersonel);
	List<SystemPersonel>getAll();
}
