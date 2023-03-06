//package mySQL;
//
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JTextField;
//import java.awt.Font;
//import java.awt.Color;
//import javax.swing.SwingConstants;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JComboBox;
//import javax.swing.DefaultComboBoxModel;
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import javax.swing.ImageIcon;
//import javax.swing.border.LineBorder;
//
//public class CinemaTicket {
//
//	protected static  JLabel container;
//	protected JFrame frame;
//	protected JTextField textField;
//	protected JTextField textField_1;
//	protected JComboBox comboBox, comboBox_1, comboBox_2;
//	//CinemaAgra1 ca1 = new CinemaAgra1();
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					CinemaTicket window = new CinemaTicket();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the application.
//	 */
//	public CinemaTicket() {
//		initialize();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		frame = new JFrame();
//		frame.getContentPane().setBackground(new Color(32, 178, 170));
//		frame.setVisible(true);
//		frame.setResizable(false);
//		frame.setBounds(250, 140, 450, 515);
//		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		
//		setTextField(new JTextField());
//		getTextField().setEditable(false);
//		getTextField().setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
//		getTextField().setHorizontalAlignment(SwingConstants.CENTER);
//		getTextField().setForeground(new Color(0, 0, 128));
//		getTextField().setFont(new Font("Sylfaen", Font.BOLD, 30));
//		getTextField().setBounds(0, 29, 434, 49);
//		frame.getContentPane().add(getTextField());
//		getTextField().setColumns(10);
//		
//		JLabel lblNewLabel = new JLabel("Cinemas");
//		lblNewLabel.setForeground(new Color(127, 255, 0));
//		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
//		lblNewLabel.setBounds(37, 103, 124, 42);
//		frame.getContentPane().add(lblNewLabel);
//		
//		comboBox = new JComboBox();
//		comboBox.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if(comboBox.getSelectedItem().equals("1"))
//				{
//					getTextField_1().setText("120");
//				}
//				else if(comboBox.getSelectedItem().equals("2"))
//				{
//					getTextField_1().setText("240");
//				}
//				else if(comboBox.getSelectedItem().equals("3"))
//				{
//					getTextField_1().setText("360");
//				}
//				else if(comboBox.getSelectedItem().equals("4"))
//				{
//					getTextField_1().setText("480");
//				}
//				else if(comboBox.getSelectedItem().equals("5"))
//				{
//					getTextField_1().setText("600");
//				}
//				else if(comboBox.getSelectedItem().equals("6"))
//				{
//					getTextField_1().setText("720");
//				}
//				else if(comboBox.getSelectedItem().equals("7"))
//				{
//					getTextField_1().setText("840");
//				}
//				else if(comboBox.getSelectedItem().equals("8"))
//				{
//					getTextField_1().setText("960");
//				}
//				else if(comboBox.getSelectedItem().equals("9"))
//				{
//					getTextField_1().setText("1080");
//				}
//				else if(comboBox.getSelectedItem().equals("10"))
//				{
//					getTextField_1().setText("1200");
//				}
//			}
//		});
//		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
//		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
//		comboBox.setBounds(176, 177, 182, 36);
//		frame.getContentPane().add(comboBox);
//		
//		JLabel lblThickets = new JLabel("Tickets ");
//		lblThickets.setForeground(new Color(127, 255, 0));
//		lblThickets.setFont(new Font("Tahoma", Font.BOLD, 23));
//		lblThickets.setBounds(37, 177, 124, 42);
//		frame.getContentPane().add(lblThickets);
//		
//		comboBox_1 = new JComboBox();
//		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Meher Theatre", "Gold Cinema", "Sarv Multiplex", "Vimal Cineplex", "Bharat Starworld", "Shree Talkies", "Sanjay Talkies", "Mahalaxmi Cinema"}));
//		comboBox_1.setBounds(176, 106, 182, 36);
//		frame.getContentPane().add(comboBox_1);
//		
//		JLabel lblTime = new JLabel("Time");
//		lblTime.setForeground(new Color(127, 255, 0));
//		lblTime.setFont(new Font("Tahoma", Font.BOLD, 23));
//		lblTime.setBounds(37, 250, 124, 42);
//		frame.getContentPane().add(lblTime);
//		
//		comboBox_2 = new JComboBox();
//		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"08:00 AM - 10:30 AM", "11:00 AM - 01:30 PM", "02:00 PM - 04:30 PM", "05:00 PM - 07:30 PM", "08:00 PM - 10:30 PM"}));
//		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		comboBox_2.setBounds(176, 254, 182, 36);
//		frame.getContentPane().add(comboBox_2);
//		
//		JLabel lblPayable = new JLabel("Payable");
//		lblPayable.setForeground(new Color(127, 255, 0));
//		lblPayable.setFont(new Font("Tahoma", Font.BOLD, 23));
//		lblPayable.setBounds(37, 320, 124, 42);
//		frame.getContentPane().add(lblPayable);
//		
//		
//		setTextField_1(new JTextField());
//		getTextField_1().setEditable(false);
//		getTextField_1().setFont(new Font("Tahoma", Font.BOLD, 20));
//		getTextField_1().setBounds(176, 323, 182, 42);
//		frame.getContentPane().add(getTextField_1());
//		getTextField_1().setColumns(10);
//		
//		JButton btnNewButton = new JButton("Pay");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try {
//				if(textField_1.getText().trim().isEmpty())
//				{
//					JOptionPane.showMessageDialog(null, "Select the Tickets");
//				}
//				else {
//				JOptionPane.showMessageDialog(null, "Congrats! Payment was successful");
//				frame.dispose();
//				//new TicketCinema();
//				}
//				}
//				catch(Exception ex) {
//					
//				}
//			}
//		});
//		btnNewButton.setForeground(new Color(255, 0, 0));
//		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
//		btnNewButton.setBounds(78, 396, 89, 42);
//		frame.getContentPane().add(btnNewButton);
//		
//		JButton btnCancle = new JButton("Cancle");
//		btnCancle.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
//				//ca1.getFrame().dispose();
//				new CinemaAgra();
//			}
//		});
//		btnCancle.setForeground(Color.RED);
//		btnCancle.setFont(new Font("Tahoma", Font.BOLD, 15));
//		btnCancle.setBounds(234, 396, 89, 42);
//		frame.getContentPane().add(btnCancle);
//	}
//	
//	
//	
//	public JTextField getTextField() {
//		return textField;
//		
//	}
//
//	public void setTextField(JTextField textField) {
//		this.textField = textField;
//		textField.setBackground(new Color(143, 188, 143));
//	}
//
//	public JTextField getTextField_1() {
//		return (textField_1);
//	}
//
//	public void setTextField_1(JTextField textField_1) {
//		this.textField_1 = textField_1;
//	}
//	
//	
//}
