package kodlamaio.hrms.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name="employer_id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","advertisement"})
public class Employer extends User {

	

	
    @NotNull
	@Column(name = "companyName")
	private String companyName;
	
    @NotNull
	@Column(name = "companyWebsite")
	private String companyWebsite;
	
    @NotNull
    @Column(name = "password")
	private String password;
	
    @NotNull
	@Column(name = "telephoneNumber")
	private String telephoneNumber;
    
    @NotNull
    private String passwordRepeat;
    
    @OneToMany(mappedBy="employer")
    private List<JobAdvertisement> advertisement;
    

   
	public Employer(int userId, String userEPosta, String companyName, String companyWebsite, String password,
			String telephoneNumber) {
		super(userId, userEPosta);
		this.companyName = companyName;
		this.companyWebsite = companyWebsite;
		this.password = password;
		this.telephoneNumber = telephoneNumber;
	}
	
	
	

}


