package com.clean.code;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PerfectNumberDetectorTest {
	
	PerfectNumberDetector classToUnitTest = new PerfectNumberDetector();
	
	@Test
	public void returnsNullFromDetectPerfectNumber(){
		assertNotNull(classToUnitTest.determinePerfectNumber(0));
	}
}
