package mySQL;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.Cursor;

public class LoginPage1  {

	private JFrame frame;
	
	private JTextField textField;
	static JCheckBox chckbxNewCheckBox;
	private JPasswordField passwordField;
	static String url = "jdbc:mysql://localhost:3306/smartcity";
	static String user = "root";
	static String pass = "";
	static Connection con;
	static Statement smt;
	static ResultSet rs;
	static String query = "select username, Password from adminTable";
	static String query1 = "update user set UserID = 'textField.getText()' ";
	
	public void refresh()
	{
		textField.setText("");
		passwordField.setText("");
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage1 window = new LoginPage1();
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
	public LoginPage1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.getContentPane().setForeground(Color.PINK);
		frame.setBounds(871, 242, 349, 352);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADMIN LOGIN");
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(97, 11, 216, 41);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(Color.BLUE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField.setBounds(133, 81, 184, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.BLUE);
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 16));
		passwordField.setBounds(133, 163, 184, 31);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url,user,pass);
				smt = con.createStatement();
				rs = smt.executeQuery(query);
				if(rs.next())
				{
					if((rs.getString("username")).equals(textField.getText()) && rs.getString("Password").equals(passwordField.getText()))
					{
						JOptionPane.showMessageDialog(btnNewButton, "Login Successfully");
						frame.dispose();
						new AdminHomepage();
					}
					else
					{
						JOptionPane.showMessageDialog(btnNewButton, "Invalid UserId or Password","Alert",JOptionPane.WARNING_MESSAGE);
					}
				}
				}
				catch(NumberFormatException ne) {
					JOptionPane.showMessageDialog(null,"Please enter only number", "Alert",JOptionPane.WARNING_MESSAGE);
					
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null,"Please start the server", "Alert",JOptionPane.WARNING_MESSAGE);
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(193, 253, 100, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Forgot");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new ForgotPassword();
			}
		});
		btnReset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReset.setForeground(new Color(255, 0, 0));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBounds(51, 253, 100, 31);
		frame.getContentPane().add(btnReset);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("IMAGE/USER/user.jpg"));
		lblNewLabel_4.setBounds(19, 62, 100, 62);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("IMAGE/USER/key.png"));
		lblNewLabel_5.setBounds(21, 150, 100, 62);
		frame.getContentPane().add(lblNewLabel_5);
		
		
			chckbxNewCheckBox = new JCheckBox("Show Password");
			chckbxNewCheckBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==chckbxNewCheckBox) {
						if(chckbxNewCheckBox.isSelected()) {
							passwordField.setEchoChar((char)0);
						}
						else {
							passwordField.setEchoChar('*');
						}
						}
				}
			});
		
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxNewCheckBox.setBounds(143, 202, 121, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		
		JLabel btnNewButton_1 = new JLabel("\uF0E7");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new HomePage();
			}
		});
		
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Wingdings", Font.BOLD, 30));
		btnNewButton_1.setBounds(39, 11, 37, 41);
		frame.getContentPane().add(btnNewButton_1);
	}
}
