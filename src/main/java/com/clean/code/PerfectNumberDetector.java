package com.clean.code;

/**
 * Class for Perfect Number Detector.
 * 
 * @author hputhr
 *
 */
public class PerfectNumberDetector {
	
	/**
	 * Method to determine if an input number is perfect or not.
	 * 
	 * @param int
	 * @return boolean
	 */
	public boolean determinePerfectNumber(int numberToCheckForPerfectNumber){				
		return (numberToCheckForPerfectNumber == 0) ? Boolean.FALSE : isNumberPerfect(numberToCheckForPerfectNumber);
	}

	/**
	 * Method consisting of the logic to determine a Perfect Number.
	 * 
	 * @param int
	 * @return boolean
	 */
	public boolean isNumberPerfect(int number) {
		int sumOfDivisorsOfANumber = 0;
		int numberToDivideInputNumber = 1;
		
		while(numberToDivideInputNumber < number){
			if(number % numberToDivideInputNumber == 0){
				sumOfDivisorsOfANumber += numberToDivideInputNumber;
			}
			numberToDivideInputNumber++;
		}	
		return (number == sumOfDivisorsOfANumber) ? Boolean.TRUE : Boolean.FALSE;
	}
}
