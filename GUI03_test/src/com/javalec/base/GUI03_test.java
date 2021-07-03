package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI03_test {

	private JFrame frame;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JRadioButton rdPlus;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnX;
	private JRadioButton rdbtnNewRadioButton_2_1;
	private JLabel lblResult;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI03_test window = new GUI03_test();
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
	public GUI03_test() {
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
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getRdPlus());
		frame.getContentPane().add(getRdbtnNewRadioButton_1());
		frame.getContentPane().add(getRdbtnX());
		frame.getContentPane().add(getRdbtnNewRadioButton_2_1());
		frame.getContentPane().add(getLblResult());
	}

	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum1.setBounds(12, 21, 96, 21);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum2.setColumns(10);
			tfNum2.setBounds(12, 52, 96, 21);
		}
		return tfNum2;
	}
	private JRadioButton getRdPlus() {
		if (rdPlus == null) {
			rdPlus = new JRadioButton("+");
			rdPlus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcResult();
					
				}
			});
			buttonGroup.add(rdPlus);
			rdPlus.setBounds(260, 20, 113, 23);
		}
		return rdPlus;
	}
	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("-");
			buttonGroup.add(rdbtnNewRadioButton_1);
			rdbtnNewRadioButton_1.setBounds(260, 51, 113, 23);
		}
		return rdbtnNewRadioButton_1;
	}
	private JRadioButton getRdbtnX() {
		if (rdbtnX == null) {
			rdbtnX = new JRadioButton("x");
			buttonGroup.add(rdbtnX);
			rdbtnX.setBounds(260, 85, 113, 23);
		}
		return rdbtnX;
	}
	private JRadioButton getRdbtnNewRadioButton_2_1() {
		if (rdbtnNewRadioButton_2_1 == null) {
			rdbtnNewRadioButton_2_1 = new JRadioButton("/");
			buttonGroup.add(rdbtnNewRadioButton_2_1);
			rdbtnNewRadioButton_2_1.setBounds(260, 110, 113, 23);
		}
		return rdbtnNewRadioButton_2_1;
	}
	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("");
			lblResult.setBounds(27, 163, 309, 70);
		}
		return lblResult;
	}
	
	private void calcResult() {
		if(rdPlus.isSelected() == true) {
			lblResult.setText(tfNum1 + tfNum2);
		}
		
	}
	
	
	
}
