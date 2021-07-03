package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI00 {

	private JFrame frmGuicopyrightMe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI00 window = new GUI00();
					window.frmGuicopyrightMe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI00() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGuicopyrightMe = new JFrame();
		frmGuicopyrightMe.setTitle("GUI00 (copyright me)");
		frmGuicopyrightMe.setBounds(100, 100, 450, 300);
		frmGuicopyrightMe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGuicopyrightMe.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "OK 버튼을 눌렀습니다.");
			}
		});
		btnNewButton.setBounds(165, 105, 91, 23);
		frmGuicopyrightMe.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Java swing builder test");
		lblNewLabel.setBounds(12, 10, 140, 15);
		frmGuicopyrightMe.getContentPane().add(lblNewLabel);
	}
}
