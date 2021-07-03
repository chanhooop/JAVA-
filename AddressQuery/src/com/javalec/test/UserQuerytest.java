package com.javalec.test;

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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class UserQuerytest {

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
	
	
	private JTextField tfCount;
	private JLabel lblNewLabel_6;
	private JButton btnEdit;
	private JButton btnDelete;
	private JButton btnOK;
	private JRadioButton rbInput;
	private JRadioButton rbEdit;
	private JRadioButton rbDelet;
	private JRadioButton rbSearch;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserQuerytest window = new UserQuerytest();
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
	public UserQuerytest() {
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
		frame.setBounds(100, 100, 482, 456);
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
		frame.getContentPane().add(getTfCount());
		frame.getContentPane().add(getLblNewLabel_6());
		frame.getContentPane().add(getBtnEdit());
		frame.getContentPane().add(getBtnDelete());
		frame.getContentPane().add(getBtnOK());
		frame.getContentPane().add(getRbInput());
		frame.getContentPane().add(getRbEdit());
		frame.getContentPane().add(getRbDelet());
		frame.getContentPane().add(getRbSearch());
	}
	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			cbSelection.setModel(new DefaultComboBoxModel(new String[] {"이름", "주소", "관계"}));
			cbSelection.setBounds(30, 37, 60, 23);
		}
		return cbSelection;
	}
	private JTextField getTfSelection() {
		if (tfSelection == null) {
			tfSelection = new JTextField();
			tfSelection.setBounds(102, 38, 229, 21);
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
			btnQuery.setBounds(343, 37, 91, 23);
		}
		return btnQuery;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(30, 70, 413, 111);
			scrollPane.setViewportView(getInner_Table());
		}
		return scrollPane;
	}
	

	private JTable getInner_Table() {
		if (inner_Table == null) {
			inner_Table = new JTable();
			inner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tableClick();
				}
			});
			inner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			
			inner_Table.setModel(Outer_Table); 			// 이 부분이 중요함
		}
		return inner_Table;
	}
	
	
	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Seq No : ");
			lblNewLabel.setBounds(25, 194, 71, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTfSeqno() {
		if (tfSeqno == null) {
			tfSeqno = new JTextField();
			tfSeqno.setEditable(false);
			tfSeqno.setBounds(86, 191, 60, 21);
			tfSeqno.setColumns(10);
		}
		return tfSeqno;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(86, 219, 166, 21);
		}
		return tfName;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("이름 : ");
			lblNewLabel_1.setBounds(25, 222, 71, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfTelno() {
		if (tfTelno == null) {
			tfTelno = new JTextField();
			tfTelno.setColumns(10);
			tfTelno.setBounds(86, 250, 166, 21);
		}
		return tfTelno;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("전화번호 : ");
			lblNewLabel_2.setBounds(25, 253, 71, 15);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setColumns(10);
			tfAddress.setBounds(86, 281, 265, 21);
		}
		return tfAddress;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("주소 : ");
			lblNewLabel_3.setBounds(25, 284, 71, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(86, 312, 229, 21);
		}
		return tfEmail;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("전자우편 : ");
			lblNewLabel_4.setBounds(25, 315, 71, 15);
		}
		return lblNewLabel_4;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setColumns(10);
			tfRelation.setBounds(86, 343, 265, 21);
		}
		return tfRelation;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("관계 : ");
			lblNewLabel_5.setBounds(25, 346, 71, 15);
		}
		return lblNewLabel_5;
	}
	
	//테이블 클릭
	private void tableClick() {
		int i = inner_Table.getSelectedRow();   // 선택된 데이터 한줄 가져오기
		String wkSeq = (String) inner_Table.getValueAt(i, 0);			//getValueAt(행값,열값)
		
		String query1 = "select seqno, name, telno, address, email, relation from userinfo ";
		String query2 = "where seqno = ";
		
		System.out.println(wkSeq);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysqll);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(query1 + query2 + wkSeq);
			
			
			if(rs.next()) {									
				tfSeqno.setText(rs.getString(1));  		    //쿼리문에서 select된 (n)번째 컬럼
				tfName.setText(rs.getString(2));
				tfTelno.setText(rs.getString(3));
				tfAddress.setText(rs.getString(4));
				tfEmail.setText(rs.getString(5));
				tfRelation.setText(rs.getString(6));
			}
			
			conn_mysql.close();

			
		} catch(Exception e) {
			e.printStackTrace();
		}	
	
		
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
		int dataCount = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysqll);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(query);
			
			while(rs.next()) {			// next()랑 getString() 은 세트다 next는 불린값을 출력, getString(i)의 i는 컬럼인덱스번호임.
				String[] qTxt = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
				Outer_Table.addRow(qTxt);
				dataCount++;
			}
			
			conn_mysql.close();
			tfCount.setText(Integer.toString(dataCount));
			
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
		System.out.println(conditionQueryColumn);	
		
		tableInit(); 									// 지우는 용도
		clearColumn();
		conditionQueryAction(conditionQueryColumn);
	}
	
	private void conditionQueryAction(String columnName) {
		String query1 = "select seqno, name, telno, relation from userinfo where " + columnName;
		String query2 = " like '%" + tfSelection.getText() + "%'";
		System.out.println(query1 + query2);
		int dataCount = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysqll);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(query1 + query2);
			
			while(rs.next()) {
				String[] qTxt = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
				Outer_Table.addRow(qTxt);
				dataCount++;
			}
			conn_mysql.close();
			tfCount.setText(Integer.toString(dataCount));
			
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
		tfCount.setText("");
	}
	private JTextField getTfCount() {
		if (tfCount == null) {
			tfCount = new JTextField();
			tfCount.setHorizontalAlignment(SwingConstants.TRAILING);
			tfCount.setBounds(309, 188, 49, 21);
			tfCount.setColumns(10);
		}
		return tfCount;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("명");
			lblNewLabel_6.setBounds(370, 191, 50, 15);
		}
		return lblNewLabel_6;
	}
	private JButton getBtnEdit() {
		if (btnEdit == null) {
			btnEdit = new JButton("수정");
			btnEdit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionEdit();
				}
			});
			btnEdit.setBounds(30, 386, 91, 23);
		}
		return btnEdit;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("삭제");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionDelete();
				}
			});
			btnDelete.setBounds(160, 386, 91, 23);
		}
		return btnDelete;
	}
	
	
	private void actionDelete() {
		int i = inner_Table.getSelectedRow();   // 데이터 한줄 가져오기
		String wkSeq = (String) inner_Table.getValueAt(i, 0);			//getValueAt(행값,열값)
		
		String query1 = "delete from userinfo where seqno =" + wkSeq;
		
		
		
		System.out.println(wkSeq);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysqll);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			stmt_mysql.executeUpdate(query1);
			
			
			conn_mysql.close();

			
		} catch(Exception e) {
			e.printStackTrace();
		}	
		clearColumn();
		tableInit();
		searchAction();

	}
	
	private void actionEdit() {
		
	
		//UPDATE `useraddress`.`userinfo` SET `name` = 'chan', `telno` = '2325', `address` = 'dfklnjsdkl', `email` = 'askldmfk', `relation` = 'klsdmvcd' WHERE (`seqno` = '5');
		String query1 = "update userinfo set name = '" + tfName.getText() +"', telno = '" + tfTelno.getText() + "', address = '" + tfAddress.getText() + "', email = '" + tfEmail.getText() + "', relation = '" + tfRelation.getText() + "' where(seqno = '"+ tfSeqno.getText()+"')";
		
		
		
		System.out.println(query1);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysqll);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			stmt_mysql.executeUpdate(query1);
			
			
			conn_mysql.close();

			
		} catch(Exception e) {
			e.printStackTrace();
		}
		clearColumn();
		tableInit();
		searchAction();
	}
	
	

	
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionOK();
				}
			});
			btnOK.setBounds(343, 386, 91, 23);
		}
		return btnOK;
	}
	private JRadioButton getRbInput() {
		if (rbInput == null) {
			rbInput = new JRadioButton("입력");
			buttonGroup.add(rbInput);
			rbInput.setBounds(30, 8, 113, 23);
		}
		return rbInput;
	}
	private JRadioButton getRbEdit() {
		if (rbEdit == null) {
			rbEdit = new JRadioButton("수정");
			buttonGroup.add(rbEdit);
			rbEdit.setBounds(139, 8, 113, 23);
		}
		return rbEdit;
	}
	private JRadioButton getRbDelet() {
		if (rbDelet == null) {
			rbDelet = new JRadioButton("삭제");
			buttonGroup.add(rbDelet);
			rbDelet.setBounds(238, 9, 113, 23);
		}
		return rbDelet;
	}
	private JRadioButton getRbSearch() {
		if (rbSearch == null) {
			rbSearch = new JRadioButton("검색");
			buttonGroup.add(rbSearch);
			rbSearch.setBounds(347, 8, 113, 23);
		}
		return rbSearch;
	}
	
	private void actionOK() {
		
		if(rbEdit.isSelected()) {
			String query1 = "update userinfo set name = '" + tfName.getText() +"', telno = '" + tfTelno.getText() + "', address = '" + tfAddress.getText() + "', email = '" + tfEmail.getText() + "', relation = '" + tfRelation.getText() + "' where(seqno = '"+ tfSeqno.getText()+"')";


			System.out.println(query1);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysqll);
				Statement stmt_mysql = conn_mysql.createStatement();
				
				stmt_mysql.executeUpdate(query1);
				
				
				conn_mysql.close();

				
			} catch(Exception e) {
				e.printStackTrace();
			}
			clearColumn();
			tableInit();
			searchAction();
			
		}

		if(rbDelet.isSelected()) {
			String query1 = "delete from userinfo where seqno = " + tfSeqno.getText();
			System.out.println(query1);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysqll);
				Statement stmt_mysql = conn_mysql.createStatement();
				
				stmt_mysql.executeUpdate(query1);		
				conn_mysql.close();
			
			} catch(Exception e) {
				e.printStackTrace();
			}
			clearColumn();
			tableInit();
			searchAction();
			
		}
		if(rbInput.isSelected()) {
			int i_chk = insertFieldCheck();									//이해하고가자
			if(i_chk == 0) {
				insertAction();
			}
			clearColumn();
			tableInit();
			searchAction();
			
		}
		
		if(rbSearch.isSelected()) {
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
//			System.out.println(conditionQueryColumn);	
			
			tableInit(); 									// 지우는 용도
			clearColumn();
			conditionQueryAction(conditionQueryColumn);
			
		}
		
	}
	
	private int insertFieldCheck() {												//여기로
		int i = 0;
		String message = "";
		if(tfName.getText().trim().length() == 0) {
			i++;
			message = "이름을 ";
			tfName.requestFocus();
		}
		if(tfTelno.getText().trim().length() == 0) {
			i++;
			message = "전화번호를 ";
			tfTelno.requestFocus();
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
			ps.setString(2, tfTelno.getText().trim());
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
	
	
	
} // --------







