package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GUI04 {

	private JFrame frmPasswordfield;
	private JPasswordField pfInput;
	private JButton btnOK;
	private JTextField tfMessage;
	private JPasswordField pwInput;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI04 window = new GUI04();
					window.frmPasswordfield.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPasswordfield = new JFrame();
		frmPasswordfield.setTitle("PasswordField");
		frmPasswordfield.setBounds(100, 100, 654, 366);
		frmPasswordfield.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPasswordfield.getContentPane().setLayout(null);
		frmPasswordfield.getContentPane().add(getPfInput());
		frmPasswordfield.getContentPane().add(getBtnOK());
		frmPasswordfield.getContentPane().add(getTfMessage());
		frmPasswordfield.getContentPane().add(getPwInput());
		frmPasswordfield.getContentPane().add(getLblNewLabel());
	}
	private JPasswordField getPfInput() {
		if (pfInput == null) {
			pfInput = new JPasswordField();
			pfInput.setBounds(154, 36, -9, 21);
		}
		return pfInput;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkPassword();
				}
			});
			btnOK.setBounds(253, 35, 91, 23);
		}
		return btnOK;
	}
	private JTextField getTfMessage() {
		if (tfMessage == null) {
			tfMessage = new JTextField();
			tfMessage.setBounds(73, 99, 96, 21);
			tfMessage.setColumns(10);
		}
		return tfMessage;
	}
	private JPasswordField getPwInput() {
		if (pwInput == null) {
			pwInput = new JPasswordField();
			pwInput.setBounds(137, 36, 69, 21);
		}
		return pwInput;
	}
	

	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Password");
			lblNewLabel.setBounds(73, 36, 69, 21);
		}
		return lblNewLabel;
	}
	
	
	private void checkPassword() {
		char[] str = pwInput.getPassword();       //getText로 쓸수도 있음  //getPassword는 캐릭터 배열로 준다 		
		String passString = new String(str);   //String 객체연산자로 써주면 된다!!!
		tfMessage.setText(passString);
		
		
	}
}
