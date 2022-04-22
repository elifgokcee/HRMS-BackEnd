package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrete.KnownTechnology;

public interface KnownTechnologyDao extends JpaRepository<KnownTechnology,Integer> {

}
