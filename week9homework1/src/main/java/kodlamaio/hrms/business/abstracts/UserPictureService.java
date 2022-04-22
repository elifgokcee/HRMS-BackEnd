package kodlamaio.hrms.business.abstracts;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.adapter.utilites.results.Result;




public interface UserPictureService {
public Result add(MultipartFile file,int userId);
}
