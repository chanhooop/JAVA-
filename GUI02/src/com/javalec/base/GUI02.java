package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class GUI02 {

	private JFrame frmCombobox;
	private JComboBox cbFruits;
	private JTextField tfFruits;
	private JTextField tfAdd;
	private JButton btnAdd;
	private JComboBox cbAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI02 window = new GUI02();
					window.frmCombobox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCombobox = new JFrame();
		frmCombobox.setTitle("Combobox");
		frmCombobox.setBounds(100, 100, 488, 356);
		frmCombobox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCombobox.getContentPane().setLayout(null);
		frmCombobox.getContentPane().add(getCbFruits());
		frmCombobox.getContentPane().add(getTfFruits());
		frmCombobox.getContentPane().add(getTfAdd());
		frmCombobox.getContentPane().add(getBtnAdd());
		frmCombobox.getContentPane().add(getCbAdd());
	}
	private JComboBox getCbFruits() {
		if (cbFruits == null) {
			cbFruits = new JComboBox();
			cbFruits.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String stFruits = cbFruits.getSelectedItem().toString();
					tfFruits.setText(stFruits);
				}
			});
			cbFruits.setModel(new DefaultComboBoxModel(new String[] {"Apple", "Banana", "Grape", "Mango", "Melon"}));
			cbFruits.setBounds(26, 24, 106, 23);
		}
		return cbFruits;
	}
	private JTextField getTfFruits() {
		if (tfFruits == null) {
			tfFruits = new JTextField();
			tfFruits.setBounds(207, 25, 96, 21);
			tfFruits.setColumns(10);
		}
		return tfFruits;
	}
	private JTextField getTfAdd() {
		if (tfAdd == null) {
			tfAdd = new JTextField();
			tfAdd.setBounds(36, 99, 96, 21);
			tfAdd.setColumns(10);
		}
		return tfAdd;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addCombo();
				}
			});
			btnAdd.setBounds(41, 160, 91, 23);
		}
		return btnAdd;
	}
	private JComboBox getCbAdd() {
		if (cbAdd == null) {
			cbAdd = new JComboBox();
			cbAdd.setBounds(207, 98, 96, 23);
		}
		return cbAdd;
	}
	
	private void addCombo() {
		String stTemp = tfAdd.getText();
		cbAdd.addItem(stTemp);
	}
	
	
}
