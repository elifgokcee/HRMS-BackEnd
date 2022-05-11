package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;
import kodlamaio.hrms.entities.concrete.CoverLetter;

public interface CoverLetterService {
	public DataResult<List<CoverLetter>> getAll();
	public CoverLetter findById(int id);
    public Result add(CoverLetter letter);
    public Result delete(int id);
    public Result update(int letterId,String text);
}
