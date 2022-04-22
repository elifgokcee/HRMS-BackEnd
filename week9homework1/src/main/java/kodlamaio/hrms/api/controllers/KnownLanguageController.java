package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.hrms.business.abstracts.KnownLanguageService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.entities.concrete.KnownLanguage;
@RestController
@CrossOrigin
@RequestMapping(value="api/knownlanguages")
public class KnownLanguageController {
	private KnownLanguageService service;
	public KnownLanguageController(KnownLanguageService  service) {
		this.service=service;
	}
	@GetMapping("/getall")
	public DataResult<List<KnownLanguage>>getAll(){
		return this.service.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestParam KnownLanguage language){
		service.add(language);
	}

}
