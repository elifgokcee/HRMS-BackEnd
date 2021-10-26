package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import kodlamaio.hrms.entities.concrete.JobSeeker;
import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
@CrossOrigin
@RestController
@RequestMapping(value="api/jobseekers")
public class JobSeekerController {
private JobSeekerService service;
@Autowired
public JobSeekerController(JobSeekerService service) {
	this.service=service;
	}
@GetMapping("/getall")
public DataResult<List<JobSeeker>> getAll(){
	return this.service.getAll();
}
}
