package kodlamaio.hrms.business.abstracts;
import java.util.List;

import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.entities.concrete.KnownTechnology;
public interface KnownTechnologyService {
DataResult<List<KnownTechnology>> getAll();
public void add(KnownTechnology tech);

}
