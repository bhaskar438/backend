package fakeDB;

import java.util.ArrayList;

import backend.JobDetail;

public class JobDetailFactory {
	
	// start JobDetail attributes
	private static String[] titles = {"a", "b", "c", "d", "e"};
	private static int[] jobScores = {19, 50, 23, 67, 27};
	
		// more attributes should be added to factory.
		// each attribute should have same amount of elements
	
	
	// end JobDetail attributes
	
	
	
	public static ArrayList generateFixtures() {
		ArrayList<JobDetail> jobDetailsList = new ArrayList<JobDetail>();
		
		for(int index=0; index < titles.length; index++) {
			// constructor should be modified when more attributes are added
			jobDetailsList.add(new JobDetail(titles[index], jobScores[index])); 
		}
		
		return jobDetailsList;
	} // end generateFixtures method
	
} // end JobDetailFactory class
