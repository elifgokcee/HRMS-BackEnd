package kodlamaio.hrms.entities.concrete;





import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import kodlamaio.hrms.entities.abstracts.IUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy=InheritanceType.JOINED)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","picture"})

public class User implements IUser  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "userId")
	@NotNull
	private int userId;

	@Column(name = "userEPosta")
	@NotNull
	private String userEPosta;
   @OneToOne(mappedBy="user",cascade=CascadeType.ALL)
   
   private UserProfilPicture picture;
   public  User(int userId,String userEPosta) {
	   this.userEPosta=userEPosta;
	   this.userId=userId;
	   
   }
   
}
