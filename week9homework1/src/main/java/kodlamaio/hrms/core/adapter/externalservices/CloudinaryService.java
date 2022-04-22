package kodlamaio.hrms.core.adapter.externalservices;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
public interface CloudinaryService {
	@SuppressWarnings("rawtypes")
	DataResult<Map> upload(MultipartFile multipartFile);


}
