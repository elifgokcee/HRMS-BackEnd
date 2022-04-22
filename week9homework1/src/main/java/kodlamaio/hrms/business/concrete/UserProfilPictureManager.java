package kodlamaio.hrms.business.concrete;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.UserPictureService;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.adapter.externalservices.CloudinaryService;

import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.UserProfilPictureDao;

import kodlamaio.hrms.entities.concrete.UserProfilPicture;
@Service
public class UserProfilPictureManager implements UserPictureService {
	
private UserProfilPictureDao dao;
	
private CloudinaryService cloudinaryService;

private UserService userService;

@Autowired

	public UserProfilPictureManager(UserProfilPictureDao dao,CloudinaryService cloudinaryService,UserService userService) {
	
		this.cloudinaryService=cloudinaryService;
		this.dao=dao;
		
		this.userService=userService;
	}
	@Override
	public Result add(MultipartFile file,int userId) {
		 @SuppressWarnings("unchecked")
	        Map<String,String> uploadImage = this.cloudinaryService.upload(file).getData();
		  UserProfilPicture picture =new UserProfilPicture();
         
	        picture.setImagePath(uploadImage.get("url"));
	         
	        this.userService.getByUserId(userId).setPicture(picture);
	        this.dao.save(picture);
		      
	        return new SuccessResult("Imaj dosyası sisteme eklendi.");
       
        
	}

}
