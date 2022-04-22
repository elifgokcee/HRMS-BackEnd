package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.LanguageService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.entities.concrete.Languages;

@CrossOrigin
@RestController
@RequestMapping(value="/api/languages")
public class LanguageController {
	@Autowired
	private LanguageService service;
	@GetMapping("/getAll")
	public DataResult<List<Languages>> getAll() {
		return this.service.getAll();
	

}}
