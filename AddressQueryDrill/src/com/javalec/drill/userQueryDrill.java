package com.javalec.drill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ListSelectionModel;

public class userQueryDrill {

	private JFrame frame;
	private JRadioButton rbInput;
	private JRadioButton rbEdit;
	private JRadioButton rbDelete;
	private JRadioButton rbSearch;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JComboBox cbSearch;
	private JTextField tfSearch;
	private JButton btnSearch;
	private JScrollPane scrollPane_1;
	private JTable inner_Table;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField tfSeqno;
	private JTextField tfName;
	private JTextField tfTelno;
	private JTextField tfAddress;
	private JTextField tfEmail;
	private JTextField tfRelation;
	private JButton btnOk;
	
	//데이터베이스 환경 정의
	private final String url_mysql = "jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
	private final String id_mysql = "root";
	private final String pw_mysqll = "qwer1234";

	//테이블 환경 정의
	private final DefaultTableModel Outter_Table = new DefaultTableModel();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userQueryDrill window = new userQueryDrill();
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
	public userQueryDrill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				tableInit();
				searchAction();
			}
		});
		frame.setTitle("주소록");
		frame.setBounds(100, 100, 572, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getRbInput());
		frame.getContentPane().add(getRbEdit());
		frame.getContentPane().add(getRbDelete());
		frame.getContentPane().add(getRbSearch());
		frame.getContentPane().add(getCbSearch());
		frame.getContentPane().add(getTfSearch());
		frame.getContentPane().add(getBtnSearch());
		frame.getContentPane().add(getScrollPane_1());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getLblNewLabel_4());
		frame.getContentPane().add(getLblNewLabel_5());
		frame.getContentPane().add(getTfSeqno());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getTfTelno());
		frame.getContentPane().add(getTfAddress());
		frame.getContentPane().add(getTfEmail());
		frame.getContentPane().add(getTfRelation());
		frame.getContentPane().add(getBtnOk());
	}
	private JRadioButton getRbInput() {
		if (rbInput == null) {
			rbInput = new JRadioButton("입력");
			buttonGroup.add(rbInput);
			rbInput.setBounds(35, 31, 113, 23);
		}
		return rbInput;
	}
	private JRadioButton getRbEdit() {
		if (rbEdit == null) {
			rbEdit = new JRadioButton("수정");
			buttonGroup.add(rbEdit);
			rbEdit.setBounds(152, 31, 113, 23);
		}
		return rbEdit;
	}
	private JRadioButton getRbDelete() {
		if (rbDelete == null) {
			rbDelete = new JRadioButton("삭제");
			buttonGroup.add(rbDelete);
			rbDelete.setBounds(269, 31, 113, 23);
		}
		return rbDelete;
	}
	private JRadioButton getRbSearch() {
		if (rbSearch == null) {
			rbSearch = new JRadioButton("검색");
			buttonGroup.add(rbSearch);
			rbSearch.setBounds(386, 31, 113, 23);
		}
		return rbSearch;
	}
	private JComboBox getCbSearch() {
		if (cbSearch == null) {
			cbSearch = new JComboBox();
			cbSearch.setModel(new DefaultComboBoxModel(new String[] {"이름", "주소", "관계"}));
			cbSearch.setBounds(46, 74, 59, 23);
		}
		return cbSearch;
	}
	private JTextField getTfSearch() {
		if (tfSearch == null) {
			tfSearch = new JTextField();
			tfSearch.setBounds(133, 75, 272, 21);
			tfSearch.setColumns(10);
		}
		return tfSearch;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("검색");
			btnSearch.setBounds(425, 74, 91, 23);
		}
		return btnSearch;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(45, 107, 471, 117);
			scrollPane_1.setViewportView(getInner_Table());
		}
		return scrollPane_1;
	}
	private JTable getInner_Table() {
		if (inner_Table == null) {
			inner_Table = new JTable();
			inner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			
			inner_Table.setModel(Outter_Table);
		}
		return inner_Table;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Seq No : ");
			lblNewLabel.setBounds(35, 256, 70, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("이름 : ");
			lblNewLabel_1.setBounds(35, 281, 50, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("전화번호 : ");
			lblNewLabel_2.setBounds(35, 309, 65, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("주소 : ");
			lblNewLabel_3.setBounds(35, 334, 50, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("전자우편 :");
			lblNewLabel_4.setBounds(35, 359, 70, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("관계 : ");
			lblNewLabel_5.setBounds(35, 384, 50, 15);
		}
		return lblNewLabel_5;
	}
	private JTextField getTfSeqno() {
		if (tfSeqno == null) {
			tfSeqno = new JTextField();
			tfSeqno.setBounds(117, 253, 399, 21);
			tfSeqno.setColumns(10);
		}
		return tfSeqno;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(117, 278, 399, 21);
		}
		return tfName;
	}
	private JTextField getTfTelno() {
		if (tfTelno == null) {
			tfTelno = new JTextField();
			tfTelno.setColumns(10);
			tfTelno.setBounds(117, 306, 399, 21);
		}
		return tfTelno;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setColumns(10);
			tfAddress.setBounds(117, 331, 399, 21);
		}
		return tfAddress;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(117, 356, 399, 21);
		}
		return tfEmail;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setColumns(10);
			tfRelation.setBounds(117, 381, 399, 21);
		}
		return tfRelation;
	}
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton("OK");
			btnOk.setBounds(408, 420, 91, 23);
		}
		return btnOk;
	}
	
	//테이블 초기와
	private void tableInit() {
		Outter_Table.addColumn("Seq.");
		Outter_Table.addColumn("이름");
		Outter_Table.addColumn("전화번호");
		Outter_Table.addColumn("관계");
		Outter_Table.setColumnCount(4);
		
		int i = Outter_Table.getRowCount();
		for(int j = 0; j<i ; j++) {
			
			Outter_Table.removeRow(0);
		}
		System.out.println(1);
		
		inner_Table.setAutoResizeMode(inner_Table.AUTO_RESIZE_OFF);
		
		System.out.println(2);
		
		int vColIndex = 0;
		TableColumn col = inner_Table.getColumnModel().getColumn(vColIndex);
		int width = 30;
		col.setPreferredWidth(width);
		
		System.out.println(3);
		
		vColIndex = 1;
		col = inner_Table.getColumnModel().getColumn(vColIndex);
		width = 100;
		col.setPreferredWidth(width);
		
		vColIndex = 2;
		col = inner_Table.getColumnModel().getColumn(vColIndex);
		width = 100;
		col.setPreferredWidth(width);
		
		vColIndex = 3;
		col = inner_Table.getColumnModel().getColumn(vColIndex);
		width = 200;
		col.setPreferredWidth(width);
		
		
	}
	
	private void searchAction() {
		
		String query = "select seqno, name, telno, relation from userinfo";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysqll);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(query);
			
			while(rs.next()) {
				String[] qTxt = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
				Outter_Table.addRow(qTxt);

			}
			
			conn_mysql.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}	
		
		
	}
	
}   // ------------------------
