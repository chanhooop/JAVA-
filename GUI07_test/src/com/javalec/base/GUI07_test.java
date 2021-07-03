package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import sun.java2d.opengl.WGLSurfaceData.WGLVSyncOffScreenSurfaceData;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI07_test {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblPassword;
	private JPasswordField pfUser;
	private JTextField tfUser;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI07_test window = new GUI07_test();
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
	public GUI07_test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 694, 393);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblPassword());
		frame.getContentPane().add(getPfUser());
		frame.getContentPane().add(getTfUser());
		frame.getContentPane().add(getBtnLogin());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("User");
			lblNewLabel.setBounds(91, 69, 70, 48);
		}
		return lblNewLabel;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setBounds(91, 148, 70, 48);
		}
		return lblPassword;
	}
	private JPasswordField getPfUser() {
		if (pfUser == null) {
			pfUser = new JPasswordField();
			pfUser.setBounds(212, 162, 161, 21);
		}
		return pfUser;
	}
	private JTextField getTfUser() {
		if (tfUser == null) {
			tfUser = new JTextField();
			tfUser.setBounds(212, 83, 161, 34);
			tfUser.setColumns(10);
		}
		return tfUser;
	}
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Login");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					Action();
					
				}
			});
			btnLogin.setBounds(212, 249, 145, 41);
		}
		return btnLogin;
	}

	private void Action() {
		
		String ID = tfUser.getText();
		char[] pw = pfUser.getPassword();
//		String pwstr = pw.toString();
		String pwstr1 = new String(pw);

		if(ID.equals("asdf") && pwstr1.equals("1234")) {
			System.out.println(0);
			Welcom welcom = new Welcom();
			welcom.setVisible(true);
		}
		else {

			Reject reject = new Reject();
			reject.setVisible(true);
		}
	}
}
