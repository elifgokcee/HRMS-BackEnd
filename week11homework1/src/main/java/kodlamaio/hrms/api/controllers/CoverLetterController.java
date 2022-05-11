package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import kodlamaio.hrms.business.abstracts.CoverLetterService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
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
	public void add(@RequestBody CoverLetter coverLetter)
	{
		service.add(coverLetter);
	}
	@DeleteMapping("/delete")
	public void delete(@RequestParam int id){
		service.delete(id);
		
	}
	@PutMapping("/update")
	public void update(@RequestParam int letterId,@RequestParam String text) {
		service.update(letterId, text);
	}
	@GetMapping("/getAll")
	public DataResult<List<CoverLetter>> getAll(){
		return service.getAll();
	}
	@GetMapping("/getById")
	public CoverLetter getById(int id){
		return service.findById(id);
	}
    
}
