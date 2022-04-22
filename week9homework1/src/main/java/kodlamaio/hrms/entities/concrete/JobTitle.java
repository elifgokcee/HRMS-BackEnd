package kodlamaio.hrms.entities.concrete;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "JobTitles")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","advertisement","jobExperience"})

public class JobTitle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "jobId")
	private int jobId;
	@Column(name = "jobName")
	private String jobName;

	@OneToMany(mappedBy="title")
	private List<JobAdvertisement> advertisement;
	@OneToMany(mappedBy="title")
	private List<JobExperience> jobExperience;
}
