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
		assertFalse(classToUnitTest.determinePerfectNumber(0));
	}
	
	@Test
	public void returnsResponseFromDetectPerfectNumberWhenInputIsAPerfectNumber(){
		assertTrue(classToUnitTest.determinePerfectNumber(6));
	}
	
	@Test
	public void returnsResponseFromDetectPerfectNumberWhenInputIsNotAPerfectNumber(){
		assertFalse(classToUnitTest.determinePerfectNumber(9));
	}
	
	@Test
	public void returnsResponseFromDetectPerfectNumberWhenInputIsAPerfectNumberScneario2(){
		assertTrue(classToUnitTest.determinePerfectNumber(8128));
	}
	
	@Test
	public void returnsResponseFromDetectPerfectNumberWhenInputIsNotAPerfectNumberScenario2(){
		assertFalse(classToUnitTest.determinePerfectNumber(8200));
	}
	
	@Test
	public void returnsTrueFromIsNumberPerfectWhenInputIsAPerfectNumber(){
		assertTrue(classToUnitTest.isNumberPerfect(496));
	}
	
	@Test
	public void returnsFalseFromIsNumberPerfectWhenInputIsNotAPerfectNumber(){
		assertFalse(classToUnitTest.isNumberPerfect(497));
	}
}
