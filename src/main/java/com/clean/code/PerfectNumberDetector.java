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
	 * @return String
	 */
	public String determinePerfectNumber(int numberToCheckForPerfectNumber){				
		return (numberToCheckForPerfectNumber == 0) ? "Input Number is not a Perfect Number." : isNumberPerfect(numberToCheckForPerfectNumber);
	}

	/**
	 * Method consisting of the logic to determine a Perfect Number.
	 * 
	 * @param int
	 * @return String
	 */
	public String isNumberPerfect(int number) {
		int sumOfDivisorsOfANumber = 0;
		int numberToDivideInputNumber = 1;
		
		while(numberToDivideInputNumber < number){
			if(number % numberToDivideInputNumber == 0){
				sumOfDivisorsOfANumber += numberToDivideInputNumber;
			}
			numberToDivideInputNumber++;
		}		
		return (number == sumOfDivisorsOfANumber) ? "Input Number is a Perfect Number." : "Input Number is not a Perfect Number.";
	}
}
