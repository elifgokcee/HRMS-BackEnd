package kodlamaio.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerWithJobAdvertisementDto {

private String companyName;
private String jobName;
private int numberOfPosition;
private Date releaseDate;
private Date lastApplicationDate;


}
