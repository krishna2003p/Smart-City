package mySQL;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class AdminHomepage {

	private JFrame frame;
	JLabel agra,delhi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHomepage window = new AdminHomepage();
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
	public AdminHomepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setVisible(true);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width,screen.height);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 60, 1350, 669);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 60, 1350, 669);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 1350, 400);
		panel1.setLayout(new GridLayout(1,1));
		panel1.setVisible(true);
		panel_1.add(panel1);
		
		JTable table = new JTable();
		table.setSize(new Dimension(10, 50));
		table.setRowMargin(5);
		table.setRowHeight(40);
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"First Name", "Last Name", "Father Name", "Gender", "Mobile", "Email", "Country", "City", "Pasword"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(20);
		table.getColumnModel().getColumn(4).setPreferredWidth(40);
		table.getColumnModel().getColumn(5).setPreferredWidth(150);
		table.getColumnModel().getColumn(6).setPreferredWidth(30);
		table.getColumnModel().getColumn(7).setPreferredWidth(30);
		table.getColumnModel().setColumnMargin(10);
		table.setBounds(0, 0, 1350, 400);
		table.setVisible(true);
		
		JTableHeader header = table.getTableHeader();
		header.setBorder(null);
		header.setBounds(0, 0, 20, 100);
		header.setBackground(Color.red);
		header.setAlignmentY(10);
		header.setFont(new Font("Tahoma",Font.BOLD,20));
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcity","root","");
		PreparedStatement pr=con.prepareStatement("Select* from user");
		ResultSet rs=pr.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		String col=rsmd.getColumnName(1);
		DefaultTableModel dtm=(DefaultTableModel)table.getModel();
		dtm.setRowCount(0);
		while(rs.next())
		{
			Vector v = new Vector();
				v.add(rs.getString(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));
				v.add(rs.getString(5));
				v.add(rs.getString(6));
				v.add(rs.getString(7));
				v.add(rs.getString(8));
				v.add(rs.getString(9));
			dtm.addRow(v);
		}
				panel1.add(new JScrollPane(table));
				
				JTextField textField = new JTextField();
				textField.setHorizontalAlignment(SwingConstants.CENTER);
				textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
				textField.setBounds(93, 506, 670, 40);
				panel_1.add(textField);
				textField.setColumns(10);
				
				JLabel usern = new JLabel("Username ");
				usern.setForeground(new Color(107, 142, 35));
				usern.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
				usern.setBounds(93, 447, 272, 50);
				panel_1.add(usern);
				
				JTextField textField_1 = new JTextField();
				textField_1.setFont(new Font("Tahoma", Font.BOLD, 13));
				textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
				textField_1.setForeground(new Color(255, 0, 0));
				textField_1.setOpaque(false);
				textField_1.setBorder(null);
				textField_1.setEditable(false);
				textField_1.setBounds(432, 472, 331, 23);
				panel_1.add(textField_1);
				textField_1.setColumns(10);
				
				JButton btn=new JButton("Show Data");
				btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
						String userName=textField.getText();
						String sql="select * from user where email=?";
						PreparedStatement pr2;
							pr2=con.prepareStatement(sql);
							pr2.setString(1, userName);
							ResultSet rs=pr2.executeQuery();
							ResultSetMetaData rsmd = rs.getMetaData();
							String col=rsmd.getColumnName(1);
							DefaultTableModel dtm=(DefaultTableModel)table.getModel();
							dtm.setRowCount(0);
							if(rs.next()) {
									Vector v1 = new Vector();
									v1.add(rs.getString(1));
									v1.add(rs.getString(2));
									v1.add(rs.getString(3));
									v1.add(rs.getString(4));
									v1.add(rs.getString(5));
									v1.add(rs.getString(6));
									v1.add(rs.getString(7));
									v1.add(rs.getString(8));
									v1.add(rs.getString(9));
								dtm.addRow(v1);
							}
							else {
								textField_1.setText("Record Not Found");
							}
							
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
				});
				btn.setForeground(new Color(255, 0, 0));
				btn.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn.setBounds(164,590,180,50);
				panel_1.add(btn);
				
				JButton btn1=new JButton("Delete Data");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							String userName=textField.getText();
							String sql="delete from user where email=?";
							PreparedStatement pr2;
								pr2=con.prepareStatement(sql);
								pr2.setString(1, userName);
								boolean b=pr2.execute();
								System.out.println(b);
								if(b==false) {
									JOptionPane.showMessageDialog(null, "Record Successfully Deleted");
								
								PreparedStatement pr1=con.prepareStatement("Select* from user");
								ResultSet rs=pr.executeQuery();
								ResultSetMetaData rsmd = rs.getMetaData();
								String col=rsmd.getColumnName(1);
								DefaultTableModel dtm=(DefaultTableModel)table.getModel();
								dtm.setRowCount(0);
								while(rs.next())
								{
									Vector v = new Vector();
										v.add(rs.getString(1));
										v.add(rs.getString(2));
										v.add(rs.getString(3));
										v.add(rs.getString(4));
										v.add(rs.getString(5));
										v.add(rs.getString(6));
										v.add(rs.getString(7));
										v.add(rs.getString(8));
										v.add(rs.getString(9));
									dtm.addRow(v);
								}
							}
							else {
								textField_1.setText("Record Not Found");
							}
					
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
					
				}
			});
			btn1.setForeground(new Color(255, 0, 0));
			btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
			btn1.setBounds(487,590,180,50);
			panel_1.add(btn1);
			
			JPanel panel2 = new JPanel();
			panel2.setBounds(0, 0, 1350, 400);
			panel2.setLayout(new GridLayout(1,1));
			panel2.setVisible(true);
			panel_1.add(panel2);
			
			JTable table_1 = new JTable();
			table_1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			table_1.setSize(new Dimension(10, 50));
			table_1.setRowMargin(5);
			table_1.setRowHeight(40);
			table_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			table_1.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Name", "Mobile", "Nationality", "Queries", "Feedback"
				}
			));
			table_1.getColumnModel().getColumn(0).setPreferredWidth(20);
			table_1.getColumnModel().getColumn(1).setPreferredWidth(20);
			table_1.getColumnModel().getColumn(2).setPreferredWidth(20);
			table_1.getColumnModel().getColumn(3).setPreferredWidth(250);
			table_1.getColumnModel().getColumn(4).setPreferredWidth(250);
			table_1.getColumnModel().setColumnMargin(10);
			table_1.setBounds(0, 0, 1350, 400);
			table_1.setVisible(true);
			
			JTableHeader header1 = table_1.getTableHeader();
			header1.setBorder(null);
			header1.setBounds(0, 0, 20, 100);
			header1.setBackground(Color.red);
			header1.setAlignmentY(10);
			header1.setFont(new Font("Tahoma",Font.BOLD,20));
			
			try {
			PreparedStatement pr1=con.prepareStatement("Select* from feedback");
			ResultSet rs1=pr1.executeQuery();
			ResultSetMetaData rsmd1 = rs1.getMetaData();
			String col1=rsmd1.getColumnName(1);
			DefaultTableModel dtm1=(DefaultTableModel)table_1.getModel();
			dtm1.setRowCount(0);
			while(rs1.next())
			{
				Vector v = new Vector();
					v.add(rs1.getString(1));
					v.add(rs1.getString(2));
					v.add(rs1.getString(3));
					v.add(rs1.getString(4));
					v.add(rs1.getString(5));
				dtm1.addRow(v);
			}
			panel2.add(new JScrollPane(table_1));	
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			
			JButton btnShowQuery = new JButton("Show Queries  Table");
			btnShowQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel1.show(false);
					panel2.show(true);
					
				}
			});
			btnShowQuery.setForeground(Color.RED);
			btnShowQuery.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnShowQuery.setBounds(900, 590, 374, 50);
			panel_1.add(btnShowQuery);
			
			JButton btnShowAllUsers = new JButton("Show All Users");
			btnShowAllUsers.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel2.show(false);
					panel1.show(true);
				}
			});
			btnShowAllUsers.setForeground(Color.RED);
			btnShowAllUsers.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnShowAllUsers.setBounds(900, 460, 374, 50);
			panel_1.add(btnShowAllUsers);
		}
		catch (Exception e) {
			// TODO: handle exception
		}	
			
		
		agra = new JLabel("AGRA");
		agra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new Agra();
			}
			public void mouseEntered(MouseEvent e) {
				agra.setForeground(new Color(0,0,225));
				agra.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				agra.setForeground(new Color(139, 0, 0));
				agra.setBackground(new Color(143,188,143));
			}
		});
		agra.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		agra.setOpaque(true);
		agra.setBackground(new Color(143, 188, 143));
		agra.setForeground(new Color(139, 0, 0));
		agra.setHorizontalAlignment(SwingConstants.CENTER);
		agra.setFont(new Font("Tahoma", Font.BOLD, 22));
		agra.setBounds(0, 0, 250, 45);
		panel.add(agra);
		
		delhi = new JLabel("DELHI");
		delhi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new Delhi();
			}
			public void mouseEntered(MouseEvent e) {
				delhi.setForeground(new Color(0,0,225));
				delhi.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				delhi.setForeground(new Color(139, 0, 0));
				delhi.setBackground(new Color(143,188,143));
			}
		});
		
		delhi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		delhi.setBackground(new Color(143, 188, 143));
		delhi.setOpaque(true);
		delhi.setHorizontalAlignment(SwingConstants.CENTER);
		delhi.setForeground(new Color(139, 0, 0));
		delhi.setFont(new Font("Tahoma", Font.BOLD, 22));
		delhi.setBounds(1045, 0, 305, 45);
		panel.add(delhi);
		
		JLabel lblNewLabel_1_3 = new JLabel("MUMBAI");
		lblNewLabel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new Mumbai();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_3.setForeground(new Color(0,0,225));
				lblNewLabel_1_3.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_3.setForeground(new Color(139, 0, 0));
				lblNewLabel_1_3.setBackground(new Color(143,188,143));
			}
		});
		lblNewLabel_1_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_3.setOpaque(true);
		lblNewLabel_1_3.setBackground(new Color(143, 188, 143));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(new Color(139, 0, 0));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_3.setBounds(500, 0, 300, 45);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("BANGALORE");
		lblNewLabel_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new Bengluru();
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_4.setForeground(new Color(0,0,225));
				lblNewLabel_1_4.setBackground(new Color(139,0,0));
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_4.setForeground(new Color(139,0,0));
				lblNewLabel_1_4.setBackground(new Color(143,188,143));
			}
		});
		lblNewLabel_1_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_4.setBackground(new Color(143, 188, 143));
		lblNewLabel_1_4.setOpaque(true);
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setForeground(new Color(139, 0, 0));
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_4.setBounds(250, 0, 250, 45);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("LUCKNOW");
		lblNewLabel_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new Lucknow();
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_5.setForeground(new Color(0,0,225));
				lblNewLabel_1_5.setBackground(new Color(139,0,0));
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_5.setForeground(new Color(139,0,0));
				lblNewLabel_1_5.setBackground(new Color(143,188,143));
			}
		});
		lblNewLabel_1_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_5.setOpaque(true);
		lblNewLabel_1_5.setBackground(new Color(143, 188, 143));
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setForeground(new Color(139, 0, 0));
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_5.setBounds(797, 0, 250, 45);
		panel.add(lblNewLabel_1_5);
		
		JLabel agra_1=new JLabel("Agra");
		agra_1.setForeground(new Color(139, 0, 0));
		agra_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		agra_1.setBounds(160, 50, 100, 50);
		panel.add(agra_1);
		
		JLabel beng=new JLabel("Lucknow");
		beng.setForeground(new Color(139, 0, 0));
		beng.setFont(new Font("Tahoma", Font.BOLD, 25));
		beng.setBounds(800, 50, 150, 50);
		panel.add(beng);
		
		JLabel delhi_1=new JLabel("Delhi");
		delhi_1.setForeground(new Color(139, 0, 0));
		delhi_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		delhi_1.setBounds(60, 350, 100, 50);
		panel.add(delhi_1);
		
		JLabel mumb=new JLabel("Mumbai");
		mumb.setForeground(new Color(139, 0, 0));
		mumb.setFont(new Font("Tahoma", Font.BOLD, 25));
		mumb.setBounds(510, 360, 150, 50);
		panel.add(mumb);
		
		JLabel luck=new JLabel("BANGALORE");
		luck.setForeground(new Color(139, 0, 0));
		luck.setFont(new Font("Tahoma", Font.BOLD, 25));
		luck.setBounds(960,360, 200, 50);
		panel.add(luck);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new Agra();
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("image\\agra\\taj.jpg"));
		lblNewLabel_2.setBounds(0, 45, 675, 305);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new Lucknow();
			}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon("image\\lucknow\\0_Tlhmb8fYqPuHtAuw.jpg"));
		lblNewLabel_2_1.setBounds(675, 45, 675, 305);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new Delhi();
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon("image\\DELHI\\india-delhi-red-fort.jpg"));
		lblNewLabel_3.setBounds(0, 350, 450, 302);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new Mumbai();
			}
		});
		lblNewLabel_3_1.setIcon(new ImageIcon("image\\MUMBAI\\702408349-H.jpg"));
		lblNewLabel_3_1.setBounds(452, 350, 450, 302);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new Bengluru();
			}
		});
		lblNewLabel_3_2.setIcon(new ImageIcon("image\\BANGALORE\\wonderla-places-to-visit-bangalore.jpg"));
		lblNewLabel_3_2.setBounds(900, 350, 450, 302);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("USER");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.show(false);
				panel_1.show(true);
			}
		});
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1.setBounds(1115, 22, 73, 28);
		lblNewLabel_1_1.setVisible(true);		
		frame.getContentPane().add(lblNewLabel_1_1);
		
		
		JLabel lblNewLabel_1 = new JLabel("CITIES");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.show(false);
				panel.show(true);
			}
		});
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setBounds(1002, 22, 73, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		JLabel logOut = new JLabel("LOGOUT");
		logOut.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int i=JOptionPane.showConfirmDialog(null,  "Are you sure You want to logout","Confirmation Box",JOptionPane.YES_NO_OPTION);
				if(i==0) {
				frame.dispose();
				new HomePage();
				}
			}
		});
		logOut.setFont(new Font("Tahoma", Font.BOLD, 20));
		logOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logOut.setBounds(1209, 22, 116, 28);
		frame.getContentPane().add(logOut);
		
		
		JLabel lblNewLabel = new JLabel("Welcome Admin");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(0, 255, 255));
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 40));
		lblNewLabel.setBounds(0, 0, 1350, 61);
		frame.getContentPane().add(lblNewLabel);
	}
}
