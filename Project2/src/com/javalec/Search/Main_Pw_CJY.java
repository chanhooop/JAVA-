package com.javalec.Search;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.javalec.MainPackage.MainProcess;
import com.javalec.dbaction.DbAction_Pw_CJY;

public class Main_Pw_CJY extends JFrame{
	private MainProcess mainpr;
	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1_1_1_2;
	private JLabel lblNewLabel_1_1_1_3;
	private JTextField tfId;
	private JTextField tfName;
	private JButton btnCancal;
	private JButton btnOK;
	private JLabel lblNewLabel_1_1_1_3_1;
	private JTextField tfTel;	
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Pw_CJY window = new Main_Pw_CJY();
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
	public Main_Pw_CJY() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initialize();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("์นดํํ");
		frame.setBounds(100, 100, 545, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1_1_1_2());
		frame.getContentPane().add(getLblNewLabel_1_1_1_3());
		frame.getContentPane().add(getTfId());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getBtnCancal());
		frame.getContentPane().add(getBtnOK());
		frame.getContentPane().add(getLblNewLabel_1_1_1_3_1());
		frame.getContentPane().add(getTfTel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblNewLabel_2());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("๋น๋ฐ๋ฒํธ ์ฐพ๊ธฐ");
			lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			lblNewLabel.setBounds(28, 42, 183, 35);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1_1_1_2() {
		if (lblNewLabel_1_1_1_2 == null) {
			lblNewLabel_1_1_1_2 = new JLabel("์์ด๋");
			lblNewLabel_1_1_1_2.setFont(new Font("๋์", Font.PLAIN, 13));
			lblNewLabel_1_1_1_2.setBounds(28, 87, 56, 32);
		}
		return lblNewLabel_1_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_3() {
		if (lblNewLabel_1_1_1_3 == null) {
			lblNewLabel_1_1_1_3 = new JLabel("์ด๋ฆ");
			lblNewLabel_1_1_1_3.setFont(new Font("๋์", Font.PLAIN, 13));
			lblNewLabel_1_1_1_3.setBounds(28, 137, 56, 32);
		}
		return lblNewLabel_1_1_1_3;
	}
	private JTextField getTfId() {
		if (tfId == null) {
			tfId = new JTextField();
			tfId.setColumns(10);
			tfId.setBounds(119, 87, 237, 32);
		}
		return tfId;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(119, 137, 237, 32);
		}
		return tfName;
	}
	private JButton getBtnCancal() {
		if (btnCancal == null) {
			btnCancal = new JButton("์ทจ์");
			btnCancal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					cancelAction();
					
					Login_YJ login_YJ = new Login_YJ();
					login_YJ.setVisible(true);
					frame.dispose();
				}
			});
			btnCancal.setFont(new Font("๋์", Font.PLAIN, 13));
			btnCancal.setBounds(335, 402, 83, 29);
		}
		return btnCancal;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("์๋ฃ");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					int chk = insertFieldCheck();
					
					if(chk == 0) {
						okAction();
					}
					
				}
			});
			btnOK.setFont(new Font("๋์", Font.PLAIN, 13));
			btnOK.setBounds(430, 402, 83, 29);
		}
		return btnOK;
	}
	private JLabel getLblNewLabel_1_1_1_3_1() {
		if (lblNewLabel_1_1_1_3_1 == null) {
			lblNewLabel_1_1_1_3_1 = new JLabel("์?ํ๋ฒํธ");
			lblNewLabel_1_1_1_3_1.setFont(new Font("๋์", Font.PLAIN, 13));
			lblNewLabel_1_1_1_3_1.setBounds(28, 189, 68, 32);
		}
		return lblNewLabel_1_1_1_3_1;
	}
	private JTextField getTfTel() {
		if (tfTel == null) {
			tfTel = new JTextField();
			tfTel.setColumns(10);
			tfTel.setBounds(119, 189, 237, 32);
		}
		return tfTel;
	}
	
	
	// Method

	// ์๋ฃ_btnOK (์์ด๋, ์ด๋ฆ, ์?ํ๋ฒํธ)
	private void okAction() {
		
		String userId = tfId.getText().trim();
		String userName = tfName.getText().trim();
		String userTelno = tfTel.getText().trim();		
		
		String findClientPw = "";  // ์ด๊ธฐํ ์?์ธ
			
		DbAction_Pw_CJY dbAction_Pw_CJY = new DbAction_Pw_CJY(userId, userName, userTelno);
		findClientPw = dbAction_Pw_CJY.okAction();
		
		if (findClientPw == "no") {
			JOptionPane.showMessageDialog(null, "์๋?ฅํ์? ์?๋ณด๋ฅผ ํ์ธํด์ฃผ์ธ์!", "๋น๋ฐ๋ฒํธ ์ฐพ๊ธฐ", JOptionPane.WARNING_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, tfName.getText() + "๋์ ๋น๋ฐ๋ฒํธ๋ " + findClientPw + " ์๋๋ค!");
			
			mainpr.main(null);
			frame.dispose();
			
		}
			
	}
	
	// ์๋ฃ ๋ฒํผ : tf ์ค์์ ๋น?์ง ๋ถ๋ถ์ด ์์ ๋
		private int insertFieldCheck() {	// void๋ ๋ฐ๋ ๊ฒ ์๊ณ? ์ฌ๊ธฐ์ฒ๋ผ returnํ๋ฉด ๋ฐ์์ค๋ ๊ฐ์ด ์๋ ๊ฒ์
				
				int i = 0;
				String message = "";
				
				// tfName.getText().trim()์ ๊ธธ์ด๊ฐ 0์ผ๋ = ๋ฃ์ ํ์คํธ๊ฐ ์์ ๋ (trim()์ ๊ณต๋ฐฑ ์?๊ฑฐ)
				if(tfId.getText().trim().length() == 0) {
					i++;					// ๋ฃ์ ํ์คํธ ์์ผ๋ฉด i๊ฐ ์ฆ๊ฐ
					message = "์์ด๋๋ฅผ ";		// tfName์ ํ์คํธ๊ฐ ์์ ๋ ๋์ฌ ๋ฉ์ธ์ง์ ์?๋ณด
					tfId.requestFocus();	// .requestFocus() ์ปค์ ๊น๋นก์ด ์์น๋ก ํด์ฃผ๊ธฐ
				}
				if(tfName.getText().trim().length() == 0) {
					i++;
					message = "์ด๋ฆ์ ";
					tfName.requestFocus();
				}
				if(tfTel.getText().trim().length() == 0) {
					i++;
					message = "์?ํ๋ฒํธ๋ฅผ ";
					tfTel.requestFocus();
				}
				
				// i๊ฐ์ด 0๋ณด๋ค ํด ๋ = i๊ฐ์ด ์ฆ๊ฐํ์ ๋ = getText()๊ฐ ์์์ ๋
				if(i > 0) {
					JOptionPane.showMessageDialog(null, message + "์๋?ฅํ์ธ์.", "๋น๋ฐ๋ฒํธ ์ฐพ๊ธฐ", JOptionPane.WARNING_MESSAGE);
				}
				
				return i;
			}
		
		// ์ทจ์ : ์ด๊ธฐํ
		private void cancelAction() {
			tfId.setText("");
			tfName.setText("");
			tfTel.setText("");
		}
	
	
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("์นดํํ");
			lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
			lblNewLabel_1.setBounds(243, 0, 63, 41);
			lblNewLabel_1.setForeground(Color.white);
		}
		return lblNewLabel_1;
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon("/Users/gimminjae/Desktop/แแฅแแกแผ/background/background/client_mypage.png"));
			lblNewLabel_2.setBounds(0, -16, 545, 478);
		}
		return lblNewLabel_2;
	}
} // -------------------------------------------
