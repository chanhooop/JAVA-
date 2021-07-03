package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI01 {

	private JFrame frmButtonTest;
	private JButton btnNewButton;
	private JTextField txtJavaSwingButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI01 window = new GUI01();
					window.frmButtonTest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmButtonTest = new JFrame();
		frmButtonTest.setTitle("Button Test");
		frmButtonTest.setBounds(100, 100, 450, 300);
		frmButtonTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmButtonTest.getContentPane().setLayout(null);
		frmButtonTest.getContentPane().add(getBtnNewButton());
		frmButtonTest.getContentPane().add(getTxtJavaSwingButton());
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("OK");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "OK버튼을 누렀습니다");
//					lblTest.setText("Button을 click 했습니다.");
				}
			});
			btnNewButton.setBounds(157, 109, 91, 23);
		}
		return btnNewButton;
	}
	private JTextField getTxtJavaSwingButton() {
		if (txtJavaSwingButton == null) {
			txtJavaSwingButton = new JTextField();
			txtJavaSwingButton.setText("Java Swing Button");
			txtJavaSwingButton.setBounds(12, 10, 134, 21);
			txtJavaSwingButton.setColumns(10);
		}
		return txtJavaSwingButton;
	}
}
