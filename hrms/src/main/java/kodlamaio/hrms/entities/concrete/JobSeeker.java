package kodlamaio.hrms.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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
public class JobSeeker extends User {
	@NotNull
	@Column(name = "jobSeekerName")
	private String jobSeekerName;
	
	@NotNull
	@Column(name = "jobSeekerSurName")
	private String jobSeekerSurname;
	@NotNull
	@Column(name = "jobSeekerNationalityId")
	private String jobSeekerNationalityId;
	@NotNull
	@Column(name = "jobSeekerBirtyYear")
	private int jobSeekerBirthyear;
	@NotNull
	@Column(name="jobSeekerPassword")
	private String password;
	@NotNull
	private String passwordRepeat;
   

	

}
