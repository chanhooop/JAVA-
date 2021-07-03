package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddressInsert {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JTextField tfName;
	private JButton btnOK;
	
	//데이터베이스 환경 정의
	private final String url_mysql = "jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
	private final String id_mysql = "root";
	private final String pw_mysqll = "qwer1234";
	
	
	private JLabel lblNewLabel_2;
	private JTextField tfTelNo;
	private JLabel lblNewLabel_3;
	private JTextField tfAddress;
	private JLabel lblNewLabel_4;
	private JTextField tfEmail;
	private JLabel lblNewLabel_5;
	private JTextField tfRelation;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddressInsert window = new AddressInsert();
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
	public AddressInsert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("주소록등록");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getBtnOK());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getTfTelNo());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getTfAddress());
		frame.getContentPane().add(getLblNewLabel_4());
		frame.getContentPane().add(getTfEmail());
		frame.getContentPane().add(getLblNewLabel_5());
		frame.getContentPane().add(getTfRelation());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("성명 :");
			lblNewLabel.setBounds(12, 41, 50, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(76, 38, 96, 21);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("입력");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int i_chk = insertFieldCheck();									//이해하고가자
					if(i_chk == 0) {
						insertAction();
					}

				}
			});
			btnOK.setBounds(333, 218, 91, 23);
		}
		return btnOK;
	}
	
	private int insertFieldCheck() {												//여기로
		int i = 0;
		String message = "";
		if(tfName.getText().trim().length() == 0) {
			i++;
			message = "이름을 ";
			tfName.requestFocus();
		}
		if(tfTelNo.getText().trim().length() == 0) {
			i++;
			message = "전화번호를 ";
			tfTelNo.requestFocus();
		}
		if(tfAddress.getText().trim().length() == 0) {
			i++;
			message = "주소를 ";
			tfAddress.requestFocus();
		}
		if(tfEmail.getText().trim().length() == 0) {
			i++;
			message = "이메일을 ";
			tfEmail.requestFocus();
		}
		if(tfRelation.getText().trim().length() == 0) {
			i++;
			message = "관계를 ";
			tfRelation.requestFocus();
		}
		if(i > 0)
			
			JOptionPane.showMessageDialog(null, message + "확인하세요");
		
		return i;
	}
	
	
	private void insertAction() {  // 사용자 정보입력
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysqll);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			String query = "insert into userinfo (name, telno, address, email, relation)";
			String query1 =" values (?,?,?,?,?)";
			
			ps = conn_mysql.prepareStatement(query+query1);
			ps.setString(1, tfName.getText().trim());
			ps.setString(2, tfTelNo.getText().trim());
			ps.setString(3, tfAddress.getText().trim());
			ps.setString(4, tfEmail.getText().trim());
			ps.setString(5, tfRelation.getText().trim());
			ps.executeUpdate();
			
			conn_mysql.close();
			
			JOptionPane.showMessageDialog(null, tfName.getText() + "님의 정보가 입력되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("전화번호 :");
			lblNewLabel_2.setBounds(12, 69, 50, 15);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfTelNo() {
		if (tfTelNo == null) {
			tfTelNo = new JTextField();
			tfTelNo.setColumns(10);
			tfTelNo.setBounds(76, 66, 96, 21);
		}
		return tfTelNo;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("주소 :");
			lblNewLabel_3.setBounds(12, 97, 50, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setColumns(10);
			tfAddress.setBounds(76, 94, 263, 21);
		}
		return tfAddress;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("전자우편 :");
			lblNewLabel_4.setBounds(12, 128, 50, 15);
		}
		return lblNewLabel_4;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(76, 125, 150, 21);
		}
		return tfEmail;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("관계 :");
			lblNewLabel_5.setBounds(12, 163, 50, 15);
		}
		return lblNewLabel_5;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setColumns(10);
			tfRelation.setBounds(76, 160, 263, 21);
		}
		return tfRelation;
	}

	
}
