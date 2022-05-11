package kodlamaio.hrms.entities.concrete;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)

@Entity
@Table(name="JobAdvertisements")

public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="advertId")
	private int advertId;
	@Column(name="explanation")
	@NotNull
	private String explanation;
	@Column(name="positionNumber")
	@NotNull
	private int numberOfPositions;
	@Column(name="city")
	@NotNull
	private String city;
	@Column(name="lastApplicationDate")
	@NotNull
	private Date lastApplicationDate;
	@Column(name="releaseDate")
	@NotNull
	private Date releaseDate;
	@Column(name="minSalary")
	@NotNull
	private int minSalary;
	@Column(name="maxSalary")
	@NotNull
	private int maxSalary;
	
	@Value("${some.key:true}")
	@Column(name="jobStatus")
	@NotNull
	private boolean jobStatus;
	

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="employerId")
	private Employer employer;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="jobId")
	private JobTitle title;
	
	
	
	public String setlastApplicationDate(){
	
	DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
    return (df.format(this.lastApplicationDate));
     
	
	}
	
	
	

}
