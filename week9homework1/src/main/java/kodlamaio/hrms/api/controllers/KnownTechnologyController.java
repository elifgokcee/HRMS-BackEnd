package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import kodlamaio.hrms.business.abstracts.KnownTechnologyService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;

import kodlamaio.hrms.entities.concrete.KnownTechnology;

@RestController
@CrossOrigin
@RequestMapping(value="api/knowntechnologies")
public class KnownTechnologyController {
	private KnownTechnologyService service;
	public KnownTechnologyController(KnownTechnologyService service) {
		this.service=service;
	}
	@GetMapping("/getall")
	public DataResult<List<KnownTechnology>>getAll(){
		return this.service.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestParam KnownTechnology tech){
		service.add(tech);
}}
