package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.entities.concrete.Languages;
public interface LanguageService {
public DataResult<List<Languages>> getAll();
}
