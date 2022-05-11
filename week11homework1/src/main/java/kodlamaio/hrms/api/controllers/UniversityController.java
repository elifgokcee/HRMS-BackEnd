package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.UniversityService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.entities.concrete.University;

@CrossOrigin
@RestController
@RequestMapping(value="/api/universities")
public class UniversityController {
@Autowired
private UniversityService service;

@GetMapping("/getall")
public DataResult<List<University>> getAll(){
	return this.service.getAll();
}
}  
 