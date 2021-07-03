package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class GUI03 {

	private JFrame frmCheckBox;
	private JCheckBox chApple;
	private JCheckBox chBanana;
	private JButton btnFruit;
	private JTextField tfFruit;
	private JRadioButton rbKbs;
	private JRadioButton rbMbc;
	private JButton btnBroad;
	private JTextField tfBroad;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI03 window = new GUI03();
					window.frmCheckBox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCheckBox = new JFrame();
		frmCheckBox.setTitle("Check Box / RadoButton");
		frmCheckBox.setBounds(100, 100, 450, 300);
		frmCheckBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckBox.getContentPane().setLayout(null);
		frmCheckBox.getContentPane().add(getChApple());
		frmCheckBox.getContentPane().add(getChBanana());
		frmCheckBox.getContentPane().add(getBtnFruit());
		frmCheckBox.getContentPane().add(getTfFruit());
		frmCheckBox.getContentPane().add(getRbKbs());
		frmCheckBox.getContentPane().add(getRbMbc());
		frmCheckBox.getContentPane().add(getBtnBroad());
		frmCheckBox.getContentPane().add(getTfBroad());
	}
	private JCheckBox getChApple() {
		if (chApple == null) {
			chApple = new JCheckBox("Apple");
			chApple.setBounds(23, 25, 107, 23);

		}
		return chApple;
	}
	private JCheckBox getChBanana() {
		if (chBanana == null) {
			chBanana = new JCheckBox("Banana");
			chBanana.setBounds(23, 77, 107, 23);
		}
		return chBanana;
	}
	private JButton getBtnFruit() {
		if (btnFruit == null) {
			btnFruit = new JButton("OK");
			btnFruit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			btnFruit.setBounds(22, 117, 91, 23);
		}
		return btnFruit;
	}
	private JTextField getTfFruit() {
		if (tfFruit == null) {
			tfFruit = new JTextField();
			tfFruit.setBounds(23, 159, 172, 21);
			tfFruit.setColumns(10);
		}
		return tfFruit;
	}
	
	private void fruitCheck() {
		tfFruit.setText("");
		
		if(chApple.isSelected() == true) {
			tfFruit.setText("Apple이 선택 되었습니다.");
		}
		
		if(chBanana.isSelected() == true) {
			tfFruit.setText("Banana가 선택 되었습니다.");
			
		}
		
		if((chApple.isSelected() == true) && (chBanana.isSelected() == true)) {
			tfFruit.setText("둘다 선택 되었습니다.");
		}
		
	}
	private JRadioButton getRbKbs() {
		if (rbKbs == null) {
			rbKbs = new JRadioButton("Kbs");
			buttonGroup.add(rbKbs);
			rbKbs.setBounds(284, 25, 113, 23);
		}
		return rbKbs;
	}
	private JRadioButton getRbMbc() {
		if (rbMbc == null) {
			rbMbc = new JRadioButton("Mbc");
			buttonGroup.add(rbMbc);
			rbMbc.setBounds(284, 77, 113, 23);
		}
		return rbMbc;
	}
	private JButton getBtnBroad() {
		if (btnBroad == null) {
			btnBroad = new JButton("OK");
			btnBroad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
					
				}
			});
			btnBroad.setBounds(284, 117, 91, 23);
		}
		return btnBroad;
	}
	private JTextField getTfBroad() {
		if (tfBroad == null) {
			tfBroad = new JTextField();
			tfBroad.setBounds(284, 159, 96, 21);
			tfBroad.setColumns(10);
		}
		return tfBroad;
	}
	
	private void broadCheck() {
		if(rbKbs.isSelected() == true) {
			tfBroad.setText("kbs가 선택되었습니다.");
		}
		if(rbMbc.isSelected() == true) {
			tfBroad.setText("Mbc가 선택되었습니다.");
		}
		
	}
}
