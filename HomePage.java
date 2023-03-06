package mySQL;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Cursor;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
public class HomePage {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private Connection con;
	private Statement smt;
	private PreparedStatement pr;
	private ResultSet rs;
	static String url = "jdbc:mysql://localhost:3306/SmartCity";
	static String user = "root";
	static String pass = "";
	static String query = "select username,password from adminTable";
	static String query1 = "select UserID,password from user";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					HomePage window = new HomePage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public HomePage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("image\\new\\smart2.png"));
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width,screen.height);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("    HOME");
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new HomePage();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setForeground(new Color(0,0,225));
				lblNewLabel.setBackground(new Color(192,192,192));
				lblNewLabel.setOpaque(true);
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setForeground(new Color(128,0,0));
				lblNewLabel.setOpaque(false);
			}
		});
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(640, 2, 110, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblRegistration = new JLabel("REGISTRATION");
		lblRegistration.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRegistration.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new UserRegistration();
			}
			
			public void mouseEntered(MouseEvent e) {
				lblRegistration.setForeground(new Color(0,0,225));
				lblRegistration.setBackground(new Color(192,192,192));
				lblRegistration.setOpaque(true);
			}
			
			public void mouseExited(MouseEvent e) {
				lblRegistration.setForeground(new Color(128,0,0));
				lblRegistration.setOpaque(false);
			}
		});
		lblRegistration.setForeground(new Color(128, 0, 0));
		lblRegistration.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRegistration.setBounds(750, 2, 180, 49);
		frame.getContentPane().add(lblRegistration);
		
		JLabel lblLogin = new JLabel("ADMIN LOGIN");
		lblLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblLogin.setBackground(SystemColor.inactiveCaption);
		lblLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new LoginPage1();			
			}
			
			public void mouseEntered(MouseEvent e) {
				lblLogin.setForeground(new Color(0,0,225));
				lblLogin.setBackground(new Color(192,192,192));
				lblLogin.setOpaque(true);
			}
			
			public void mouseExited(MouseEvent e) {
				lblLogin.setForeground(new Color(128,0,0));
				lblLogin.setOpaque(false);
			}
		});
		lblLogin.setForeground(new Color(128, 0, 0));
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblLogin.setBounds(930, 2, 140, 49);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblUserLogin = new JLabel("USER LOGIN");
		lblUserLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblUserLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new LoginPage();
				}
			
			public void mouseEntered(MouseEvent e) {
				lblUserLogin.setForeground(new Color(0,0,225));
				lblUserLogin.setBackground(new Color(192,192,192));
				lblUserLogin.setOpaque(true);
			}
			
			public void mouseExited(MouseEvent e) {
				lblUserLogin.setForeground(new Color(128,0,0));
				lblUserLogin.setOpaque(false);
			}
		});
		lblUserLogin.setForeground(new Color(128, 0, 0));
		lblUserLogin.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUserLogin.setBounds(1090, 2, 125, 49);
		frame.getContentPane().add(lblUserLogin);
		
		JLabel lblContactUs = new JLabel("CONTACT US");
		lblContactUs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblContactUs.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new AboutUs();
			}
			
			public void mouseEntered(MouseEvent e) {
				lblContactUs.setForeground(new Color(0,0,225));
				lblContactUs.setBackground(new Color(192,192,192));
				lblContactUs.setOpaque(true);
			}      
			
			public void mouseExited(MouseEvent e) {
				lblContactUs.setForeground(new Color(128,0,0));
				lblContactUs.setOpaque(false);
			}
		});
		lblContactUs.setForeground(new Color(128, 0, 0));
		lblContactUs.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblContactUs.setBounds(1220, 2, 125, 49);
		frame.getContentPane().add(lblContactUs);
		
		JLabel lblNewLabel_3 = new JLabel("THE SMART CITY");
		lblNewLabel_3.setForeground(new Color(00, 00, 200));
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.BOLD, 50));
		lblNewLabel_3.setBounds(113, 300, 500, 80);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("<html>The Smart City have many smart<br>cities with more information and<br>technologies. This Information and<br>Technologies are helps the new <br>user in many fields. We provides <br>proper guidance, way, and help to<br>many other fields.</html>");
		lblNewLabel_4.setForeground(Color.cyan);
		lblNewLabel_4.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel_4.setBounds(115, 310, 600, 440);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("DIGITAL INDIA");
		lblNewLabel_5.setForeground(new Color(255, 0, 51));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel_5.setBounds(32, 2, 417, 87);
		frame.getContentPane().add(lblNewLabel_5);
	
		JLabel lblNewLabel3 = new JLabel("");
		lblNewLabel3.setBounds(0, 2, 1350, 727);
		lblNewLabel3.setIcon(new ImageIcon("image\\user\\cityImageAdmin.png"));
		lblNewLabel3.setOpaque(true);
		lblNewLabel3.setVisible(true);
		frame.getContentPane().add(lblNewLabel3);
		
	}
}
