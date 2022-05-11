package kodlamaio.hrms.entities.concrete;



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
@Table(name = "knowntechnologies")
@NoArgsConstructor

@JsonIgnoreProperties({"hibernateLazyInitializer","handler","curriculumVitae"})
public class KnownTechnology {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "techId")

	private int techId;
	@NotNull
	@Column(name = "techName")
	private String techName;
	@NotNull
	@Column(name = "techdegree")
	private int degree;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CVId")
	private CurriculumVitae curriculumVitae;
}
