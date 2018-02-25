package com.calculator.maven.calculator_CameronMahdavi;


import Interface.CalculatorAdvancedOperationsInterface;

/**  
 * Final Project - Calculator with basic- & advanced opreations
 * @author Cameron Mahdavi
 * @version 1.0
 * 
 * Superclass CalculatorAdvancedOperations that implements the interface CalculatorAdvancedOperationsInterface
 */

public class CalculatorAdvancedOperations implements CalculatorAdvancedOperationsInterface {
	
	/**
	 * Constructor that takes in the parameter input1 and returns the calculated result of input1
	 * which in this case is the square root of the value entered(input1).
	 */
	
	public double sqrt(double input1) {
		return Math.sqrt(input1);
	}

	/**
	 * Constructor that takes in the parameter input1 and returns the calculated result of input1
	 * which in this case is the power of the value entered(input1).
	 */
	public double elev2(double input1) {
		return Math.pow(input1, 2);
	}

	/**
	 * Constructor that takes in the parameter input1 and returns the calculated result of input1
	 * which in this case is the power of the value entered(input1).
	 */
	public double elev3(double input1) {
		return Math.pow(input1, 3);
	}

	/**
	 * Constructor that takes in the parameter input1 and returns the calculated result of input1
	 * which in this case is the LOG of the value entered.
	 */
	public double LOG(double input1) {
		return Math.log(input1);
	}

	/**
	 * Constructor that takes in the parameter input1 and returns the calculated result of input1
	 * which in this case is the COS of the value entered(input1).
	 */
	
	public double COS(double input1) {
		return Math.cos(input1);
	}

	/**
	 * Constructor that takes in the parameter input1 and returns the calculated result of input1
	 * which in this case is the SIN of the value entered(input1).
	 */
	public double SIN(double input1) {
		return Math.sin(input1);
	}

}
