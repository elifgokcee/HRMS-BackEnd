package kodlamaio.hrms.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.UserProfilPicture;

public interface UserProfilPictureDao extends JpaRepository<UserProfilPicture,Integer>{
	
}
