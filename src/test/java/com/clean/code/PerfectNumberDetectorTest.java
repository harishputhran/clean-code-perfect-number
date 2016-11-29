package com.clean.code;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PerfectNumberDetectorTest {
	
	PerfectNumberDetector classToUnitTest = new PerfectNumberDetector();
	
	@Test
	public void returnsNumberIsNotPerfectFromDetectPerfectNumberWhenInputIs0(){
		assertEquals("Input Number is not a Perfect Number.", classToUnitTest.determinePerfectNumber(0));
	}
	
	@Test
	public void returnsResponseFromDetectPerfectNumberWhenInputIs0GreaterThan0(){
		assertEquals("Input Number is a Perfect Number.", classToUnitTest.determinePerfectNumber(6));
	}
}
