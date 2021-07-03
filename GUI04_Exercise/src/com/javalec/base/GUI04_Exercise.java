package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI04_Exercise {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblPassword;
	private JPasswordField pfInput;
	private JButton btnOk;
	private JTextField tfMessge;
	private JTextField tfUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI04_Exercise window = new GUI04_Exercise();
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
	public GUI04_Exercise() {
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
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblPassword());
		frame.getContentPane().add(getPfInput());
		frame.getContentPane().add(getBtnOk());
		frame.getContentPane().add(getTfMessge());
		frame.getContentPane().add(getTfUser());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("User");
			lblNewLabel.setBounds(47, 54, 50, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setBounds(47, 79, 78, 15);
		}
		return lblPassword;
	}
	private JPasswordField getPfInput() {
		if (pfInput == null) {
			pfInput = new JPasswordField();
			pfInput.setBounds(126, 76, 96, 21);
		}
		return pfInput;
	}
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton("OK");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkPassword();
				}
			});
			btnOk.setBounds(283, 75, 91, 23);
		}
		return btnOk;
	}
	private JTextField getTfMessge() {
		if (tfMessge == null) {
			tfMessge = new JTextField();
			tfMessge.setBounds(126, 121, 248, 23);
			tfMessge.setColumns(10);
		}
		return tfMessge;
	}
	private JTextField getTfUser() {
		if (tfUser == null) {
			tfUser = new JTextField();
			tfUser.setBounds(126, 51, 96, 21);
			tfUser.setColumns(10);
		}
		return tfUser;
	}
	
	private void checkPassword() {
		char[] abc = pfInput.getPassword();
		String str = new String(abc);
		tfMessge.setText(str);
	}
	
	private void checkId() {
		String str = tfUser.getText();
		tfMessge.setText(str);
		
	}
	
	
}
