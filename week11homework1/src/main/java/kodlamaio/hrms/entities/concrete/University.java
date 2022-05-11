package kodlamaio.hrms.entities.concrete;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "faculty","education"})

@Table(name = "universities")
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "university_id")
	@NotNull
	private int university_id;
	@NotNull
	@Column(name = "university_name")
	private String universityName;

	@OneToMany(mappedBy="university")
	
	private List<Education> education;
	@OneToMany(mappedBy="university")
	private List<Faculty> faculty;
}
