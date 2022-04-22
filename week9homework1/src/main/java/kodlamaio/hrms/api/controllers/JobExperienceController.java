package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobExperienceService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.entities.concrete.JobExperience;

@CrossOrigin
@RestController
@RequestMapping(value="api/jobexperiences")
public class JobExperienceController {
private JobExperienceService service;
@Autowired
public  JobExperienceController(JobExperienceService service){
	this.service=service;
}
@GetMapping("/getalljobexperiences")
DataResult<List<JobExperience>> getAllJobExperiences(){
	return service.getAllJobExperience();
}
@PostMapping("/addjobexperience")
public void add(@RequestParam JobExperience experience){
	service.add(experience);
}


}
