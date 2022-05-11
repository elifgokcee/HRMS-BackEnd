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


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "knownlanguages")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","curriculumVitae"})

public class KnownLanguage {
	@Id
	@Column(name = "known_language_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int knownLanguageId;
	
	@OneToOne(mappedBy="knownLanguage")
	
	private Languages languages;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CVId")
	private CurriculumVitae curriculumVitae;
	
	
	@OneToOne(mappedBy="knownLanguage")
	private LanguageDegree languageDegree;
	
}
