package mySQL;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.TableView.TableCell;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import com.mysql.cj.xdevapi.Schema.Validation;
import java.sql.*;
import java.util.Vector;
import javax.swing.ListSelectionModel;

public class New {
	private JFrame frame;
	JLabel l1,userData,userQueries,city,logOut,agra,beng,mumb,luck,delhi;
	JPanel panel,panel1,panel2,panel3,panel4,panel_1;
	JTextField tField = new JTextField();
	private JTextField textField;
	private JTextField textField_1;
	static Connection con ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New window = new New();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public New() {
		initialize();
		
	}

	private void initialize() {
		try {
			frame = new JFrame();
			Dimension s = Toolkit.getDefaultToolkit().getScreenSize();
			frame.setSize(s.width,s.height);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			frame.setResizable(false);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			city = new JLabel("CITY");
			city.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					panel2.show(false);
					panel_1.show(false);
					panel.show(true);
					
					
				}
			});
			city.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			city.setForeground(new Color(0,0,204));
			city.setHorizontalAlignment(SwingConstants.CENTER);
			city.setFont(new Font("Tahoma", Font.BOLD, 15));
			city.setBounds(790, 20, 163, 45);
			frame.getContentPane().add(city);
			
			userData = new JLabel("USER DATA");
			userData.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					panel.show(false);
					panel_1.show(false);
					panel2.show(true);
					
					panel2 = new JPanel();
					panel2.setBounds(0, 78, 1350, 706);
					frame.getContentPane().add(panel2);
					panel2.setLayout(null);
					panel2.setVisible(true);
					
//					Panel for table.........................................
					panel1 = new JPanel();
					panel1.setBounds(0, 0, 1350, 400);
					
					
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
//				TableCustom.apply()
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
							
							JButton btn=new JButton("Show Data");
//							btn.addActionListener(new ActionListener() {
//								public void actionPerformed(ActionEvent e) {
									try {
									String userName=textField.getText();
									String sql="select * from user where email=?";
									PreparedStatement pr2;
										pr2=con.prepareStatement(sql);
										pr2.setString(1, userName);
										rs=pr2.executeQuery();
										rsmd = rs.getMetaData();
										col=rsmd.getColumnName(1);
										dtm=(DefaultTableModel)table.getModel();
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
									
//								}
//							});
							btn.setForeground(new Color(255, 0, 0));
							btn.setFont(new Font("Tahoma", Font.BOLD, 20));
							btn.setBounds(468,573,180,50);
							panel2.add(btn);
							
							JButton btn1=new JButton("Delete Data");
//							btn1.addActionListener(new ActionListener() {
//								public void actionPerformed(ActionEvent e) {
									try {
										String userName=textField.getText();
										String sql="delete from user where email=?";
//										Connection con2;
										PreparedStatement pr2;
											pr2=con.prepareStatement(sql);
											pr2.setString(1, userName);
											boolean b=pr2.execute();
											System.out.println(b);
											if(b==false) {
												JOptionPane.showMessageDialog(null, "Record Successfully Deleted");
											
											PreparedStatement pr1=con.prepareStatement("Select* from user");
											rs=pr.executeQuery();
											rsmd = rs.getMetaData();
											col=rsmd.getColumnName(1);
											dtm=(DefaultTableModel)table.getModel();
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
								
//							}
//						});
						btn1.setForeground(new Color(255, 0, 0));
						btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
						btn1.setBounds(767,573,180,50);
						panel2.add(btn1);
						
						textField = new JTextField();
						textField.setHorizontalAlignment(SwingConstants.CENTER);
						textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
						textField.setBounds(325, 506, 770, 40);
						panel2.add(textField);
						textField.setColumns(10);
						
						JLabel lblNewLabel = new JLabel("Username ");
						lblNewLabel.setForeground(new Color(107, 142, 35));
						lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
						lblNewLabel.setBounds(325, 445, 272, 50);
						panel2.add(lblNewLabel);
						
						textField_1 = new JTextField();
						textField_1.setFont(new Font("Tahoma", Font.BOLD, 13));
						textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
						textField_1.setForeground(new Color(255, 0, 0));
						textField_1.setOpaque(false);
						textField_1.setBorder(null);
						textField_1.setEditable(false);
						textField_1.setBounds(610, 472, 485, 23);
						panel2.add(textField_1);
						textField_1.setColumns(10);
						
						panel1.setLayout(new GridLayout(1,1));
						panel1.setVisible(true);
						panel2.add(panel1);
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			});
			userData.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			userData.setForeground(new Color(0,0,204));
			userData.setHorizontalAlignment(SwingConstants.CENTER);
			userData.setFont(new Font("Tahoma", Font.BOLD, 15));
			userData.setBounds(900, 20, 163, 45);
			frame.getContentPane().add(userData);
			
			userQueries = new JLabel("USER QUERIES");
			userQueries.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					panel.show(false);
					panel2.show(false);
					panel_1.show(true);
					
					panel_1 = new JPanel();
					panel_1.setBounds(0, 76, 1351, 653);
					frame.getContentPane().add(panel_1);
					panel_1.setLayout(new GridLayout(1,1));
							
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
					panel_1.add(new JScrollPane(table_1));	
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			});
			userQueries.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			userQueries.setHorizontalAlignment(SwingConstants.CENTER);
			userQueries.setForeground(new Color(0,0,204));
			userQueries.setFont(new Font("Tahoma", Font.BOLD, 15));
			userQueries.setBounds(1020, 20, 229, 45);
			frame.getContentPane().add(userQueries);
			
			logOut = new JLabel("LOG OUT");
			logOut.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int i=JOptionPane.showConfirmDialog(null, "Are you sure You want to logout","Confirmation Box",JOptionPane.YES_NO_OPTION);
					if(i==0) {
						frame.dispose();
						new HomePage();
					}
				}
			});
			logOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			logOut.setHorizontalAlignment(SwingConstants.CENTER);
			logOut.setForeground(new Color(0,0,204));
			logOut.setFont(new Font("Tahoma", Font.BOLD, 15));
			logOut.setBounds(1180, 20, 171, 45);
			frame.getContentPane().add(logOut);
			
			l1 = new JLabel("    WELCOME ADMIN");
			l1.setOpaque(true);
			l1.setBackground(new Color(152, 251, 152));
			l1.setForeground(Color.RED);
			l1.setFont(new Font("Sylfaen", Font.BOLD, 50));
			l1.setBounds(0, 0, 1350, 78);
			frame.getContentPane().add(l1);
			
//			JLabel bgImage = new JLabel("");
//			bgImage.setIcon(new ImageIcon("IMAGE\\USER\\cityImageAdmin.png"));
//			bgImage.setBounds(0, 0, 1351, 729);
//			frame.getContentPane().add(bgImage);
			
		
			panel = new JPanel();
			panel.setBounds(0, 78, 1350, 706);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel_1 = new JLabel("AGRA");
			lblNewLabel_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					frame.dispose();
					new Agra();
				}
				public void mouseEntered(MouseEvent e) {
					lblNewLabel_1.setForeground(new Color(0,0,225));
					lblNewLabel_1.setBackground(new Color(139,0,0));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					lblNewLabel_1.setForeground(new Color(139, 0, 0));
					lblNewLabel_1.setBackground(new Color(143,188,143));
				}
			});
			lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			lblNewLabel_1.setOpaque(true);
			lblNewLabel_1.setBackground(new Color(143, 188, 143));
			lblNewLabel_1.setForeground(new Color(139, 0, 0));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
			lblNewLabel_1.setBounds(0, 0, 250, 45);
			panel.add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_1 = new JLabel("DELHI");
			lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					frame.dispose();
					new Delhi();
				}
				public void mouseEntered(MouseEvent e) {
					lblNewLabel_1_1.setForeground(new Color(0,0,225));
					lblNewLabel_1_1.setBackground(new Color(139,0,0));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					lblNewLabel_1_1.setForeground(new Color(139, 0, 0));
					lblNewLabel_1_1.setBackground(new Color(143,188,143));
				}
			});
			
			lblNewLabel_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			lblNewLabel_1_1.setBackground(new Color(143, 188, 143));
			lblNewLabel_1_1.setOpaque(true);
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setForeground(new Color(139, 0, 0));
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
			lblNewLabel_1_1.setBounds(1045, 0, 305, 45);
			panel.add(lblNewLabel_1_1);
			
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
			
			agra=new JLabel("Agra");
			agra.setForeground(new Color(139, 0, 0));
			agra.setFont(new Font("Tahoma", Font.BOLD, 25));
			agra.setBounds(160, 50, 100, 50);
			panel.add(agra);
			
			beng=new JLabel("Lucknow");
			beng.setForeground(new Color(139, 0, 0));
			beng.setFont(new Font("Tahoma", Font.BOLD, 25));
			beng.setBounds(800, 50, 150, 50);
			panel.add(beng);
			
			delhi=new JLabel("Delhi");
			delhi.setForeground(new Color(139, 0, 0));
			delhi.setFont(new Font("Tahoma", Font.BOLD, 25));
			delhi.setBounds(60, 350, 100, 50);
			panel.add(delhi);
			
			mumb=new JLabel("Mumbai");
			mumb.setForeground(new Color(139, 0, 0));
			mumb.setFont(new Font("Tahoma", Font.BOLD, 25));
			mumb.setBounds(510, 360, 150, 50);
			panel.add(mumb);
			
			luck=new JLabel("BANGALORE");
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
//__________________________________________________________________________________________________________________________		
		
			
			
	
//______________________________________________________________________________________________________________________				
				
			
			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
