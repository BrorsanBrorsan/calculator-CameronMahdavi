package com.calculator.maven.calculator_CameronMahdavi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**  
 * Final Project - Calculator with basic- & advanced opreations
 * @author Cameron Mahdavi
 * @version 1.0
 * 
 * MainFrame, the GUI of the calculator. Created with window builder 
 */

public class MainFrame {

	private JFrame frame;
	private JTextField display1;
	private JTextField display2;
	
	CalculatorBasicOperations basic = new CalculatorBasicOperations ();
	CalculatorAdvancedOperations advanced = new CalculatorAdvancedOperations ();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		display1 = new JTextField();
		display1.setBounds(163, 11, 130, 30);
		frame.getContentPane().add(display1);
		display1.setColumns(10);
		
		display2 = new JTextField();
		display2.setBounds(163, 52, 130, 30);
		frame.getContentPane().add(display2);
		display2.setColumns(10);
		
		JLabel lblEnterFirstNumber = new JLabel("Enter first number:");
		lblEnterFirstNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEnterFirstNumber.setBounds(23, 15, 130, 22);
		frame.getContentPane().add(lblEnterFirstNumber);
		
		JLabel lblEnterSecondNumber = new JLabel("Enter second number:");
		lblEnterSecondNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEnterSecondNumber.setBounds(23, 56, 130, 22);
		frame.getContentPane().add(lblEnterSecondNumber);
		
		final JLabel lblResult = new JLabel("Result: ");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResult.setBounds(23, 93, 270, 30);
		frame.getContentPane().add(lblResult);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double input1 = Double.parseDouble(display1.getText());
				double input2 = Double.parseDouble(display2.getText());
				double result = basic.multi(input1, input2);
				lblResult.setText("Result: " + result);
				
			}
		});
		btnMulti.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMulti.setBounds(10, 194, 50, 50);
		frame.getContentPane().add(btnMulti);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double input1 = Double.parseDouble(display1.getText());
				double input2 = Double.parseDouble(display2.getText());
				double result = basic.add(input1, input2);
				lblResult.setText("Result: " + result);
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPlus.setBounds(10, 133, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double input1 = Double.parseDouble(display1.getText());
				double input2 = Double.parseDouble(display2.getText());
				double result = basic.div(input1, input2);
				lblResult.setText("Result: " + result);
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDivide.setBounds(70, 194, 50, 50);
		frame.getContentPane().add(btnDivide);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double input1 = Double.parseDouble(display1.getText());
				double input2 = Double.parseDouble(display2.getText());
				double result = basic.sub(input1, input2);
				lblResult.setText("Result: " + result);
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMinus.setBounds(70, 133, 50, 50);
		frame.getContentPane().add(btnMinus);
		
		JButton btnElev3 = new JButton("x^3");
		btnElev3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double input1 = Double.parseDouble(display1.getText());
				double result = advanced.elev3(input1);
				lblResult.setText("Result: " + result);
			}
		});
		btnElev3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnElev3.setBounds(187, 194, 64, 50);
		frame.getContentPane().add(btnElev3);
		
		JButton btnSqrt = new JButton("\u221A");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double input1 = Double.parseDouble(display1.getText());
				double result = advanced.sqrt(input1);
				lblResult.setText("Result: " + result);
			}
		});
		btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSqrt.setBounds(274, 134, 64, 50);
		frame.getContentPane().add(btnSqrt);
		
		JButton btnSin = new JButton("SIN");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double input1 = Double.parseDouble(display1.getText());
				double result = advanced.SIN(input1);
				lblResult.setText("Result: " + result);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSin.setBounds(360, 133, 64, 50);
		frame.getContentPane().add(btnSin);
		
		JButton btnLog = new JButton("LOG");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double input1 = Double.parseDouble(display1.getText());
				double result = advanced.LOG(input1);
				lblResult.setText("Result: " + result);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLog.setBounds(360, 194, 64, 50);
		frame.getContentPane().add(btnLog);
		
		JButton btnCos = new JButton("COS");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double input1 = Double.parseDouble(display1.getText());
				double result = advanced.COS(input1);
				lblResult.setText("Result: " + result);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCos.setBounds(274, 194, 64, 50);
		frame.getContentPane().add(btnCos);
		
		JButton btnElev2 = new JButton("x^2");
		btnElev2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double input1 = Double.parseDouble(display1.getText());
				double result = advanced.elev2(input1);
				lblResult.setText("Result: " + result);
			}
		});
		btnElev2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnElev2.setBounds(187, 134, 64, 50);
		frame.getContentPane().add(btnElev2);
	}
}
