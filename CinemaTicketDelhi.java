package mySQL;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Cursor;
import java.io.*
;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

import com.toedter.calendar.JDateChooser;
public class CinemaTicketDelhi {

	protected JFrame frame;
	protected JTextField movie;
	protected JTextField amount;
	protected JComboBox ticket, cinemaHall, time;
	private JPanel panel;
	private JButton pay,cancle,btnNewButton;
	public String str;
	Date date = new Date();
	private JPanel panel_1;
	private JLabel lblNewLabel_5;
	String seat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CinemaTicketDelhi window = new CinemaTicketDelhi();
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
	public CinemaTicketDelhi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Sitka Text", Font.ITALIC, 30));
		frame.getContentPane().setBackground(new Color(189, 183, 107));
		frame.setVisible(true);
		frame.setResizable(false);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width, screen.height);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(32, 178, 170));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBounds(850, 159, 429, 515);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		setTextField (new JTextField());
		getTextField().setEditable(false);
		getTextField().setFont(new Font("Sylfaen", Font.BOLD, 30));
		getTextField().setBorder(new LineBorder(new Color(102, 51, 102), 2, true));
		getTextField().setBounds(30, 29, 374, 49);
		panel.add(getTextField());
		movie.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cinema");
		lblNewLabel.setForeground(new Color(204, 255, 204));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(51, 114, 137, 37);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tickets");
		lblNewLabel_1.setForeground(new Color(204, 255, 204));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(51, 194, 137, 37);
		panel.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("Time");
		lblNewLabel_2.setForeground(new Color(204, 255, 204));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(51, 280, 137, 37);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Payable");
		lblNewLabel_3.setForeground(new Color(204, 255, 204));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(51, 363, 137, 37);
		panel.add(lblNewLabel_3);
		
		cinemaHall = new JComboBox();
		cinemaHall.setBounds(206, 117, 182, 36);
		panel.add(cinemaHall);
		cinemaHall.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cinemaHall.setModel(new DefaultComboBoxModel(new String[] {"Inox Nehru Place", "Shiela Theater", "PVR Plaza-CP", "Satyam Inox", "Delite Cinema", "Liberty Cinema", "Inox Janak Place", "Ritz Cinema"}));
		
		amount = new JTextField();
		amount.setEditable(false);
		amount.setFont(new Font("Tahoma", Font.BOLD, 20));
		amount.setBounds(206, 360, 182, 37);
		panel.add(amount);
		//amount.setText("hii");
		amount.setColumns(10);
		
		
		
		ticket = new JComboBox();
		ticket.setBounds(206, 196, 182, 36);
		panel.add(ticket);
		ticket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ticket.getSelectedItem().equals("1"))
				{
					amount.setText("120");
					seat="10";
				}
				else if(ticket.getSelectedItem().equals("2"))
				{
					amount.setText("240");
					seat="12,13";
				}
				else if(ticket.getSelectedItem().equals("3"))
				{
					amount.setText("360");
					seat="15,16,17";
				}
				else if(ticket.getSelectedItem().equals("4"))
				{
					amount.setText("480");
					seat="25,26,28,30";
				}
				else if(ticket.getSelectedItem().equals("5"))
				{
					amount.setText("600");
					seat="4,5,9,11,14";
				}
				else if(ticket.getSelectedItem().equals("6"))
				{
					amount.setText("720");
					seat="17,18,19,20,22,23";
				}
				else if(ticket.getSelectedItem().equals("7"))
				{
					amount.setText("840");
					seat="31,32,33,34,35,36,\n\t\t37";
				}
				else if(ticket.getSelectedItem().equals("8"))
				{
					amount.setText("960");
					seat="38,39,40,41,42,43,\n\t\t44,45";
				}
				else if(ticket.getSelectedItem().equals("9"))
				{
					amount.setText("1080");
					seat="48,49,50,51,52,53,\n\t\t54,55,56";
				}
				else if(ticket.getSelectedItem().equals("10"))
				{
					amount.setText("1200");
					seat="56,57,58,59,60,61,\n\t\t62,63,64,65";
				}
			}
		});
		ticket.setFont(new Font("Tahoma", Font.BOLD, 20));
		ticket.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		
		
		
		time = new JComboBox();
		time.setBounds(206, 281, 182, 36);
		panel.add(time);
		time.setModel(new DefaultComboBoxModel(new String[] {"08:00AM - 10:30AM", "11:00AM - 01:30PM", "02:00PM - 04:30PM", "05:00PM - 07:30PM", "08:00PM - 10:30PM"}));
		time.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		pay = new JButton("Pay");
		pay.setBackground(new Color(245, 222, 179));
		pay.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pay.setBounds(119, 440, 89, 42);
		panel.add(pay);
		pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				if(amount.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Select the Tickets");
				}
				else {
				JOptionPane.showMessageDialog(null, "Congrats! Payment was successful");
				panel.show(false);
				
				
				//if()
				
				panel_1 = new JPanel();
				panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_1.setBackground(Color.white);
				panel_1.setBounds(848, 80, 429, 700);
				frame.getContentPane().add(panel_1);
				panel_1.setLayout(null);
				panel_1.show(true);

				
				JTextArea textArea = new JTextArea();
				textArea.setBounds(10, 29, 409, 490);
				textArea.setEditable(false);
				panel_1.add(textArea);
				textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
				textArea.setText("**********************************\n");
				textArea.setText(textArea.getText()+"*           Your Ticket          *\n");
				textArea.setText(textArea.getText()+"**********************************\n\n");
				textArea.setText(textArea.getText()+" "+date.toString()+"\n\n");
				textArea.setText(textArea.getText()+" Cinema Hall:  "+(String) cinemaHall.getSelectedItem()+"\n\n");
				textArea.setText(textArea.getText()+" Movie:        "+getTextField().getText()+"\n\n");
				textArea.setText(textArea.getText()+" Ticket:       "+(String) ticket.getSelectedItem()+"\n\n");
				textArea.setText(textArea.getText()+" Seat No.:     "+seat+"\n\n");
				textArea.setText(textArea.getText()+" Time:         "+(String) time.getSelectedItem()+"\n\n");
				textArea.setText(textArea.getText()+" Total Amount:  "+amount.getText());
				textArea.setBorder(null);
				
				btnNewButton = new JButton("PRINT");
				btnNewButton.setBounds(157, 530, 102, 50);
				panel_1.add(btnNewButton);
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.dispose();
						try {
							//Database Connectivity............
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con;
							PreparedStatement pr;
							con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcity","root","");
							pr=con.prepareStatement("insert into cinema_ticket(Movie_name,theatre,tickets,seat_no,time,total_amount) values(?,?,?,?,?,?)");
							pr.setString(1, getTextField().getText());
							pr.setString(2, (String)cinemaHall.getSelectedItem());
							pr.setString(3, (String)ticket.getSelectedItem());
							pr.setString(4, seat);
							pr.setString(5, (String)time.getSelectedItem());
							pr.setString(6, amount.getText());
							pr.executeUpdate();
							
							textArea.print();
							frame.dispose();
							new Delhi();
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
						
					}
				});
				btnNewButton.setForeground(new Color(0, 0, 128));
				btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
				
				
				}
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		pay.setForeground(new Color(0, 0, 205));
		pay.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		cancle = new JButton("Cancel");
		cancle.setBackground(new Color(245, 222, 179));
		cancle.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cancle.setBounds(258, 440, 100, 42);
		panel.add(cancle);
		cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				//ca1.getFrame().dispose();
				new CinemaDelhi();
			}
		});
		cancle.setForeground(new Color(0, 0, 255));
		cancle.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblNewLabel_4 = new JLabel("Enjoy The Movie");
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(new Color(205, 133, 63));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Segoe UI Symbol", Font.BOLD, 50));
		lblNewLabel_4.setForeground(Color.CYAN);
		lblNewLabel_4.setBounds(0, 0, 1350, 98);
		frame.getContentPane().add(lblNewLabel_4);
		
		JTextArea txtrAGoodMovie = new JTextArea();
		txtrAGoodMovie.setForeground(new Color(255, 0, 0));
		txtrAGoodMovie.setOpaque(false);
		txtrAGoodMovie.setEditable(false);
		txtrAGoodMovie.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 45));
		txtrAGoodMovie.setText("A good movie is the \none in which we can \nrelate with the cha-\nracters and share the \nexcitement or sorrows.");
		txtrAGoodMovie.setBounds(117, 347, 703, 310);
		frame.getContentPane().add(txtrAGoodMovie);
		
		lblNewLabel_5 = new JLabel("A Good Movie");
		lblNewLabel_5.setForeground(new Color(139, 0, 0));
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 65));
		lblNewLabel_5.setBounds(117, 277, 451, 59);
		frame.getContentPane().add(lblNewLabel_5);
		
	}
	
	public JTextField getTextField() {
		return movie;
		
	}

	public void setTextField(JTextField textField) {
		this.movie = textField;
		textField.setForeground(Color.BLUE);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(new Color(143, 188, 143));
	}
}
