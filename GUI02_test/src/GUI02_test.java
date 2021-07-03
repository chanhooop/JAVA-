import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI02_test {

	private JFrame frame;
	private JComboBox cbNum1;
	private JComboBox cbCalc;
	private JComboBox cbNum2;
	private JTextField tfResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI02_test window = new GUI02_test();
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
	public GUI02_test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 676, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getCbNum1());
		frame.getContentPane().add(getCbCalc());
		frame.getContentPane().add(getCbNum2());
		frame.getContentPane().add(getTfResult());
		calcResult();
	}

	private JComboBox getCbNum1() {
		if (cbNum1 == null) {
			cbNum1 = new JComboBox();
			cbNum1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcResult();
				}
			});
			cbNum1.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "4", "5", "6", "7", "8", "9"}));
			cbNum1.setBounds(37, 52, 85, 23);
		}
		return cbNum1;
	}
	private JComboBox getCbCalc() {
		if (cbCalc == null) {
			cbCalc = new JComboBox();
			cbCalc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcResult();
				}
			});
			cbCalc.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "x", "/"}));
			cbCalc.setBounds(153, 52, 91, 23);
		}
		return cbCalc;
	}
	private JComboBox getCbNum2() {
		if (cbNum2 == null) {
			cbNum2 = new JComboBox();
			cbNum2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcResult();
				}
			});
			cbNum2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
			cbNum2.setBounds(256, 52, 85, 23);
		}
		return cbNum2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			tfResult.setBounds(393, 53, 96, 21);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	
	private void calcResult() {
		Double stNum1 = Double.parseDouble(cbNum1.getSelectedItem().toString());
		Double stNum2 = Double.parseDouble(cbNum2.getSelectedItem().toString());
		int i = cbCalc.getSelectedIndex();
		double result = 0;
		
		
		switch(i) {
		case 0 :  result = stNum1 + stNum2;
				break;
		
		case 1 :  result = stNum1 - stNum2;
				break;

		case 2 :  result = stNum1 * stNum2;
				break;

		case 3 :  result = stNum1 / stNum2;
				break;

		}
		
		tfResult.setText(String.format("%.2f", result));
		
	}
	
}
