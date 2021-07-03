package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUITest01 {

	private JFrame frame;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfNumResult;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton butAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUITest01 window = new GUITest01();
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
	public GUITest01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("더하기");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getTfNumResult());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getButAdd());
	}

	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum1.setBounds(29, 24, 96, 21);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum2.setColumns(10);
			tfNum2.setBounds(162, 24, 96, 21);
		}
		return tfNum2;
	}
	private JTextField getTfNumResult() {
		if (tfNumResult == null) {
			tfNumResult = new JTextField();
			tfNumResult.setEditable(false);
			tfNumResult.setColumns(10);
			tfNumResult.setBounds(298, 24, 96, 21);
		}
		return tfNumResult;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("+");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(113, 30, 50, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("=");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(252, 27, 50, 15);
		}
		return lblNewLabel_1;
	}
	private JButton getButAdd() {
		if (butAdd == null) {
			butAdd = new JButton("Add");
			butAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 1st
					String stNum1 = tfNum1.getText();
					String stNum2 = tfNum2.getText();
					
					int wkNum1 = Integer.parseInt(stNum1);
					int wkNum2 = Integer.parseInt(stNum2);
					int wkResult = wkNum1 + wkNum2;
					
					String stResult = Integer.toString(wkResult);
					tfNumResult.setText(stResult);
//					
					// 2st
//					int wkNum1 = Integer.parseInt(tfNum1.getText());
//					int wkNum2 = Integer.parseInt(tfNum2.getText());
//					int wkRe
					
//					addSum();
			
				}
			});
			butAdd.setBounds(39, 83, 91, 23);
		}
		return butAdd;
	}
}
