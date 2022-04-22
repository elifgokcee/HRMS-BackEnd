package kodlamaio.hrms.core.adapter.externalservices;


import java.io.IOException;

import java.util.Map;
import com.cloudinary.utils.ObjectUtils;
import com.cloudinary.Transformation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;


import kodlamaio.hrms.core.adapter.utilites.results.DataResult;
import kodlamaio.hrms.core.adapter.utilites.results.ErrorDataResult;
import kodlamaio.hrms.core.adapter.utilites.results.SuccessDataResult;

@Service

public class CloudinaryManager implements CloudinaryService{
	 private Cloudinary cloudinary;
	
@Autowired
	    public CloudinaryManager() {
	      
	    
	        
	      Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
	                "cloud_name","hrmsystem",
	                "api_key","939157918114727",
	                "api_secret","OrP_0cXGsoPROOvCsH-e359KvaQ"));
	  
	        this.cloudinary=cloudinary;
	    }




	@SuppressWarnings("rawtypes")
	@Override
	public DataResult<Map> upload(MultipartFile multipartFile) {
		
		try {@SuppressWarnings("unchecked")
		 Map<String, String> resultMap = (Map<String, String>) cloudinary.uploader().upload(multipartFile.getBytes(),
	                ObjectUtils.asMap("transformation",(new Transformation().height(150).width(150).crop("scale")),
	                                        "unique_filename","true",
	                                        "folder","kodlamaio/profilePhotos/",
	                                        "allowed_formats","jpg,jpeg,png"));

	            return new SuccessDataResult<Map>(resultMap);
	        }catch (IOException e){
	            e.printStackTrace();
	        }
	        return new ErrorDataResult<Map>();}
	

}
