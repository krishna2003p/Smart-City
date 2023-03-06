package mySQL;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AtmInMumbai {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtmInMumbai window = new AtmInMumbai();
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
	public AtmInMumbai() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setResizable(false);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width, screen.height);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 71, 1350, 49);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("SBI");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("9223766666 , 9223866666 , 18001234");
				textField_1.setText("State Bank Of India ATM Mumbai");
				textField_2.setText("Matunga,Mumbai");
				textField_3.setText("2VJ3+WQV,Near KA Subramanyam");
				textField_4.setText("24 hours");
				
				textField_5.setText("State Bank Of India ATM Mumbai");
				textField_6.setText("Kamathipura, Mumbai");
				textField_7.setText("3,Pathe Bapurao Marg");
				textField_8.setText("24 hours");
				
				textField_9.setText("State Bank Of India ATM Mumbai");
				textField_10.setText("Andheri West");
				textField_11.setText("opp. Railway station, Lohana");
				textField_12.setText("24 hours");
				
				textField_13.setText("State Bank Of India ATM Mumbai");
				textField_14.setText("Bhanga Bazar");
				textField_15.setText("Karimganj Mumbai");
				textField_16.setText("24 hours");
				
				textField_17.setText("State Bank Of India ATM Mumbai");
				textField_18.setText("Mumbai");
				textField_19.setText("3-A,VN Purav Marg");
				textField_20.setText("24 hours");
				
				textField_21.setText("State Bank Of India ATM Mumbai");
				textField_22.setText("Andheri West");
				textField_23.setText("A-1,Haridwar Marg,gharkul society");
				textField_24.setText("24 hours");
				
			}
			
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setForeground(new Color(0,0,225));
				lblNewLabel_1.setBackground(new Color(0,139,139));
				lblNewLabel_1.setOpaque(true);
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setForeground(new Color(184, 134, 11));
				lblNewLabel_1.setOpaque(false);
			}
		});
		lblNewLabel_1.setForeground(new Color(184, 134, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 0, 105, 49);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CANARA");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("09015734734 , 09015613613 , 18004250018");
				textField_1.setText("Canara Bank ATM Mumbai");
				textField_2.setText("Andheri West");
				textField_3.setText("A-1,Haridwar Marg");
				textField_4.setText("24 hours");
				
				textField_5.setText("Canara Bank ATM Mumbai");
				textField_6.setText("Mumbai");
				textField_7.setText("3-A,VN Purav Marg");
				textField_8.setText("24 hours");
				
				textField_9.setText("Canara Bank ATM Mumbai");
				textField_10.setText("Gharkul Society Mumabi");
				textField_11.setText("A-0 Bhairon bazar complex");
				textField_12.setText("24 hours");
				
				textField_13.setText("Canara Bank ATM Mumbai");
				textField_14.setText("Matunga,Mumbai");
				textField_15.setText("S.O, 4/129,kacherighat");
				textField_16.setText("24 hours");
				
				textField_17.setText("Canara Bank ATM Mumbai");
				textField_18.setText("Vibhav Nagar");
				textField_19.setText("H.O, vibhav nagar ");
				textField_20.setText("24 hours");
				
				textField_21.setText("Canara Bank ATM Mumbai");
				textField_22.setText("Arya Nagar Mumbai");
				textField_23.setText("D-516, Arya nagar");
				textField_24.setText("24 hours");
			}
			
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_1.setForeground(new Color(0,0,225));
				lblNewLabel_1_1.setBackground(new Color(0,139,139));
				lblNewLabel_1_1.setOpaque(true);
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_1.setForeground(new Color(184, 134, 11));
				lblNewLabel_1_1.setOpaque(false);
			}
		});
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1.setForeground(new Color(184, 134, 11));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(121, 0, 105, 49);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("HDFC");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("07573919585 , 02268461208 , 18002026161 ");
				textField_1.setText("HDFC Bank ATM Mumbai");
				textField_2.setText("Global Nagar");
				textField_3.setText("kn, 228, Gagan Complex");
				textField_4.setText("24 hours");
				
				textField_5.setText("HDFC Bank ATM Mumbai");
				textField_6.setText("Mumbai");
				textField_7.setText("No 4, ground floor Amarkunj");
				textField_8.setText("24 hours");
				
				textField_9.setText("HDFC Bank ATM Mumbai");
				textField_10.setText("Kanchan Pur");
				textField_11.setText("MIG No 37, Shilpgram road");
				textField_12.setText("24 hours");
				
				textField_13.setText("HDFC Bank ATM Mumbai");
				textField_14.setText("Mumbai");
				textField_15.setText("No 38/1/12, Raja ram ki");
				textField_16.setText("24 hours");
				
				textField_17.setText("HDFC Bank ATM Mumbai");
				textField_18.setText("Megha Nagar");
				textField_19.setText("No 26, Phase 1, S complex");
				textField_20.setText("24 hours");
				
				textField_21.setText("HDFC Bank ATM Mumbai");
				textField_22.setText("Mumbai");
				textField_23.setText("No C2, 50, Geeta nagar");
				textField_24.setText("24 hours");
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_2.setForeground(new Color(0,0,225));
				lblNewLabel_1_2.setBackground(new Color(0,139,139));
				lblNewLabel_1_2.setOpaque(true);
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_2.setForeground(new Color(184, 134, 11));
				lblNewLabel_1_2.setOpaque(false);
			}
		});
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_2.setForeground(new Color(184, 134, 11));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(252, 0, 105, 49);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("AXIS BANK");
		lblNewLabel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("0562-4000294 , 0562-4000295 , 18605505555");
				textField_1.setText("Axis Bank ATM Mumbai");
				textField_2.setText("Ballard Estate Mumbai");
				textField_3.setText("Shop C,200,beside Laxmi Auto");
				textField_4.setText("24 hours");
				
				textField_5.setText("Axis Bank ATM Mumbai");
				textField_6.setText("Aarey Colony, Powai");
				textField_7.setText("No C 2/49, Ground floor");
				textField_8.setText("24 hours");
				
				textField_9.setText("Axis Bank ATM Mumbai");
				textField_10.setText("Mahatma Phule Nagar");
				textField_11.setText("Shop No 1 Filter pada Cir");
				textField_12.setText("24 hours");
				
				textField_13.setText("Axis Bank ATM Mumbai");
				textField_14.setText("Andheri East Mumbai");
				textField_15.setText("Training school Marol rd");
				textField_16.setText("24 hours");
				
				textField_17.setText("Axis Bank ATM Mumbai");
				textField_18.setText("Mohan Nagar Mumbai");
				textField_19.setText("No 53,1, Mohan nagar");
				textField_20.setText("24 hours");
				
				textField_21.setText("Axis Bank ATM Mumbai");
				textField_22.setText("Lal Bahadur rd Mumbai");
				textField_23.setText("Petrol Pump Reckcel Cooprative");
				textField_24.setText("24 hours");
			}
			
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_3.setForeground(new Color(0,0,225));
				lblNewLabel_1_3.setBackground(new Color(0,139,139));
				lblNewLabel_1_3.setOpaque(true);
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_3.setForeground(new Color(184, 134, 11));
				lblNewLabel_1_3.setOpaque(false);
			}
		});
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_3.setForeground(new Color(184, 134, 11));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(377, 0, 147, 49);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_5 = new JLabel("YES BANK");
		lblNewLabel_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("+91(22)50919800 , 2249350000 , 18001031212");
				textField_1.setText("Yes Bank ATM Mumbai");
				textField_2.setText("Mulund West Mumbai");
				textField_3.setText("SN 12 A&B,UN 103 B");
				textField_4.setText("24 hours");
				
				textField_5.setText("Yes Bank ATM Mumbai");
				textField_6.setText("Shankardhan rd");
				textField_7.setText("No 20/20 A,GF,shankar. rd");
				textField_8.setText("24 hours");
				
				textField_9.setText("Yes Bank ATM Mumbai");
				textField_10.setText("Bahaddur Nagar");
				textField_11.setText("Unit No 6, CB Park");
				textField_12.setText("24 hours");
				
				textField_13.setText("Yes Bank ATM Mumbai");
				textField_14.setText("Indrapuram Mumbai");
				textField_15.setText("Shop No , 100 feet rd");
				textField_16.setText("24 hours");
				
				textField_17.setText("Yes Bank ATM Mumbai");
				textField_18.setText("Azad Nagar Mumbai");
				textField_19.setText("Plot No 20 & 20A Azad Nagar");
				textField_20.setText("24 hours");
				
				textField_21.setText("Yes Bank ATM Mumbai");
				textField_22.setText("Andheri West Mumbai");
				textField_23.setText("Shop No1 sports complex");
				textField_24.setText("24 hours");
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_5.setForeground(new Color(0,0,225));
				lblNewLabel_1_5.setBackground(new Color(0,139,139));
				lblNewLabel_1_5.setOpaque(true);
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_5.setForeground(new Color(184, 134, 11));
				lblNewLabel_1_5.setOpaque(false);
			}
		});
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_5.setForeground(new Color(184, 134, 11));
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(565, 0, 137, 49);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("BANK OF INDIA");
		lblNewLabel_1_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("(022) 40919191 , 18001031906 , 1800220229");
				textField_1.setText("Bank of India ATM Mumbai");
				textField_2.setText("Chakala,Andheri East");
				textField_3.setText("Opposite Sangam Cinema");
				textField_4.setText("24 hours");
				
				textField_5.setText("Bank of India ATM Mumbai");
				textField_6.setText("shashtri puri Mumbai");
				textField_7.setText("62B4X+8FP, Kurla rd");
				textField_8.setText("24 hours");
				
				textField_9.setText("Bank of India ATM Mumbai");
				textField_10.setText("Amrut Nagar Mumbai");
				textField_11.setText("B-1,Golibar rd Ram Nagar");
				textField_12.setText("24 hours");
				
				textField_13.setText("Bank of India ATM Mumbai");
				textField_14.setText("Mumbai");
				textField_15.setText("Chor Bazar Mumbai");
				textField_16.setText("24 hours");
				
				textField_17.setText("Bank of India ATM Mumbai");
				textField_18.setText("52XG+76X Sky mandi");
				textField_19.setText("aman Palace Sky Mandi");
				textField_20.setText("24 hours");
				
				textField_21.setText("Bank of India ATM Mumbai");
				textField_22.setText("Chakala Mumbai");
				textField_23.setText("5256+J7M, Chakala");
				textField_24.setText("24 hours");
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_6.setForeground(new Color(0,0,225));
				lblNewLabel_1_6.setBackground(new Color(0,139,139));
				lblNewLabel_1_6.setOpaque(true);
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_6.setForeground(new Color(184, 134, 11));
				lblNewLabel_1_6.setOpaque(false);
			}
		});
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_6.setForeground(new Color(184, 134, 11));
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(728, 0, 214, 49);
		panel.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_9 = new JLabel("INDUSIND BANK");
		lblNewLabel_1_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("022-44066666 , 022-42207777 , 18602677777");
				textField_1.setText("Indusind ATM Mumbai");
				textField_2.setText("Shaka pur Mumbai");
				textField_3.setText("Shop 5 Vishkarma Market");
				textField_4.setText("24 hours");
				
				textField_5.setText("Indusind ATM Mumbai");
				textField_6.setText("Azad Nagar Mumbai");
				textField_7.setText("P 58/294b/3 Pavitra vatika");
				textField_8.setText("24 hours");
				
				textField_9.setText("Indusind ATM Mumbai");
				textField_10.setText("Andheri West Mumbai");
				textField_11.setText("Block No 48/6, G Floor");
				textField_12.setText("24 hours");
				
				textField_13.setText("Indusind ATM Mumbai");
				textField_14.setText("Army base Work");
				textField_15.setText("38/204,Gopal Pura");
				textField_16.setText("24 hours");
				
				textField_17.setText("Indusind ATM Mumbai");
				textField_18.setText("Lokmanya Tilak Mumbai");
				textField_19.setText("LTT adjacent in BB end of PF no1");
				textField_20.setText("24 hours");
				
				textField_21.setText("Indusind ATM Mumbai");
				textField_22.setText("Worli Shivaji Nagar");
				textField_23.setText("Super service station 233");
				textField_24.setText("24 hours");
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_9.setForeground(new Color(0,0,225));
				lblNewLabel_1_9.setBackground(new Color(0,139,139));
				lblNewLabel_1_9.setOpaque(true);
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_9.setForeground(new Color(184, 134, 11));
				lblNewLabel_1_9.setOpaque(false);
			}
		});
		lblNewLabel_1_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_9.setForeground(new Color(184, 134, 11));
		lblNewLabel_1_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_9.setBounds(969, 0, 206, 49);
		panel.add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_11 = new JLabel("ICICI");
		lblNewLabel_1_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("18001080 , 18001038181 , 18601206699");
				textField_1.setText("ICICI ATM Mumbai");
				textField_2.setText("Dadar West Mumbai");
				textField_3.setText("2RGP+C9R, dadar west");
				textField_4.setText("24 hours");
				
				textField_5.setText("ICICI ATM Mumbai");
				textField_6.setText("Shivaji Park Mumbai");
				textField_7.setText("50-A,Taj rd Cantoment");
				textField_8.setText("24 hours");
				
				textField_9.setText("ICICI ATM Mumbai");
				textField_10.setText("Byculla East Mumbai");
				textField_11.setText("Nekjat maratha sadan");
				textField_12.setText("24 hours");
				
				textField_13.setText("ICICI ATM Mumbai");
				textField_14.setText("Vidya Vihar Mumbai");
				textField_15.setText("Vidya Vihar railway station");
				textField_16.setText("24 hours");
				
				textField_17.setText("ICICI ATM Mumbai");
				textField_18.setText("Priyadarshini Society");
				textField_19.setText("2R8R+XCF,Near Jai Hind app.");
				textField_20.setText("24 hours");
				
				textField_21.setText("ICICI ATM Mumbai");
				textField_22.setText("Senapati Marg Mumbai");
				textField_23.setText("Shop No 4, Adjoining of rd");
				textField_24.setText("24 hours");
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_11.setForeground(new Color(0,0,225));
				lblNewLabel_1_11.setBackground(new Color(0,139,139));
				lblNewLabel_1_11.setOpaque(true);
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_11.setForeground(new Color(184, 134, 11));
				lblNewLabel_1_11.setOpaque(false);
			}
		});
		lblNewLabel_1_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_11.setForeground(new Color(184, 134, 11));
		lblNewLabel_1_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_11.setBounds(1193, 0, 150, 49);
		panel.add(lblNewLabel_1_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 250, 210));
		panel_1.setBounds(0, 685, 1350, 44);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("CALL ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2.setBounds(452, 0, 142, 44);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setForeground(Color.RED);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBorder(null);
		textField.setOpaque(false);
		textField.setBounds(589, 7, 652, 33);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(-1, 122, 1350, 568);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3.setBounds(4, 2, 436, 273);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_1.setBounds(10, 11, 415, 46);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Area:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(10, 85, 98, 30);
		panel_3.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(139, 85, 286, 29);
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Address:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(11, 154, 97, 30);
		panel_3.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setBounds(139, 154, 286, 30);
		panel_3.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Available:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(10, 222, 119, 30);
		panel_3.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setBounds(139, 222, 286, 29);
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3_1.setBounds(4, 285, 436, 273);
		panel_2.add(panel_3_1);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setEditable(false);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_5.setColumns(10);
		textField_5.setBounds(10, 11, 415, 46);
		panel_3_1.add(textField_5);
		
		JLabel lblNewLabel_3_1 = new JLabel("Area:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(10, 85, 108, 30);
		panel_3_1.add(lblNewLabel_3_1);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(128, 85, 297, 29);
		panel_3_1.add(textField_6);
		
		JLabel lblNewLabel_4_1 = new JLabel("Address:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_1.setBounds(11, 154, 107, 30);
		panel_3_1.add(lblNewLabel_4_1);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(128, 154, 297, 30);
		panel_3_1.add(textField_7);
		
		JLabel lblNewLabel_5_1 = new JLabel("Available:");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5_1.setBounds(10, 222, 108, 30);
		panel_3_1.add(lblNewLabel_5_1);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(128, 222, 297, 29);
		panel_3_1.add(textField_8);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3_2.setBounds(455, 2, 436, 273);
		panel_2.add(panel_3_2);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setEditable(false);
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_9.setColumns(10);
		textField_9.setBounds(10, 11, 415, 46);
		panel_3_2.add(textField_9);
		
		JLabel lblNewLabel_3_2 = new JLabel("Area:");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(10, 85, 108, 30);
		panel_3_2.add(lblNewLabel_3_2);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_10.setColumns(10);
		textField_10.setBounds(128, 85, 297, 29);
		panel_3_2.add(textField_10);
		
		JLabel lblNewLabel_4_2 = new JLabel("Address:");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_2.setBounds(11, 154, 107, 30);
		panel_3_2.add(lblNewLabel_4_2);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_11.setColumns(10);
		textField_11.setBounds(128, 154, 297, 30);
		panel_3_2.add(textField_11);
		
		JLabel lblNewLabel_5_2 = new JLabel("Available:");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5_2.setBounds(10, 222, 108, 30);
		panel_3_2.add(lblNewLabel_5_2);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_12.setColumns(10);
		textField_12.setBounds(128, 222, 297, 29);
		panel_3_2.add(textField_12);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setLayout(null);
		panel_3_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3_3.setBounds(908, 2, 436, 273);
		panel_2.add(panel_3_3);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setEditable(false);
		textField_13.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_13.setColumns(10);
		textField_13.setBounds(10, 11, 415, 46);
		panel_3_3.add(textField_13);
		
		JLabel lblNewLabel_3_3 = new JLabel("Area:");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_3.setBounds(10, 85, 108, 30);
		panel_3_3.add(lblNewLabel_3_3);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_14.setColumns(10);
		textField_14.setBounds(128, 85, 297, 29);
		panel_3_3.add(textField_14);
		
		JLabel lblNewLabel_4_3 = new JLabel("Address:");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_3.setBounds(11, 154, 107, 30);
		panel_3_3.add(lblNewLabel_4_3);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_15.setColumns(10);
		textField_15.setBounds(128, 154, 297, 30);
		panel_3_3.add(textField_15);
		
		JLabel lblNewLabel_5_3 = new JLabel("Available:");
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5_3.setBounds(10, 223, 108, 30);
		panel_3_3.add(lblNewLabel_5_3);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_16.setColumns(10);
		textField_16.setBounds(128, 222, 297, 29);
		panel_3_3.add(textField_16);
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setLayout(null);
		panel_3_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3_4.setBounds(455, 285, 436, 273);
		panel_2.add(panel_3_4);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setEditable(false);
		textField_17.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_17.setColumns(10);
		textField_17.setBounds(10, 11, 415, 46);
		panel_3_4.add(textField_17);
		
		JLabel lblNewLabel_3_4 = new JLabel("Area:");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_4.setBounds(10, 85, 108, 30);
		panel_3_4.add(lblNewLabel_3_4);
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_18.setColumns(10);
		textField_18.setBounds(128, 85, 297, 29);
		panel_3_4.add(textField_18);
		
		JLabel lblNewLabel_4_4 = new JLabel("Address:");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_4.setBounds(11, 154, 107, 30);
		panel_3_4.add(lblNewLabel_4_4);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_19.setColumns(10);
		textField_19.setBounds(128, 154, 297, 30);
		panel_3_4.add(textField_19);
		
		JLabel lblNewLabel_5_4 = new JLabel("Available:");
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5_4.setBounds(10, 222, 108, 30);
		panel_3_4.add(lblNewLabel_5_4);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_20.setColumns(10);
		textField_20.setBounds(128, 222, 297, 29);
		panel_3_4.add(textField_20);
		
		JPanel panel_3_5 = new JPanel();
		panel_3_5.setLayout(null);
		panel_3_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3_5.setBounds(908, 285, 436, 273);
		panel_2.add(panel_3_5);
		
		textField_21 = new JTextField();
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setEditable(false);
		textField_21.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_21.setColumns(10);
		textField_21.setBounds(10, 11, 415, 46);
		panel_3_5.add(textField_21);
		
		JLabel lblNewLabel_3_5 = new JLabel("Area:");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_5.setBounds(10, 85, 108, 30);
		panel_3_5.add(lblNewLabel_3_5);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_22.setColumns(10);
		textField_22.setBounds(128, 85, 297, 29);
		panel_3_5.add(textField_22);
		
		JLabel lblNewLabel_4_5 = new JLabel("Address:");
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_5.setBounds(11, 154, 107, 30);
		panel_3_5.add(lblNewLabel_4_5);
		
		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_23.setColumns(10);
		textField_23.setBounds(128, 154, 297, 30);
		panel_3_5.add(textField_23);
		
		JLabel lblNewLabel_5_5 = new JLabel("Available:");
		lblNewLabel_5_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5_5.setBounds(10, 222, 108, 30);
		panel_3_5.add(lblNewLabel_5_5);
		
		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_24.setColumns(10);
		textField_24.setBounds(128, 222, 297, 29);
		panel_3_5.add(textField_24);
		
		JButton btnNewButton = new JButton("\uF0E7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new Mumbai();
			}
		});
		btnNewButton.setBackground(new Color(124, 252, 0));
		btnNewButton.setOpaque(false);
		btnNewButton.setBorder(null);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Wingdings", Font.BOLD, 25));
		btnNewButton.setBounds(43, 11, 76, 49);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("ATM IN MUMBAI");
		lblNewLabel.setBounds(0, 0, 1350, 71);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(124, 252, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(255, 0, 0));
	}
}