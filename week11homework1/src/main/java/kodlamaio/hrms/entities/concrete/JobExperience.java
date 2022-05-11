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
@Table(name = "jobexperiences")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","title"})
public class JobExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name = "experienceId")
	private int experienceId;
	@NotNull
	@Column(name = "companyName")
	private String companyName;
    @NotNull
    @Column(name="work_start_date")
    private Date workStartDate;
    @Column(name="work_finish_date")
    private Date workFinishDate;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "jobId")
	private JobTitle title;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CVId")
	private CurriculumVitae curriculumVitae;
	
	
	
	
}
