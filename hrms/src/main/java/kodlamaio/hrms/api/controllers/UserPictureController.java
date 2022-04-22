package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.UserPictureService;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessResult;



@CrossOrigin
@RestController
@RequestMapping(value = "/api/pictures")

public class UserPictureController {
	
	private UserPictureService service;
	@Autowired
      public UserPictureController(UserPictureService service) {
    	  this.service=service;
      }
	@PostMapping("/add")
	public Result addPicture(@RequestPart MultipartFile file,@RequestParam int userId) {
		
		this.service.add( file, userId);
		return new SuccessResult("Profil fotoğrafı eklendi");

	}

}
