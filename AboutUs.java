package mySQL;

import java.awt.Dimension;


import java.awt.EventQueue;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class AboutUs {

	private JFrame frame;
	static JButton btnNewButton_2;
	private JTextField name;
	private JTextField mobile;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	static Connection con;
	static Statement smt;
	static PreparedStatement pr;
	static ResultSet rs;
	static String url = "jdbc:mysql://localhost:3306/smartcity";
	static String user = "root";
	static String pass = "";
	static String query = "insert into feedback values(?,?,?,?,?)";
	private JTextField nationality;
	private JTextArea quer;
	private JTextArea feed;
	
	public void refresh() {
		name.setText("");
		mobile.setText("");
		nationality.setText("");
		quer.setText("");
		feed.setText("");
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs window = new AboutUs();
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
	public AboutUs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width,screen.height);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("What's your issuse");
		lblNewLabel.setForeground(new Color(0, 153, 153));
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 45));
		lblNewLabel.setBounds(491, 23, 424, 75);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 98, 1350, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("In which city are you present");
		lblNewLabel_1.setForeground(new Color(128, 128, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel_1.setBounds(593, 109, 403, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Your Valuable Feedback");
		lblNewLabel_2.setForeground(new Color(0, 255, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(69, 516, 348, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		feed = new JTextArea();
		feed.setFont(new Font("Monospaced", Font.PLAIN, 20));
		feed.setBounds(69, 562, 410, 68);
		frame.getContentPane().add(feed);
		
		JButton btnNewButton = new JButton("Go To Home Page");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new HomePage();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBounds(1006, 668, 185, 35);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setForeground(new Color(0, 255, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(69, 167, 122, 35);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Mobile");
		lblNewLabel_3_1.setForeground(Color.GREEN);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3_1.setBounds(69, 244, 122, 35);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Nationality");
		lblNewLabel_3_2.setForeground(Color.GREEN);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3_2.setBounds(69, 321, 153, 35);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Query");
		lblNewLabel_3_2_1.setForeground(Color.GREEN);
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3_2_1.setBounds(69, 391, 153, 35);
		frame.getContentPane().add(lblNewLabel_3_2_1);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 15));
		name.setBounds(240, 167, 239, 33);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		mobile = new JTextField();
		mobile.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mobile.setColumns(10);
		mobile.setBounds(240, 246, 239, 33);
		frame.getContentPane().add(mobile);
		
		quer = new JTextArea();
		quer.setFont(new Font("Monospaced", Font.PLAIN, 20));
		quer.setBounds(69, 437, 410, 68);
		frame.getContentPane().add(quer);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection(url,user,pass);
					pr = con.prepareStatement(query);
					pr.setString(1, name.getText());
					pr.setString(2, mobile.getText());
					pr.setString(3, nationality.getText());
					pr.setString(4, quer.getText());
					pr.setString(5, feed.getText());
					
					pr.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton_1, "Record Submitted");
					refresh();
				}
				catch(Exception ex) {
					//ex.printStackTrace();
					JOptionPane.showMessageDialog(null,"Please start the server","alert",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBounds(133, 667, 99, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Reset");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refresh();
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1.setBounds(271, 667, 99, 35);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 653, 1350, 2);
		frame.getContentPane().add(separator_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		panel.setBounds(593, 167, 681, 463);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("HelpLine Number");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(new Color(0, 0, 255));
		lblNewLabel_4.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel_4.setBounds(0, 0, 681, 60);
		panel.add(lblNewLabel_4);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 62, 681, 2);
		panel.add(separator_2);
		
		JLabel lblNewLabel_5 = new JLabel("District Magistrate ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_5.setBounds(28, 82, 207, 29);
		panel.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setBounds(303, 83, 327, 29);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5_1 = new JLabel("District Magistrate ");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_5_1.setBounds(28, 148, 207, 29);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("ADM");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_5_2.setBounds(28, 213, 191, 29);
		panel.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("ADM");
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_5_3.setBounds(28, 284, 191, 29);
		panel.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("SSP");
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_5_4.setBounds(28, 345, 191, 29);
		panel.add(lblNewLabel_5_4);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(303, 148, 327, 29);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(303, 210, 327, 29);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(303, 277, 327, 29);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(303, 344, 327, 29);
		panel.add(textField_6);
		
		JLabel lblNewLabel_6 = new JLabel("If you have any issues than you call given above numbers");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(28, 401, 602, 36);
		panel.add(lblNewLabel_6);
		
		nationality = new JTextField();
		nationality.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nationality.setColumns(10);
		nationality.setBounds(240, 321, 239, 33);
		frame.getContentPane().add(nationality);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.RED);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select City", "Agra", "Delhi", "Mumbai", "Bengluru", "Lucknow"}));
		comboBox.setBounds(1051, 111, 153, 35);
		frame.getContentPane().add(comboBox);
		
		btnNewButton_2 = new JButton("GO");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("Agra")) {
					textField_2.setText("9454417509 , 9454417491");
					textField_3.setText("commagr@nic.in");
					textField_4.setText("9454417580 , 9454417659");
					textField_5.setText("9454417682 , 9454417656");
					textField_6.setText("9454413027 , 9454417666");
				}
				else if(comboBox.getSelectedItem().equals("Bengluru")) {
					textField_2.setText("080 - 22211292 , 080 - 22214553");
					textField_3.setText("dcurban@nic.in , deo.bangaloreu@gmail.com");
					textField_4.setText("080 - 22214370");
					textField_5.setText("080 - 22211106");
					textField_6.setText("080 - 22211372 , 080 - 22211352");
				}
				else if(comboBox.getSelectedItem().equals("Delhi")) {
					textField_2.setText("9873745563 , 9717778491");
					textField_3.setText("dccentral@nic.in , dcsouth@nic.in");
					textField_4.setText("011-23071144");
					textField_5.setText("011-23382990 , 011-22336228");
					textField_6.setText("9818099041 , 9818099061");
				}
				else if(comboBox.getSelectedItem().equals("Lucknow")) {
					textField_2.setText("9415005000 , 0522-2623024");
					textField_3.setText("dmluc@nic.in");
					textField_4.setText("9415005002 , 9415005004");
					textField_5.setText("9454416490 , 9454416492");
					textField_6.setText("9454403838 , 9454403839");
				}
				else if(comboBox.getSelectedItem().equals("Mumbai")) {
					textField_2.setText("022-22662440");
					textField_3.setText("addcollmumbaicity@gmail.com");
					textField_4.setText("022-22670656");
					textField_5.setText("022-22662234");
					textField_6.setText("02227562288 , 02227576287");
				}
			}
		});
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setBounds(1203, 111, 69, 35);
		frame.getContentPane().add(btnNewButton_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(549, 98, 2, 557);
		frame.getContentPane().add(separator_3);
		
		JLabel lblNewLabel_7 = new JLabel("Post Your Query");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_7.setBounds(204, 111, 213, 33);
		frame.getContentPane().add(lblNewLabel_7);
	}
}
