package kodlamaio.hrms.entities.concrete;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name="curriculumvitaes")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","education","experience","knownTechnology","letter","knownLanguage","jobSeeker"})
public class CurriculumVitae {
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cv_id")
	private int CVId;
	
	@Column(name="githublink")
	private String githubLink;
	
	@Column(name="linkedinLink")
	private String linkedinLink;
	
	
	@OneToMany(mappedBy="curriculumVitae")
	
	private List<Education> education;
	
	@OneToMany(mappedBy="curriculumVitae")
	
	private List<KnownLanguage> knownLanguage;
	
	@OneToMany(mappedBy="curriculumVitae")
	
	
	 private List<JobExperience> experience;

	@OneToMany(mappedBy="curriculumVitae")
	
	private List<KnownTechnology> knownTechnology;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="job_seeker_id")
    private JobSeeker jobSeeker;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="coverLetterId")
	private CoverLetter letter;
	
}












