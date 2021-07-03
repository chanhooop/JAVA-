package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.ListSelectionModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserQuery {

	private JFrame frame;
	private JComboBox cbSelection;
	private JTextField tfSelection;
	private JButton tbnQuery;
	private JScrollPane scrollPane;
	private JTable Inner_Table;
	private JLabel lblNewLabel;
	private JTextField tfSeqno;
	private JLabel lblNewLabel_1;
	private JTextField tfName;
	private JLabel lblPh;
	private JTextField tfTelno;

	private final String url_mysql = "jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
	private final String id_mysql = "root";
	private final String pw_mysql = "qwer1234";

	/*
	 * Table 환경정의
	 */
	private final DefaultTableModel Outer_Table = new DefaultTableModel();
	private JTextField tfCount;
	private JLabel lblNewLabel_2;
	private JButton btnEdit;
	private JButton btnDelete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserQuery window = new UserQuery();
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
	public UserQuery() {
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
		frame.setTitle("주소록검색");
		frame.setBounds(100, 100, 606, 693);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getCbSelection());
		frame.getContentPane().add(getTfSelection());
		frame.getContentPane().add(getTbnQuery());
		frame.getContentPane().add(getScrollPane_1());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfSeqno());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getLblPh());
		frame.getContentPane().add(getTfTelno());
		frame.getContentPane().add(getTfCount());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getBtnEdit());
		frame.getContentPane().add(getBtnDelete());
	}

	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.setModel(new DefaultComboBoxModel(new String[] { "이름", "주소", "번호" }));
			cbSelection.setBounds(6, 6, 88, 27);
		}
		return cbSelection;
	}

	private JTextField getTfSelection() {
		if (tfSelection == null) {
			tfSelection = new JTextField();
			tfSelection.setBounds(106, 5, 365, 26);
			tfSelection.setColumns(10);
		}
		return tfSelection;
	}

	private JButton getTbnQuery() {
		if (tbnQuery == null) {
			tbnQuery = new JButton("검색");
			tbnQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					conditionQuery();
				}
			});
			tbnQuery.setBounds(483, 5, 117, 29);
		}
		return tbnQuery;
	}

	private JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setEnabled(false);
			scrollPane.setBounds(6, 45, 594, 275);
			scrollPane.setViewportView(getInner_Table());
		}
		return scrollPane;
	}

	private JTable getInner_Table() {
		if (Inner_Table == null) {
			Inner_Table = new JTable();
			Inner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tableClick();
				}

			});
			Inner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			Inner_Table.setModel(Outer_Table); // 안쪽테이블과 바깥쪽 테이블이서로 연동
			// private final DefaultTableModel Outer_Table = new DefaultTableModel();
			// 필수

		}
		return Inner_Table;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Seq No");
			lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel.setBounds(6, 374, 61, 16);
		}
		return lblNewLabel;
	}

	private JTextField getTfSeqno() {
		if (tfSeqno == null) {
			tfSeqno = new JTextField();
			tfSeqno.setEditable(false);
			tfSeqno.setBounds(79, 369, 130, 26);
			tfSeqno.setColumns(10);
		}
		return tfSeqno;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("이름");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1.setBounds(6, 412, 61, 16);
		}
		return lblNewLabel_1;
	}

	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setEditable(false);
			tfName.setColumns(10);
			tfName.setBounds(79, 407, 130, 26);
		}
		return tfName;
	}

	private JLabel getLblPh() {
		if (lblPh == null) {
			lblPh = new JLabel("PH");
			lblPh.setHorizontalAlignment(SwingConstants.RIGHT);
			lblPh.setBounds(6, 450, 61, 16);
		}
		return lblPh;
	}

	private JTextField getTfTelno() {
		if (tfTelno == null) {
			tfTelno = new JTextField();
			tfTelno.setEditable(false);
			tfTelno.setColumns(10);
			tfTelno.setBounds(79, 445, 130, 26);
		}
		return tfTelno;
	}

	private JTextField getTfCount() {
		if (tfCount == null) {
			tfCount = new JTextField();
			tfCount.setBackground(Color.WHITE);
			tfCount.setForeground(Color.BLACK);
			tfCount.setEditable(false);
			tfCount.setHorizontalAlignment(SwingConstants.RIGHT);
			tfCount.setBounds(470, 327, 88, 26);
			tfCount.setColumns(10);
		}
		return tfCount;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("명");
			lblNewLabel_2.setBounds(560, 332, 61, 16);
		}
		return lblNewLabel_2;
	}

	// _____________________________________________________________________________________________________________________
	// 화면 Table 초기화
	private void tableInit() {
		Outer_Table.addColumn("순서 ");
		Outer_Table.addColumn("이름 ");
		Outer_Table.addColumn("PH ");
		Outer_Table.addColumn("관계 ");
		Outer_Table.setColumnCount(4);

		int i = Outer_Table.getRowCount();
		for (int j = 0; j < i; j++) {
			Outer_Table.removeRow(0);
		}

		Inner_Table.setAutoResizeMode(Inner_Table.AUTO_RESIZE_OFF); // 테이블사이즈 조정불가

		int vColIndex = 0;
		TableColumn col = Inner_Table.getColumnModel().getColumn(vColIndex);
		int width = 30;
		col.setPreferredWidth(width);

		vColIndex = 1;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 100;
		col.setPreferredWidth(width);

		vColIndex = 2;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 200;
		col.setPreferredWidth(width);
	}

	private void searchAction() {
		String query = "select seqno, name, telno, relation from userinfo";
		int dataCount = 0;
		try {
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement(); // 선언문

			ResultSet rs = stmt_mysql.executeQuery(query); // 데이터베이스에 쿼리를 실행한 상태, 아직 안가져옴

			while (rs.next()) { // re에 가저올게 있으면 와일문이 계속 작동한다
				String[] qTxt = { rs.getString(1), rs.getString(2), rs.getString(3) };
				Outer_Table.addRow(qTxt);
				dataCount++;
			}
			conn_mysql.close();
			tfCount.setText(Integer.toString(dataCount));

		} catch (Exception e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
		}
	}

	// Table clicked
	private void tableClick() {
		// TODO Auto-generated method stub
		int i = Inner_Table.getSelectedRow(); // 리스트에서 선택한 순서번호를 클릭한다
		String wkSeq = (String) Inner_Table.getValueAt(i, 0); // i,0 -> i행번의 0번쨰 컬럼 값을 가져온다.
		String query1 = "select seqno, name, telno, relation from userinfo";
		String query2 = "where seqno =";
		// select 1, 2, 3, 4/ from ~/ where ~/
		// 여기서 1은 seqno 이다. 이 1은 밑에 String[] qTxt 배열의 0번쨰에 들어간다.

		JTextField[] JTextFieldArray = { tfSeqno, tfName, tfTelno };
		System.out.println(JTextFieldArray);
		try {
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			System.out.println(JTextFieldArray);
			Statement stmt_mysql = conn_mysql.createStatement(); // 선언문

//			ResultSet rs = stmt_mysql.executeQuery(query); // 데이터베이스에 쿼리를 실행한 상태, 아직 안가져옴
			ResultSet rs = stmt_mysql.executeQuery(query1 + query2 + wkSeq);
			if (rs.next()) { // 아래 qTxt 실행하려면 next() 가 있어야함
//				String[] qTxt = { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
//				//위에 query 에서 4개값(seqno, name, telno, relation)만 검색해서 배열 최대길이가 4 다.
//				tfSeqno.setText(qTxt[1]);
//				tfName.setText(qTxt[2]);
//				tfTelno.setText(qTxt[3]);
				for (i = 0; i < JTextFieldArray.length; i++) {
					JTextFieldArray[i].setText(rs.getString(i + 1));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
		}

	}

	private void conditionQuery() {
		// TODO Auto-generated method stub
		int i = cbSelection.getSelectedIndex(); // 콤보박스 의 배열 넘버를 가저온다
		String conditionQueryColumn = "";
		switch (i) {
		case 0:
			conditionQueryColumn = "name";
			break;
		case 1:
			conditionQueryColumn = "address";
			break;
		case 2:
			conditionQueryColumn = "relation";
			break;

		default:
			break;
		}
		clearColumn();
		tableInit();
		conditionQueryAction(conditionQueryColumn);
	}
	private void clearColumn() {
		tfSeqno.setText("");
		tfName.setText("");
		tfTelno.setText("");
		tfCount.setText("");
	}
	private void conditionQueryAction(String columnName) {
		
		String query1 = "select seqno, name, telno, relation from userinfo where " + columnName;
		String query2 = " like '%" + tfSelection.getText() + "%'";
		
		System.out.println(query1 + query2);
		
		int dataCount = 0;
		try {
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement(); // 선언문

			ResultSet rs = stmt_mysql.executeQuery(query1 + query2); // 데이터베이스에 쿼리를 실행한 상태, 아직 안가져옴

			while (rs.next()) { // re에 가저올게 있으면 와일문이 계속 작동한다
				String[] qTxt = { rs.getString(1), rs.getString(2), rs.getString(3) };
				Outer_Table.addRow(qTxt);
				dataCount++;
			}
			conn_mysql.close();
			tfCount.setText(Integer.toString(dataCount));

		} catch (Exception e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
		}

	}
	private JButton getBtnEdit() {
		if (btnEdit == null) {
			btnEdit = new JButton("수정");
			btnEdit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionEdit();
				}
			});
			btnEdit.setBounds(163, 583, 91, 23);
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
			btnDelete.setBounds(357, 583, 91, 23);
		}
		return btnDelete;
	}
	
	private void actionDelete() {
		
		
	}
	
	private void actionEdit() {
		
		
	}
	
}