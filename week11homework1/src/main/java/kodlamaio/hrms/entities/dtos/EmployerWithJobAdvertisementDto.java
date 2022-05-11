package kodlamaio.hrms.entities.dtos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerWithJobAdvertisementDto {
private int id;
private String companyName;
private String jobName;
private int numberOfPosition;
private Date releaseDate;
private Date lastApplicationDate;
private String explanation;
public EmployerWithJobAdvertisementDto(String companyName,String jobName,Date releaseDate,Date lastApplicationDate,String explanation) {
	this.companyName=companyName;
	this.jobName=jobName;
	this.releaseDate=releaseDate;
	this.lastApplicationDate=lastApplicationDate;
	this.explanation=explanation;
	
}
public String getlastApplicationDate(){
	
	DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
     return (df.format(this.lastApplicationDate));
	
	}
	
public String getReleaseDate(){
	
	DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
     return (df.format(this.releaseDate));
	
	}

}
