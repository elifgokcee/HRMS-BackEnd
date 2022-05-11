package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public CurriculumVitaeController(CurriculumVitaeService service) {
		this.service=service;
	}
	@GetMapping("/getAll")
	public DataResult<List<CurriculumVitae>>getAll(){
		return this.service.getAll();
	}
	@GetMapping("/getById")
	public DataResult<List<CurriculumVitae>> getByJobSeekerId(@RequestParam int seekerId){
		return this.service.getByJobSeekerId(seekerId);
	}
	@PostMapping("/add")
	public Result add(@RequestBody CurriculumVitae vitae) {
		return this.service.add(vitae);
	}
}
