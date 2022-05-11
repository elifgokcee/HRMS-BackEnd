package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EducationService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessResult;
import kodlamaio.hrms.entities.concrete.Education;

@RestController
@CrossOrigin 
@RequestMapping("api/educations")

public class EducationController {
	@Autowired
private EducationService service;
	@PostMapping("/add")
	public Result add(@RequestBody Education education) {
		this.service.add(education);
		return new SuccessResult("Eğitim bilgisi eklendi");
	}
	@DeleteMapping("/delete")
	public Result delete(@RequestParam int educationId) {
		this.service.delete(educationId);
		return new SuccessResult("Eğitim bilgisi silindi");
	}
	@GetMapping("/getAll")
	public DataResult<List<Education>>getAll(){
		
		return this.service.getBySortedEducationDesc();
		
	}
}
