package com.calculator.maven.calculator_CameronMahdavi;


import Interface.CalculatorBasicOperationsInterface;

/**  
 * Final Project - Calculator with basic- & advanced opreations
 * @author Cameron Mahdavi
 * @version 1.0
 * 
 * Superclass CalculatorBasicOperations that implements the interface CalculatorBasicOperationsInterface
 */

public class CalculatorBasicOperations implements CalculatorBasicOperationsInterface {

	/**
	 * Constructor that takes in the parameter input1 and returns the calculated result of the users input
	 * which in this case is the addition of the values entered (input1 and input2).
	 */
	public double add(double input1, double input2) {
		return input1 + input2;
	}

	/**
	 * Constructor that takes in the parameter input1 and returns the calculated result of the users input
	 * which in this case is the subtraction of the values entered (input1 and input2).
	 */
	public double sub(double input1, double input2) {
		return input1 - input2;
	}

	/**
	 * Constructor that takes in the parameter input1 and returns the calculated result of the users input
	 * which in this case is the multiplication of the values entered (input1 and input2).
	 */
	public double multi(double input1, double input2) {
		return input1 * input2;
	}

	/**
	 * Constructor that takes in the parameter input1 and returns the calculated result of the users input
	 * which in this case is the division of the values entered (input1 and input2).
	 */
	public double div(double input1, double input2) {
		return input1 / input2;
	}

	}
