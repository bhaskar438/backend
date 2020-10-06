package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fakeDB.JobDetailFactory;
import backend.JobDetail;

public class JobDetailTest {
	
	private static ArrayList<JobDetail> jobDetailsList;

	@Before
	public void setUp() throws Exception {
		jobDetailsList = JobDetailFactory.generateFixtures();
	}

	@After
	public void tearDown() throws Exception {
	}

	// this sample test should be removed
	@Test
	public void sampleTest() {
		
		assertEquals("a", jobDetailsList.get(0).getTitle());
		assertEquals(19, jobDetailsList.get(0).getJobScore());
		assertEquals("b", jobDetailsList.get(1).getTitle());
		assertEquals(50, jobDetailsList.get(1).getJobScore());
	}

}


