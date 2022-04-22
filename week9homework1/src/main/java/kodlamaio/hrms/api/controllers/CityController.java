package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CityService;
import kodlamaio.hrms.entities.concrete.City;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;

@RestController
@CrossOrigin 
@RequestMapping("api/cities")
public class CityController {
	@Autowired
private CityService service;
	@GetMapping("/getall")
	public DataResult<List<City>> getAll(){
		return this.service.getAll();
		
	}
}
