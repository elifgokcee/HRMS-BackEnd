package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.entities.concrete.KnownLanguage;

public interface KnownLanguageService {
public void add(KnownLanguage language);
DataResult<List<KnownLanguage>> getAll();
}
