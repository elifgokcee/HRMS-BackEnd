package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.entities.concrete.CoverLetter;

public interface CoverLetterService {
public Result add(CoverLetter letter);
public Result delete(CoverLetter letter);
public Result update(CoverLetter letter,String text);
}
