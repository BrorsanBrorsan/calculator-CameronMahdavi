package com.calculator.maven.calculator_CameronMahdavi;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Random;
import java.util.logging.Logger;

import com.calculator.maven.calculator_CameronMahdavi.CalculatorAdvancedOperations;

/**  
 * Final Project - Calculator with basic- & advanced opreations
 * @author Cameron Mahdavi
 * @version 1.0
 * 
 * Test class for the advanced calculator
 * Performs test cases for each advanced operation of the calculator 
 * Every advanced operator of the calculator gets tested 50 times with different random values in
 * three different types of doubles
 * First type is positive
 * Second type is negative
 * Third type contains a zero value
 */
public class CalculatorAdvancedTest {
	Random random = new Random();
	CalculatorAdvancedOperations cao = new CalculatorAdvancedOperations ();
	
	public static final Logger LOG = Logger.getLogger(CalculatorAdvancedOperations.class.getName());
	
	
	@Test
	public void testSquareRootPositive() {
		double input1 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			input1 = random.nextDouble() * 10;
			result = cao.sqrt(input1);
			
			LOG.info("Testing the method sqrt with positive numbers: " + input1 + "Result: " + result);
			assertEquals(cao.sqrt(input1), result, 0);
		}
	}
	
	@Test
	public void testSquareRootNegative() {
		double input1 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			input1 = random.nextDouble() * -10;
			result = cao.sqrt(input1);
			
			LOG.info("Testing the method sqrt with negative numbers: " + input1 + "Result: " + result);
			assertEquals(cao.sqrt(input1), result, 0);
		}
	}
	
	@Test
	public void testSquareRootZero() {
		double input1 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			result = cao.sqrt(input1);
			
			LOG.info("Testing the method sqrt with negative numbers: " + input1 + "Result: " + result);
			assertEquals(cao.sqrt(input1), result, 0);
		}
		
	}
	
		

	@Test
	public void testElevatedPostive() {
		double input1 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			input1 = random.nextDouble() * 10;
			result = cao.sqrt(input1);
			
			LOG.info("Testing the method sqrt with zero numbers: " + input1 + "Result: " + result);
			assertEquals(cao.sqrt(input1), result, 0);
			
		}
		
	}
	
	@Test	
	public void testElevatedNegative() {
			double input1 = 0;
			double result = 0;
			
			for (int i = 0; i < 50; i++) {
				input1 = random.nextDouble() * -10;
				result = cao.elev2(input1);
				
				LOG.info("Testing the method elev2 with negative numbers: " + input1 + "Result: " + result);
				assertEquals(cao.elev2(input1), result, 0);
				
			}
			
		}
			
	@Test
	public void testElevatedZero() {
		double input1 = 0;
		double result = 0;
				
		for (int i = 0; i < 50; i++) {
			result = cao.elev2(input1);
			
			LOG.info("Testing the method elev2 with zero numbers: " + input1 + "Result: " + result);
			assertEquals(cao.elev2(input1), result, 0);
					
	}
				
}
					
					

			
	@Test
	public void testElevated3Positive() {
				double input1 = 0;
				double result = 0;
				
				for (int i = 0; i < 50; i++) {
					input1 = random.nextDouble() * 10;
					result = cao.elev3(input1);
					
					LOG.info("Testing the method elev3 with positive numbers: " + input1 + "Result: " + result);
					assertEquals(cao.elev3(input1), result, 0);
				}
			}
			
			@Test
			public void testElevated3Negative() {
				double input1 = 0;
				double result = 0;
				
				for (int i = 0; i < 50; i++) {
					input1 = random.nextDouble() * -10;
					result = cao.elev3(input1);
					
					LOG.info("Testing the method elev3 with negative numbers: " + input1 + "Result: " + result);
					assertEquals(cao.elev3(input1), result, 0);
				}
			}
			
			@Test
	public void testElevated3Zero() {
				double input1 = 0;
				double result = 0;
				
				for (int i = 0; i < 50; i++) {
					result = cao.elev3(input1);
					
					LOG.info("Testing the method elev3 with zero numbers: " + input1 + "Result: " + result);
					assertEquals(cao.elev3(input1), result, 0);
				}
			}
			
				
	@Test
	public void testLogPositive() {
				double input1 = 0;
				double result = 0;
				
				for (int i = 0; i < 50; i++) {
					input1 = random.nextDouble() * 10;
					result = cao.LOG(input1);
					
					LOG.info("Testing the method LOG with positive numbers: " + input1 + "Result: " + result);
					assertEquals(cao.LOG(input1), result, 0);
				}
			}
	@Test
	public void testLogNegative() {
				double input1 = 0;
				double result = 0;
				
				for (int i = 0; i < 50; i++) {
					input1 = random.nextDouble() * -10;
					result = cao.LOG(input1);
					
					LOG.info("Testing the method LOG with negative numbers: " + input1 + "Result: " + result);
					assertEquals(cao.LOG(input1), result, 0);
				}
			}
	
	@Test
	public void testLogZero() {
				double input1 = 0;
				double result = 0;
				
				for (int i = 0; i < 50; i++) {
					result = cao.LOG(input1);
					
					LOG.info("Testing the method LOG with zero numbers: " + input1 + "Result: " + result);
					assertEquals(cao.LOG(input1), result, 0);
				}
			}
	
	@Test
	public void testCosPositive() {
				double input1 = 0;
				double result = 0;
				
				for (int i = 0; i < 50; i++) {
					input1 = random.nextDouble() * 10;
					result = cao.COS(input1);
					
					LOG.info("Testing the method COS with positive numbers: " + input1 + "Result: " + result);
					assertEquals(cao.COS(input1), result, 0);
				}
			}
	
	@Test
	public void testCosNegative() {
				double input1 = 0;
				double result = 0;
				
				for (int i = 0; i < 50; i++) {
					input1 = random.nextDouble() * -10;
					result = cao.COS(input1);
					
					LOG.info("Testing the method COS with negative numbers: " + input1 + "Result: " + result);
					assertEquals(cao.COS(input1), result, 0);
				}
			}
	@Test
	public void testCosZero() {
				double input1 = 0;
				double result = 0;
				
				for (int i = 0; i < 50; i++) {
					result = cao.COS(input1);
					
					LOG.info("Testing the method COS with zero numbers: " + input1 + "Result: " + result);
					assertEquals(cao.COS(input1), result, 0);
				}
			}
	
	@Test
	public void testSinPositive() {
				double input1 = 0;
				double result = 0;
				
				for (int i = 0; i < 50; i++) {
					input1 = random.nextDouble() * 10;
					result = cao.SIN(input1);
					
					LOG.info("Testing the method SIN with positive numbers: " + input1 + "Result: " + result);
					assertEquals(cao.SIN(input1), result, 0);
				}
			}
	@Test
	public void testSinNegative() {
				double input1 = 0;
				double result = 0;
				
				for (int i = 0; i < 50; i++) {
					input1 = random.nextDouble() * -10;
					result = cao.SIN(input1);
					
					LOG.info("Testing the method SIN with negative numbers: " + input1 + "Result: " + result);
					assertEquals(cao.SIN(input1), result, 0);
				}
			}
	@Test
	public void testSinZero() {
				double input1 = 0;
				double result = 0;
				
				for (int i = 0; i < 50; i++) {
					result = cao.SIN(input1);
					
					LOG.info("Testing the method SIN with zero numbers: " + input1 + "Result: " + result);
					assertEquals(cao.SIN(input1), result, 0);
				}
			}

}
