package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessResult;
import kodlamaio.hrms.entities.concrete.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.EmployerWithJobAdvertisementDto;
@CrossOrigin
@RestController
@RequestMapping(value="api/jobadvertisements")
public class JobAdvertisementController {
	private JobAdvertisementService service;
	@Autowired
	public JobAdvertisementController(JobAdvertisementService service) {
		this.service=service;
		
	}
	@GetMapping("/getallactivejobadvertisement")
	public DataResult<List<EmployerWithJobAdvertisementDto>> getAllActiveJobAdvertisement(){
		return this.service.getByJobStatus();
	}
	@GetMapping("/getbyid")
	public DataResult<JobAdvertisement> getById(@RequestParam int id){
		return this.service.getById(id);
	}

	
	  @GetMapping("/getallactivejobadvertisementsorteddatedesc")
	  DataResult<List<EmployerWithJobAdvertisementDto>>
	  getAllActiveJobAdvertisementBySortedDateDesc(){ return
	  this.service.getByJobStatusOrderByReleaseDateDesc();}
	 
	
	@GetMapping("/getallactivejobadvertisementbycompanyname")
	DataResult<List<EmployerWithJobAdvertisementDto>> getAllActiveJobAdvertisementByCompanyName(String companyName){
		return  this.service.getByJobStatusAndCompanyName(companyName);
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement  jobAdvertisement){
		return this.service.add(jobAdvertisement);
	}
	@PutMapping("/updatetofalse")
	public Result updateJobStatuToFalse(JobAdvertisement jobAdvertisement) {
		 
		this.service.updateJobStatuToFalse(jobAdvertisement);
		
		return new SuccessResult("İlan pasif hale getirilmiştir");}
	@PutMapping("/updatetotrue")
	public Result updateJobStatuToTrue(JobAdvertisement jobAdvertisement) 
		{
			this.service.updateJobStatuToTrue(jobAdvertisement);
			return new SuccessResult("İlan aktif hale getirilmiştir");
		}
	@PutMapping("/update")
	public Result update(int advertId){
		this.service.update(advertId);
		return new SuccessResult("İlan güncel hale getirilmiştir");
		
	}
	}
		
	
	


