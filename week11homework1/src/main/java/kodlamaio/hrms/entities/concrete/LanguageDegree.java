package kodlamaio.hrms.entities.concrete;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "language_degree")
@NoArgsConstructor
@AllArgsConstructor

public class LanguageDegree {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="degree_id")
private int id;
	@Column(name="degree_value")
private String degree;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="knownLanguageId")
	private KnownLanguage knownLanguage;
}
