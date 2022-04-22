package kodlamaio.hrms.core.adapter.utilites.results;

import java.util.Map;

public class ErrorDataResult <T> extends DataResult <T>{


	public ErrorDataResult(T data,String message) {
		super(data,false, message);
		

}
	public ErrorDataResult(T data){
		super(data,false);
		
		}
	public ErrorDataResult(String message) {
		super(null,false,message);
	}
	public ErrorDataResult() {
		super(null,false);
	}
	
	public ErrorDataResult(Map<?, ?> map){
		super(null,false);
		
		}

}
