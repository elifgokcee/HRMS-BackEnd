package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;

import kodlamaio.hrms.entities.concrete.Employer;
@CrossOrigin
@RestController
@RequestMapping(value="/api/employers")
public class EmployersController {
	
	private EmployerService employerService;

	@Autowired
	public EmployersController(EmployerService employerService) {

		this.employerService = employerService;
	}
	@GetMapping("/getall")
     public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();}
	@PostMapping("/save")	
	public Result save(@RequestBody Employer employer) {
		return this.employerService.save(employer);
		
	}
	
	}
