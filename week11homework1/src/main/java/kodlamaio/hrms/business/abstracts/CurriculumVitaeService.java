package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.Result;

import kodlamaio.hrms.entities.concrete.CurriculumVitae;


import java.util.List;


public interface CurriculumVitaeService {
public Result add(CurriculumVitae vitae);
public Result delete(int id); 
public DataResult<List<CurriculumVitae>>getAll();
public DataResult<List<CurriculumVitae>> getByJobSeekerId(int seekerId);
}
/*
public Result updateGithubLink(CurriculumVitae vitae,String link);
public Result addSchool(CurriculumVitae vitae,Education school);
public Result addTech(CurriculumVitae vitae,KnownTechnology tech);
public Result addKnownLanguage(CurriculumVitae vitae,KnownLanguage language);
public Result addExperience(CurriculumVitae vitae,JobExperience experience);

}
*/