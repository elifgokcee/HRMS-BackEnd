package kodlamaio.hrms.core.adapter.utilites.results;

public class ErrorResult extends Result {
	
		public ErrorResult() {
			super(false);
		}
		public ErrorResult(String message) {
			super(false,message);
		}
		

	}



