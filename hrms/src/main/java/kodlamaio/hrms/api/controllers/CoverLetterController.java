package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CoverLetterService;
import kodlamaio.hrms.entities.concrete.CoverLetter;
@CrossOrigin
@RestController
@RequestMapping(value="api/coverletters")
public class CoverLetterController {
	private CoverLetterService service;
	@Autowired
	public CoverLetterController( CoverLetterService service){
		this.service=service;
	}
	@PostMapping("/add")
	public void add(@RequestParam CoverLetter letter)
	{
		service.add(letter);
	}
	@DeleteMapping("/delete")
	public void delete(CoverLetter letter){
		service.delete(letter);
		
	}
	@PutMapping("/update")
	public void update(CoverLetter letter,String text) {
		service.update(letter, text);
	}
	

}
