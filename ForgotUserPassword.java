package mySQL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.border.LineBorder;
public class ForgotUserPassword {

	private JFrame frame;
	private JTextField userField;
	private JPasswordField passField;
	private JPasswordField passCField;
	String url = "jdbc:mysql://localhost:3306/smartcity";
	String user = "root";
	String pass = "";
	Connection con;
	PreparedStatement pr;
	ResultSet rs;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotUserPassword window = new ForgotUserPassword();
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
	public ForgotUserPassword() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(144, 238, 144));
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setBounds(871, 242, 378, 475);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reset Password");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Vijaya", Font.BOLD, 45));
		lblNewLabel.setBounds(62, 11, 300, 53);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setForeground(new Color(0, 128, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(20, 88, 150, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		userField = new JTextField();
		userField.setBorder(new LineBorder(new Color(139, 69, 19)));
		userField.setBackground(new Color(253, 245, 230));
		userField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		userField.setBounds(20, 125, 332, 30);
		frame.getContentPane().add(userField);
		userField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(new Color(0, 128, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(20, 174, 106, 33);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Confirm Password");
		lblNewLabel_1_2.setForeground(new Color(0, 128, 0));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(20, 274, 269, 33);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		passField = new JPasswordField();
		passField.setBorder(new LineBorder(new Color(139, 69, 19)));
		passField.setBackground(new Color(253, 245, 230));
		passField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passField.setColumns(10);
		passField.setBounds(20, 214, 332, 30);
		frame.getContentPane().add(passField);
		
		passCField = new JPasswordField();
		passCField.setBorder(new LineBorder(new Color(139, 69, 19)));
		passCField.setBackground(new Color(253, 245, 230));
		passCField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passCField.setColumns(10);
		passCField.setBounds(20, 314, 332, 30);
		frame.getContentPane().add(passCField);
		
		JButton reset = new JButton("Reset");
		reset.setBackground(new Color(248, 248, 255));
		reset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		reset.setForeground(new Color(0, 191, 255));
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = userField.getText();
				String pasword = passField.getText();
				String cpasword = passCField.getText();
				
				//String query1 = "select * from user where email='userName'";
				String query = "update user set Password = ? where email = ?";
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection(url,user,pass);
					pr = con.prepareStatement(query);
					pr.setString(1,pasword);
					pr.setString(2,userName);
					
					if(pasword.equals(cpasword)) {
						if(pr.executeUpdate()>0) {
							JOptionPane.showMessageDialog(null, "Password successfully changed");
							frame.dispose();
							new LoginPage();
						}
						else {
							JOptionPane.showMessageDialog(null, "Invalid UserName","Error",JOptionPane.ERROR_MESSAGE);
							
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Password doesn't match","Error",JOptionPane.ERROR_MESSAGE);
						
						userField.setText("");
						passField.setText("");
						passCField.setText("");
					}
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Invalid UserName");
				}
				
			}
		});
		reset.setFont(new Font("Tahoma", Font.BOLD, 17));
		reset.setBounds(62, 371, 89, 41);
		frame.getContentPane().add(reset);
		
		JButton cancle = new JButton("Cancel");
		cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userField.setText("");
				passField.setText("");
				passCField.setText("");
			}
		});
		cancle.setBackground(new Color(248, 248, 255));
		cancle.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cancle.setForeground(new Color(0, 191, 255));
		cancle.setFont(new Font("Tahoma", Font.BOLD, 17));
		cancle.setBounds(200, 371, 100, 41);
		frame.getContentPane().add(cancle);
		
		JButton btnNewButton = new JButton("\uF0E7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new LoginPage();
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(new Color(144, 238, 144));
		btnNewButton.setFont(new Font("Wingdings", Font.PLAIN, 25));
		btnNewButton.setForeground(new Color(85, 107, 47));
		btnNewButton.setBounds(20, 14, 57, 50);
		frame.getContentPane().add(btnNewButton);
	}
}
