package kodlamaio.hrms.entities.concrete;

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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "educations")
@JsonIgnoreProperties({"hibernateLazyInitializer","curriculumVitae"})


public class Education {
	@Id
	@NotNull
	@Column(name = "education_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int education_id;
	
	@NotNull
	@Column(name = "education_start_date")
	private Date startDate;

	@Column(name = "education_finish_date")
	private Date finishDate;
    
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CVId")
	private CurriculumVitae curriculumVitae;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="university_id")
	
	private University university;
  

}
