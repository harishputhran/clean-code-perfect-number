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
		assertNull(classToUnitTest.determinePerfectNumber(0));
	}
	
	@Test
	public void returnsNumberIsNotPerfectFromDetectPerfectNumberWhenInputIsLessThan6(){
		assertEquals("Input Number is not perfect.", classToUnitTest.determinePerfectNumber(5));
	}
}
