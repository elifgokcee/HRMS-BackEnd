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
@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","curriculumVitae"})
public class CoverLetter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "coverLetterId")
	@NotNull
	private int coverLetterId;
	@Column(name="text")
	private String letter;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="jobSeekerId")
	private JobSeeker jobSeeker;
	@OneToMany(mappedBy="letter")
	
	private List<CurriculumVitae> curriculumVitae;
}
