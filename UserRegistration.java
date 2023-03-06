package mySQL;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.border.LineBorder;

public class UserRegistration {

	private JFrame frame;
	private JTextField txtJfkkdj;
	private JTextField lName;
	private JTextField fName;
	private JTextField mobile;
	private JTextField email;
	private JTextField country;
	private JTextField city;
	private JPasswordField password;
	private JPasswordField cPassword;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	final String url = "jdbc:mysql://localhost:3306/smartcity";
	final String user = "root";
	final String pass = "";
	static Connection con;
	static PreparedStatement pr;
	final String query = "insert into user values(?,?,?,?,?,?,?,?,?)";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserRegistration window = new UserRegistration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public UserRegistration() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 0));
		frame.setResizable(false);
		frame.setVisible(true);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width,screen.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 28));
		lblNewLabel.setBounds(100, 109, 238, 51);
		frame.getContentPane().add(lblNewLabel);
		
		txtJfkkdj = new JTextField();
		txtJfkkdj.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		txtJfkkdj.setBackground(new Color(189, 183, 107));
		txtJfkkdj.setForeground(new Color(0, 0, 255));
		txtJfkkdj.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char ch = e.getKeyChar();
				if(Character.isDigit(ch))
				{
					e.consume();
				}
			}
		});
		txtJfkkdj.setFont(new Font("Dialog", Font.PLAIN, 25));
		txtJfkkdj.setBounds(100, 161, 498, 39);
		frame.getContentPane().add(txtJfkkdj);
		txtJfkkdj.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(new Color(0, 100, 0));
		lblLastName.setFont(new Font("Dialog", Font.BOLD, 28));
		lblLastName.setBounds(771, 109, 238, 51);
		frame.getContentPane().add(lblLastName);
		
		lName = new JTextField();
		lName.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		lName.setBackground(new Color(189, 183, 107));
		lName.setForeground(new Color(0, 0, 255));
		lName.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		lName.setFont(new Font("Dialog", Font.PLAIN, 25));
		lName.setColumns(10);
		lName.setBounds(771, 161, 498, 39);
		frame.getContentPane().add(lName);
		
		JLabel lblFatherName = new JLabel("Father Name");
		lblFatherName.setForeground(new Color(0, 100, 0));
		lblFatherName.setFont(new Font("Dialog", Font.BOLD, 28));
		lblFatherName.setBounds(100, 211, 238, 51);
		frame.getContentPane().add(lblFatherName);
		
		fName = new JTextField();
		fName.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		fName.setBackground(new Color(189, 183, 107));
		fName.setForeground(new Color(0, 0, 255));
		fName.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		fName.setFont(new Font("Dialog", Font.PLAIN, 25));
		fName.setColumns(10);
		fName.setBounds(100, 261, 498, 39);
		frame.getContentPane().add(fName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(new Color(0, 100, 0));
		lblGender.setFont(new Font("Dialog", Font.BOLD, 28));
		lblGender.setBounds(771, 211, 238, 51);
		frame.getContentPane().add(lblGender);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setForeground(new Color(0, 100, 0));
		lblMobile.setFont(new Font("Dialog", Font.BOLD, 28));
		lblMobile.setBounds(100, 315, 238, 51);
		frame.getContentPane().add(lblMobile);
		
		mobile = new JTextField();
		mobile.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		mobile.setBackground(new Color(189, 183, 107));
		mobile.setForeground(new Color(0, 0, 255));
		mobile.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		mobile.setFont(new Font("Dialog", Font.PLAIN, 25));
		mobile.setColumns(10);
		mobile.setBounds(100, 363, 498, 39);
		frame.getContentPane().add(mobile);
		
		email = new JTextField();
		email.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		email.setBackground(new Color(189, 183, 107));
		email.setForeground(new Color(0, 0, 255));
		email.setFont(new Font("Dialog", Font.PLAIN, 25));
		email.setColumns(10);
		email.setBounds(771, 363, 498, 39);
		frame.getContentPane().add(email);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(0, 100, 0));
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 28));
		lblEmail.setBounds(771, 315, 238, 51);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblNewLabel_3 = new JLabel("Country");
		lblNewLabel_3.setForeground(new Color(0, 100, 0));
		
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 28));
		lblNewLabel_3.setBounds(100, 420, 238, 51);
		frame.getContentPane().add(lblNewLabel_3);
		
		country = new JTextField();
		country.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		country.setBackground(new Color(189, 183, 107));
		country.setForeground(new Color(0, 0, 255));
		country.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		country.setFont(new Font("Dialog", Font.PLAIN, 25));
		country.setColumns(10);
		country.setBounds(100, 467, 498, 39);
		frame.getContentPane().add(country);
		
		city = new JTextField();
		city.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		city.setBackground(new Color(189, 183, 107));
		city.setForeground(new Color(0, 0, 255));
		city.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		city.setFont(new Font("Dialog", Font.PLAIN, 25));
		city.setColumns(10);
		city.setBounds(771, 467, 498, 39);
		frame.getContentPane().add(city);
		
		JLabel lblLastName_3 = new JLabel("City");
		lblLastName_3.setForeground(new Color(0, 100, 0));
		lblLastName_3.setFont(new Font("Dialog", Font.BOLD, 28));
		lblLastName_3.setBounds(771, 420, 238, 51);
		frame.getContentPane().add(lblLastName_3);
		
		JRadioButton male = new JRadioButton("Male");
		male.setForeground(new Color(255, 215, 0));
		male.setBackground(new Color(128, 128, 0));
		buttonGroup.add(male);
		male.setFont(new Font("Tahoma", Font.PLAIN, 23));
		male.setBounds(771, 261, 109, 37);
		frame.getContentPane().add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setForeground(new Color(255, 215, 0));
		female.setBackground(new Color(128, 128, 0));
		buttonGroup.add(female);
		female.setFont(new Font("Tahoma", Font.PLAIN, 23));
		female.setBounds(903, 261, 109, 37);
		frame.getContentPane().add(female);
		
		JRadioButton other = new JRadioButton("Other");
		other.setForeground(new Color(255, 215, 0));
		other.setBackground(new Color(128, 128, 0));
		buttonGroup.add(other);
		other.setFont(new Font("Tahoma", Font.PLAIN, 23));
		other.setBounds(1052, 263, 109, 37);
		frame.getContentPane().add(other);
		
		JLabel lblNewLabel_3_1 = new JLabel("Password");
		lblNewLabel_3_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.BOLD, 28));
		lblNewLabel_3_1.setBounds(100, 517, 238, 51);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		password = new JPasswordField();
		password.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		password.setBackground(new Color(189, 183, 107));
		password.setForeground(new Color(0, 0, 255));
		password.setFont(new Font("Dialog", Font.PLAIN, 25));
		password.setColumns(10);
		password.setBounds(100, 564, 498, 39);
		frame.getContentPane().add(password);
		
		JLabel lblLastName_3_1 = new JLabel("Confirm Password");
		lblLastName_3_1.setForeground(new Color(0, 100, 0));
		lblLastName_3_1.setFont(new Font("Dialog", Font.BOLD, 28));
		lblLastName_3_1.setBounds(771, 517, 284, 51);
		frame.getContentPane().add(lblLastName_3_1);
		
		cPassword = new JPasswordField();
		cPassword.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		cPassword.setBackground(new Color(189, 183, 107));
		cPassword.setForeground(new Color(0, 0, 255));
		cPassword.setFont(new Font("Dialog", Font.PLAIN, 25));
		cPassword.setColumns(10);
		cPassword.setBounds(771, 564, 498, 39);
		frame.getContentPane().add(cPassword);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(new Color(255, 218, 185));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtJfkkdj.getText().trim().isEmpty() && lName.getText().trim().isEmpty() && fName.getText().trim().isEmpty() && mobile.getText().trim().isEmpty() && email.getText().trim().isEmpty() && country.getText().trim().isEmpty() && city.getText().trim().isEmpty() && password.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Fill the data","Alert",JOptionPane.WARNING_MESSAGE);
				}
				else {
				
			if(password.getText().equals(cPassword.getText())) {
					
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection(url,user,pass);
					pr = con.prepareStatement(query);
					pr.setString(1, txtJfkkdj.getText());
					pr.setString(2, lName.getText());
					pr.setString(3, fName.getText());
					if(male.isSelected()) {
						pr.setString(4, male.getText());
					}
					else if(female.isSelected()) {
						pr.setString(4, female.getText());
					}
					else {
						pr.setString(5, other.getText());
					}
					pr.setString(5, mobile.getText());
					pr.setString(6, email.getText());
					pr.setString(7, country.getText());
					pr.setString(8, city.getText());
					pr.setString(9, password.getText());
					
					pr.executeUpdate();
					JOptionPane.showMessageDialog(null,"Registration successfull");
					JOptionPane.showMessageDialog(null, "Your User ID\n"+email.getText());
					frame.dispose();
					new HomePage();
					new LoginPage();
				}
				catch(Exception ex) {
					System.out.println(ex);
				}
				}
				else {
					JOptionPane.showMessageDialog(null, "Password doesn't match","Alert",JOptionPane.WARNING_MESSAGE);
					password.setText("");
					cPassword.setText("");
				}
				}
				
			}
		});
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(436, 640, 144, 51);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBackground(new Color(255, 222, 173));
		btnReset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtJfkkdj.setText("");
				lName.setText("");
				fName.setText("");
				mobile.setText("");
				email.setText("");
				country.setText("");
				city.setText("");
				password.setText("");
				cPassword .setText("");
				
			}
		});
		btnReset.setForeground(new Color(255, 0, 0));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnReset.setBounds(644, 640, 144, 51);
		frame.getContentPane().add(btnReset);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(new Color(255, 218, 185));
		btnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new HomePage();
			}
		});
		btnBack.setForeground(new Color(255, 0, 0));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBack.setBounds(868, 640, 144, 51);
		frame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("image\\USER\\user-icon-6.png"));
		lblNewLabel_1.setBounds(579, 11, 182, 138);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
