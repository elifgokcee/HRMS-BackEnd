package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.entities.concrete.CoverLetter;
import java.util.List;
public interface CoverLetterDao extends JpaRepository<CoverLetter,Integer> {
public CoverLetter findById(int id);
}
