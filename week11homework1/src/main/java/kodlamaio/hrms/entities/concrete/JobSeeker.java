package kodlamaio.hrms.entities.concrete;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "JobSeekers")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name="job_seeker_id")
@JsonIgnoreProperties({"hibernateLazyInitializer","coverletter","vitae","picture"})
public class JobSeeker extends User {
	@NotNull
	@Column(name = "job_seeker_name") 
	private String jobSeekerName;
	
	@NotNull
	@Column(name = "job_seeker_sur_name")
	private String jobSeekerSurname;
	@NotNull
	@Column(name = "job_seeker_nationality_id")
	private String jobSeekerNationalityId;
	@NotNull
	@Column(name = "job_seeker_birty_year")
	private int jobSeekerBirthyear;
	@NotNull
	@Column(name="job_seeker_password")
	private String password;
	
	
	 @OneToMany(mappedBy="jobSeeker")
	 private List<CurriculumVitae> vitae;
	 
	 @OneToMany(mappedBy="jobSeeker")
	 private List<CoverLetter> coverletter;

	public JobSeeker(int userId,String userEPosta,String jobSeekerName, String jobSeekerSurname,String jobSeekerNationalityId,
			int jobSeekerBirthyear,String jobSeekerPassword) {
		super(userId,userEPosta);
		this.jobSeekerName=jobSeekerName;
		this.jobSeekerSurname= jobSeekerSurname;
		this.jobSeekerNationalityId=jobSeekerNationalityId;
		this.jobSeekerBirthyear=jobSeekerBirthyear;
		this.password=jobSeekerPassword;
		
		
		
		
	}}


