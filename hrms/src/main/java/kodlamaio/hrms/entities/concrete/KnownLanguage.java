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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "knownlanguages")
@NoArgsConstructor
@AllArgsConstructor
public class KnownLanguage {
	@Id
	@NotNull
	@Column(name = "known_language_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int knownLanguageId;
	
	@OneToMany(mappedBy="knownLanguage")
	
	private List<Languages> languages;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CVId")
	private CurriculumVitae curriculumVitae;
	
	
	@OneToOne(mappedBy="knownLanguage")
	private LanguageDegree languageDegree;
	
}
