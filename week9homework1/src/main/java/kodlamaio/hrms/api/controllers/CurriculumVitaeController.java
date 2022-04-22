package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CurriculumVitaeService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.entities.concrete.CurriculumVitae;

@CrossOrigin
@RestController
@RequestMapping(value="/api/myCurriculumVitaes")
public class CurriculumVitaeController {
	@Autowired
private CurriculumVitaeService service;
	@GetMapping("/getAll")
	public DataResult<List<CurriculumVitae>>getAll(){
		return this.service.getAll();
	}
	@GetMapping("/getById")
	public DataResult<CurriculumVitae> getByJobSeekerId(int seekerId){
		return this.getByJobSeekerId(seekerId);
	}
	@PostMapping("/add")
	public Result add(CurriculumVitae vitae) {
		return this.service.add(vitae);
	}
}
