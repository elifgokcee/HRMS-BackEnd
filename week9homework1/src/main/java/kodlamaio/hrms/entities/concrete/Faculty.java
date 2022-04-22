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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "faculties")
public class Faculty {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	@Column(name="id")
private int faculty_id;

	
 	@NotNull
	@Column(name="faculty_name")
private String facultyName;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="university_id")
	
private University university;
}
