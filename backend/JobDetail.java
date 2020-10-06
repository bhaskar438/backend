package backend;

public class JobDetail {
	// start instance(non-static) and/or class(static) variables
	private String title; // instance(non-static) variable.  scope is entire class definition
	private int jobScore;
	
	
	
	// end instance(non-static) and/or class(static variables)
	
	public JobDetail(String title, int jobScore) {
		this.title = title; // Note: this.title refers to the title variable from line 5.
							// don't need prefix "this" in line 13 if parameter had different name	
		this.jobScore = jobScore;
	}
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getJobScore() {
		return this.jobScore;
	}

	public void setJobScore(int jobScore) {
		this.jobScore = jobScore;
	}


	
	
	
	
	
} // end JobDetail class
