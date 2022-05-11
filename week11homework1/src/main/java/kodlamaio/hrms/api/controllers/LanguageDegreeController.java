package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.LanguageDegreeService;
import kodlamaio.hrms.entities.concrete.LanguageDegree;

@RestController
@CrossOrigin 
@RequestMapping("api/languageDegrees")
public class LanguageDegreeController {
	@Autowired
	private LanguageDegreeService service;
	@GetMapping("/getall")
	public List<LanguageDegree> getAll(){
		return service.getAll();
	}

}
