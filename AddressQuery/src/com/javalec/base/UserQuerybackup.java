package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserQuerybackup {

	private JFrame frame;
	private JComboBox cbSelection;
	private JTextField tfSelection;
	private JButton btnQuery;
	private JScrollPane scrollPane;
	private JTable inner_Table;
	private JLabel lblNewLabel;
	private JTextField tfSeqno;
	private JTextField tfName;
	private JLabel lblNewLabel_1;
	private JTextField tfTelno;
	private JLabel lblNewLabel_2;
	private JTextField tfAddress;
	private JLabel lblNewLabel_3;
	private JTextField tfEmail;
	private JLabel lblNewLabel_4;
	private JTextField tfRelation;
	private JLabel lblNewLabel_5;
	
	//117.111.22.88   127.0.0.1
	
	//데이터베이스 환경 정의
	private final String url_mysql = "jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
	private final String id_mysql = "root";
	private final String pw_mysqll = "qwer1234";
	
	// Table 환경 정의
	private final DefaultTableModel Outer_Table = new DefaultTableModel();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserQuerybackup window = new UserQuerybackup();
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
	public UserQuerybackup() {
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
		frame.setTitle("주소록 검색");
		frame.setBounds(100, 100, 482, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getCbSelection());
		frame.getContentPane().add(getTfSelection());
		frame.getContentPane().add(getBtnQuery());
		frame.getContentPane().add(getScrollPane());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfSeqno());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfTelno());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getTfAddress());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getTfEmail());
		frame.getContentPane().add(getLblNewLabel_4());
		frame.getContentPane().add(getTfRelation());
		frame.getContentPane().add(getLblNewLabel_5());
	}
	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.setModel(new DefaultComboBoxModel(new String[] {"이름", "주소", "관계"}));
			cbSelection.setBounds(27, 24, 60, 23);
		}
		return cbSelection;
	}
	private JTextField getTfSelection() {
		if (tfSelection == null) {
			tfSelection = new JTextField();
			tfSelection.setBounds(99, 25, 229, 21);
			tfSelection.setColumns(10);
		}
		return tfSelection;
	}
	private JButton getBtnQuery() {
		if (btnQuery == null) {
			btnQuery = new JButton("검색");
			btnQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					conditionQuery();                             // 조건검색
				}
			});
			btnQuery.setBounds(340, 24, 91, 23);
		}
		return btnQuery;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(22, 57, 413, 111);
			scrollPane.setViewportView(getInner_Table());
		}
		return scrollPane;
	}
	

	private JTable getInner_Table() {
		if (inner_Table == null) {
			inner_Table = new JTable();
			inner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			
			inner_Table.setModel(Outer_Table); 			// 이 부분이 중요함
		}
		return inner_Table;
	}
	
	
	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Seq No : ");
			lblNewLabel.setBounds(22, 181, 71, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTfSeqno() {
		if (tfSeqno == null) {
			tfSeqno = new JTextField();
			tfSeqno.setBounds(83, 178, 60, 21);
			tfSeqno.setColumns(10);
		}
		return tfSeqno;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(83, 206, 166, 21);
		}
		return tfName;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("이름 : ");
			lblNewLabel_1.setBounds(22, 209, 71, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfTelno() {
		if (tfTelno == null) {
			tfTelno = new JTextField();
			tfTelno.setColumns(10);
			tfTelno.setBounds(83, 237, 166, 21);
		}
		return tfTelno;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("전화번호 : ");
			lblNewLabel_2.setBounds(22, 240, 71, 15);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setColumns(10);
			tfAddress.setBounds(83, 268, 313, 21);
		}
		return tfAddress;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("주소 : ");
			lblNewLabel_3.setBounds(22, 271, 71, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(83, 299, 229, 21);
		}
		return tfEmail;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("전자우편 : ");
			lblNewLabel_4.setBounds(22, 302, 71, 15);
		}
		return lblNewLabel_4;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setColumns(10);
			tfRelation.setBounds(83, 330, 313, 21);
		}
		return tfRelation;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("관계 : ");
			lblNewLabel_5.setBounds(22, 333, 71, 15);
		}
		return lblNewLabel_5;
	}
	
	//화면 Table 초기화
	private void tableInit() {
		Outer_Table.addColumn("순서");
		Outer_Table.addColumn("이름");
		Outer_Table.addColumn("전화번호");
		Outer_Table.addColumn("관계");
		Outer_Table.setColumnCount(4);
		
		int i = Outer_Table.getRowCount();
		for(int j=0; j<i; j++) {
			Outer_Table.removeRow(0);
		}
		
		inner_Table.setAutoResizeMode(inner_Table.AUTO_RESIZE_OFF);
		
		int vColIndex = 0;
		TableColumn col = inner_Table.getColumnModel().getColumn(vColIndex);
		int width = 30;
		col.setPreferredWidth(width);
		
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
				Outer_Table.addRow(qTxt);
			}
			
			conn_mysql.close();
		} catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	// 조건 검색
	private void conditionQuery() {
		int i = cbSelection.getSelectedIndex();  // 몇번쨰인지 알아봐주는 메서드 겟셀렉티드 인덱스
		String conditionQueryColumn = "";
		switch(i) {
		case 0 : 
			conditionQueryColumn = "name";
			break;
		case 1 : 
			conditionQueryColumn = "address";
			break;
		case 2 : 
			conditionQueryColumn = "relation";
			break;
		default : 
			break;
		
		}
//		System.out.println(conditionQueryColumn);	
		
		tableInit(); 									// 지우는 용도
		clearColumn();
		conditionQueryAction(conditionQueryColumn);
	}
	
	private void conditionQueryAction(String columnName) {
		String query1 = "select seqno, name, telno, relation from userinfo where" + columnName;
		String query2 = " like '%" + tfSelection.getText() + "%'";
//		System.out.println(query1 + query2);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysqll);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(query1 + query2);
			
			while(rs.next()) {
				String[] qTxt = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
				Outer_Table.addRow(qTxt);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}	
		
	}
	
	private void clearColumn() {   // 화면지우기 메서드
		tfSeqno.setText("");
		tfName.setText("");
		tfTelno.setText("");
		tfAddress.setText("");
		tfEmail.setText("");
		tfRelation.setText("");
//		tfCount.setText("");
	}
	
	
} // --------







