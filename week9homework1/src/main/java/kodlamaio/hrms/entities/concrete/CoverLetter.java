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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CoverLetter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "coverLetterId")
	private int coverLetterId;
	@Column(columnDefinition = "TEXT")
	private String coverLetter;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="jobSeekerId")
	private JobSeeker jobSeeker;
	@OneToMany(mappedBy="letter")
	
	private List<CurriculumVitae> curriculumVitae;
}
