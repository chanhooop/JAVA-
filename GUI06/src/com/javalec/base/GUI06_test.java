package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class GUI06_test {

	private JFrame frame;
	private JTextField tfResult;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn6;
	private JButton btn5;
	private JButton btn4;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn0;
	private JButton btnEqual;
	private JButton btnAdd;
	private ArrayList<Integer> list1 = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI06_test window = new GUI06_test();
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
	public GUI06_test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 727, 463);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTfResult());
		frame.getContentPane().add(getBtn7());
		frame.getContentPane().add(getBtn8());
		frame.getContentPane().add(getBtn9());
		frame.getContentPane().add(getBtn6());
		frame.getContentPane().add(getBtn5());
		frame.getContentPane().add(getBtn4());
		frame.getContentPane().add(getBtn1());
		frame.getContentPane().add(getBtn2());
		frame.getContentPane().add(getBtn3());
		frame.getContentPane().add(getBtn0());
		frame.getContentPane().add(getBtnEqual());
		frame.getContentPane().add(getBtnAdd());
	}

	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setBounds(141, 48, 281, 46);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	private JButton getBtn7() {
		if (btn7 == null) {
			btn7 = new JButton("7");
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int num = Integer.parseInt(btn7.getText());
					String number = Integer.toString(num);					
					buttonAction(num, number);
				}
			});
			btn7.setBounds(141, 124, 61, 46);
		}
		return btn7;
	}
	private JButton getBtn8() {
		if (btn8 == null) {
			btn8 = new JButton("8");
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int num = Integer.parseInt(btn8.getText());
					String number = Integer.toString(num);					
					buttonAction(num, number);
				}
			});
			btn8.setBounds(214, 124, 61, 46);
		}
		return btn8;
	}
	private JButton getBtn9() {
		if (btn9 == null) {
			btn9 = new JButton("9");
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int num = Integer.parseInt(btn9.getText());
					String number = Integer.toString(num);					
					buttonAction(num, number);
				}
			});
			btn9.setBounds(287, 124, 61, 46);
		}
		return btn9;
	}
	private JButton getBtn6() {
		if (btn6 == null) {
			btn6 = new JButton("6");
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int num = Integer.parseInt(btn6.getText());
					String number = Integer.toString(num);					
					buttonAction(num, number);
				}
			});
			btn6.setBounds(287, 184, 61, 46);
		}
		return btn6;
	}
	private JButton getBtn5() {
		if (btn5 == null) {
			btn5 = new JButton("5");
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int num = Integer.parseInt(btn5.getText());
					String number = Integer.toString(num);					
					buttonAction(num, number);
				}
			});
			btn5.setBounds(214, 184, 61, 46);
		}
		return btn5;
	}
	private JButton getBtn4() {
		if (btn4 == null) {
			btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int num = Integer.parseInt(btn4.getText());
					String number = Integer.toString(num);					
					buttonAction(num, number);
				}
			});
			btn4.setHorizontalAlignment(SwingConstants.LEFT);
			btn4.setBounds(141, 180, 61, 46);
		}
		return btn4;
	}
	private JButton getBtn1() {
		if (btn1 == null) {
			btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int num = Integer.parseInt(btn1.getText());
					String number = Integer.toString(num);					
					buttonAction(num, number);	
				}
			});
			btn1.setBounds(141, 239, 61, 46);
		}
		return btn1;
	}
	private JButton getBtn2() {
		if (btn2 == null) {
			btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int num = Integer.parseInt(btn2.getText());
					String number = Integer.toString(num);					
					buttonAction(num, number);
				}
			});
			btn2.setBounds(214, 240, 61, 46);
		}
		return btn2;
	}
	private JButton getBtn3() {
		if (btn3 == null) {
			btn3 = new JButton("3");
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int num = Integer.parseInt(btn3.getText());
					String number = Integer.toString(num);					
					buttonAction(num, number);
				}
			});
			btn3.setBounds(287, 240, 61, 46);
		}
		return btn3;
	}
	private JButton getBtn0() {
		if (btn0 == null) {
			btn0 = new JButton("0");
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String num0 = "0";
					int num = Integer.parseInt(num0);
					
					list1.add(num);
//					String number = Integer.toString(num);					
					buttonAction(num, num0);					
				}
			});
			btn0.setBounds(141, 304, 61, 46);
		}
		return btn0;
	}
	private JButton getBtnEqual() {
		if (btnEqual == null) {
			btnEqual = new JButton("=");
			btnEqual.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
			btnEqual.setBounds(214, 304, 61, 46);
		}
		return btnEqual;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("+");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
				}
			});
			btnAdd.setBounds(287, 304, 61, 46);
		}
		return btnAdd;
	}
	
	private void buttonAction(int num, String number) {
		
		tfResult.setText(tfResult.getText() + number);

	}
	
	
} //--------------------
