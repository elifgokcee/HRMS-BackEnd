package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.IJobTitleService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.entities.concrete.JobTitle;
@CrossOrigin
@RestController
@RequestMapping("api/jobtitles")

public class JobTitlesController {
private IJobTitleService jobTitleService;
@Autowired
public JobTitlesController(IJobTitleService jobTitleService) {
	this.jobTitleService=jobTitleService;
}
@GetMapping("/getall")
public DataResult<List<JobTitle>> getAll(){
	return this.jobTitleService.getAll();
}
@PostMapping("/add")
public Result add(@RequestBody JobTitle title){
	return this.jobTitleService.add(title);
}
}
