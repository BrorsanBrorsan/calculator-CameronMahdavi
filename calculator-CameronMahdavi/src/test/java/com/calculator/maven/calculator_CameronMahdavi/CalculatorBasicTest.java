package com.calculator.maven.calculator_CameronMahdavi;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Random;
import java.util.logging.Logger;

import com.calculator.maven.calculator_CameronMahdavi.CalculatorBasicOperations;

/**  
 * Final Project - Calculator with basic- & advanced opreations
 * @author Cameron Mahdavi
 * @version 1.0
 * 
 * Test class for the basic calculator
 * Performs test cases for each basic operation of the calculator 
 * Every basic operator of the calculator gets tested 50 times with different random values in
 * three different types of doubles
 * First type is positive
 * Second type is negative
 * Third type contains a zero value
 */

public class CalculatorBasicTest {
	Random random = new Random();
	CalculatorBasicOperations cbo = new CalculatorBasicOperations ();
	
	public static final Logger LOG = Logger.getLogger(CalculatorBasicOperations.class.getName());
	
	
	@Test
	public void testAddPositive() {
		
		double input1 = 0;
		double input2 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			input1 = random.nextDouble()*10;
			input2 = random.nextDouble()*10;
			result = input1 + input2;
			
			LOG.info("Testing the method add with positive numbers: " + input1 + " + " + input2 + " = " + result);
			assertEquals(cbo.add(input1, input2), result, 0);
		}
	}
	
	@Test
	public void testAddNegativee() {
		
		double input1 = 0;
		double input2 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			input1 = random.nextDouble()*-10;
			input2 = random.nextDouble()*-10;
			result = input1 + input2;
			
			LOG.info("Testing the method add with negative numbers: " + input1 + " + " + input2 + " = " + result);
			assertEquals(cbo.add(input1, input2), result, 0);
		}
	}
	
	@Test
	public void testAddZero() {
		
		double input1 = 0;
		double input2 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			input1 = random.nextDouble()*10;
			input2 = 0;
			result = input1 + input2;
			
			LOG.info("Testing the method add with zero numbers: " + input1 + " + " + input2 + " = " + result);
			assertEquals(cbo.add(input1, input2), result, 0);
		}
	}
	
	@Test
	public void testSubPositive() {
		
		double input1 = 0;
		double input2 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			input1 = random.nextDouble()*10;
			input2 = random.nextDouble()*10;
			result = input1 - input2;
			
			LOG.info("Testing the method sub with positive numbers: " + input1 + " - " + input2 + " = " + result);
			assertEquals(cbo.sub(input1, input2), result, 0);
		}
	}
	
	@Test
	public void testSubNegative() {
		
		double input1 = 0;
		double input2 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			input1 = random.nextDouble() * -10;
			input2 = random.nextDouble() * -10;
			result = input1 - input2;
			
			LOG.info("Testing the method sub with negative numbers: " + input1 + " - " + input2 + " = " + result);
			assertEquals(cbo.sub(input1, input2), result, 0);
		}
	}
	
	@Test
	public void testSubZero() {
		
		double input1 = 0;
		double input2 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			input1 = random.nextDouble() * 10;
			input2 = 0;
			result = input1 - input2;
			
			LOG.info("Testing the method sub with zero numbers: " + input1 + " - " + input2 + " = " + result);
			assertEquals(cbo.sub(input1, input2), result, 0);
		}
	}
	
	@Test
	public void testMultiPositive() {
		
		double input1 = 0;
		double input2 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			input1 = random.nextDouble()*10;
			input2 = random.nextDouble()*10;
			result = input1 * input2;
			
			LOG.info("Testing the method multi with positive numbers: " + input1 + " * " + input2 + " = " + result);
			assertEquals(cbo.multi(input1, input2), result, 0);
		}
	}
	
	@Test
	public void testMultiNegative() {
		
		double input1 = 0;
		double input2 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			input1 = random.nextDouble()*-10;
			input2 = random.nextDouble()*-10;
			result = input1 * input2;
			
			LOG.info("Testing the method multi with negative numbers: " + input1 + " * " + input2 + " = " + result);
			assertEquals(cbo.multi(input1, input2), result, 0);
		}
	}
	
	@Test
	public void testMultiZero() {
		
		double input1 = 0;
		double input2 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			input1 = random.nextDouble()*10;
			input2 = 0;
			result = input1 * input2;
			
			LOG.info("Testing the method multi with zero numbers: " + input1 + " * " + input2 + " = " + result);
			assertEquals(cbo.multi(input1, input2), result, 0);
		}
	}
	
	@Test
	public void testDivPositive() {
		
		double input1 = 0;
		double input2 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			input1 = random.nextDouble()*10;
			input2 = random.nextDouble()*10;
			result = input1 / input2;
			
			LOG.info("Testing the method div with positive numbers: " + input1 + " / " + input2 + " = " + result);
			assertEquals(cbo.div(input1, input2), result, 0);
		}
	}
	
	@Test
	public void testDivNegative() {
		
		double input1 = 0;
		double input2 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			input1 = random.nextDouble()*-10;
			input2 = random.nextDouble()*-10;
			result = input1 / input2;
			
			LOG.info("Testing the method div with negative numbers: " + input1 + " / " + input2 + " = " + result);
			assertEquals(cbo.div(input1, input2), result, 0);
		}
	}
	
	@Test
	public void testDivZero() {
		
		double input1 = 0;
		double input2 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			input1 = random.nextDouble()*10;
			input2 = 0;
			result = input1 / input2;
			
			LOG.info("Testing the method div with zero numbers: " + input1 + " / " + input2 + " = " + result);
			assertEquals(cbo.div(input1, input2), result, 0);
		}
	}
}
	
	
	