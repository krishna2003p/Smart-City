package mySQL;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class CinemaLucknow {

	private JFrame frame;
	private JButton back;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CinemaLucknow window = new CinemaLucknow();
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
	public CinemaLucknow() {
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
		
		back = new JButton("\uF0E7");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new Lucknow();
			}
		});
		back.setBorder(null);
		back.setOpaque(false);
		back.setForeground(Color.RED);
		back.setBackground(new Color(238,232,170));
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.setFont(new Font("Wingdings", Font.BOLD, 30));
		back.setBounds(50,20,70,40);
		frame.getContentPane().add(back);
		
		JLabel lblNewLabel = new JLabel("CINEMA IN LUCKNOW");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(238, 232, 170));
		lblNewLabel.setForeground(new Color(70, 130, 180));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 60));
		lblNewLabel.setBounds(0, 0, 1350, 80);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(0, 81, 1350, 52);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New Releases Movies");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new CinemaLucknow();
			}
			
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setForeground(new Color(255,51,51));
				lblNewLabel_1.setBackground(new Color(255,255,0));
				lblNewLabel_1.setOpaque(true);
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setForeground(Color.BLUE);
				lblNewLabel_1.setOpaque(false);
			}
		});
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 0, 265, 52);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Trending Movies");
		lblNewLabel_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new CinemaLucknow();
			}
			
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_1.setForeground(new Color(255,51,51));
				lblNewLabel_1_1.setBackground(new Color(255,255,0));
				lblNewLabel_1_1.setOpaque(true);
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_1.setForeground(Color.BLUE);
				lblNewLabel_1_1.setOpaque(false);
			}
		});
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(273, 0, 265, 52);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Superhit Movies");
		lblNewLabel_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new CinemaLucknow();
			}
			
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_2.setForeground(new Color(255,51,51));
				lblNewLabel_1_2.setBackground(new Color(255,255,0));
				lblNewLabel_1_2.setOpaque(true);
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_2.setForeground(Color.BLUE);
				lblNewLabel_1_2.setOpaque(false);
			}
		});
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.BLUE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(520, 0, 265, 52);
		panel.add(lblNewLabel_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.DARK_GRAY);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Movies", "Brahmastra", "KGF Chapter 2", "90 ML", "RakshaBandhan", "Ek Villain Returns", "Cuttputalli", "Heropanti 2", "RRR", "Baahubali 2", "Lal Singh Chadda"}));
		comboBox.setBounds(1026, 2, 203, 48);
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("Brahmastra")) {
					frame.dispose();
					CinemaTicketLucknow ct = new CinemaTicketLucknow();
					ct.getTextField().setText("Bramhastra Part 1 - Shiva");
				}
				else if(comboBox.getSelectedItem().equals("KGF Chapter 2")) {
					frame.dispose();
					CinemaTicketLucknow ct = new CinemaTicketLucknow();
					ct.getTextField().setText("KGF Chapter 2");
				}
				else if(comboBox.getSelectedItem().equals("Cuttputalli")) {
					frame.dispose();
					CinemaTicketLucknow ct = new CinemaTicketLucknow();
					ct.getTextField().setText("Cuttputalli");
				}
				else if(comboBox.getSelectedItem().equals("Baahubali 2")) {
					frame.dispose();
					CinemaTicketLucknow ct = new CinemaTicketLucknow();
					ct.getTextField().setText("Baahubali 2");
				}
				else if(comboBox.getSelectedItem().equals("Ek Villain Returns")) {
					frame.dispose();
					CinemaTicketLucknow ct = new CinemaTicketLucknow();
					ct.getTextField().setText("Ek Villain Returns");
				}
				else if(comboBox.getSelectedItem().equals("90 ML")) {
					frame.dispose();
					CinemaTicketLucknow ct = new CinemaTicketLucknow();
					ct.getTextField().setText("90 ML");
				}
				else if(comboBox.getSelectedItem().equals("Heropanti 2")) {
					frame.dispose();
					CinemaTicketLucknow ct = new CinemaTicketLucknow();
					ct.getTextField().setText("Heropanti 2");
				}
				else if(comboBox.getSelectedItem().equals("RRR")) {
					frame.dispose();
					CinemaTicketLucknow ct = new CinemaTicketLucknow();
					ct.getTextField().setText("RRR");
				}
				else if(comboBox.getSelectedItem().equals("RakshaBandhan")) {
					frame.dispose();
					CinemaTicketLucknow ct = new CinemaTicketLucknow();
					ct.getTextField().setText("RakshaBandhan");
				}
				else if(comboBox.getSelectedItem().equals("Lal Singh Chadda")) {
					frame.dispose();
					CinemaTicketLucknow ct = new CinemaTicketLucknow();
					ct.getTextField().setText("Lal Singh Chadda");
				}
				else if(comboBox.getSelectedItem().equals("KGF Chapter 2")) {
					frame.dispose();
					CinemaTicketLucknow ct = new CinemaTicketLucknow();
					ct.getTextField().setText("KGF Chapter 2");
				}
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(1228, 2, 64, 48);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBounds(2, 134, 268, 295);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new CinemaTicketLucknow();
				CinemaTicketLucknow ct = new CinemaTicketLucknow();
				ct.getTextField().setText("Bramhastra Part 1 - Shiva");
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("image\\MOVIES2\\bramashtra.jpg"));
		lblNewLabel_2.setBounds(-1, 0, 268, 295);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_1.setBounds(271, 134, 268, 295);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				CinemaTicketLucknow ct = new CinemaTicketLucknow();
				ct.getTextField().setText("RakshaBandhan");
			}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon("image\\MOVIES2\\rakshabandhan.jpg"));
		lblNewLabel_2_1.setBounds(-1, 0, 268, 295);
		panel_1_1.add(lblNewLabel_2_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_2.setBounds(540, 134, 268, 295);
		frame.getContentPane().add(panel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				CinemaTicketLucknow ct = new CinemaTicketLucknow();
				ct.getTextField().setText("CuttPutlli");
			}
		});
		lblNewLabel_2_2.setIcon(new ImageIcon("image\\MOVIES2\\cuttputli.png"));
		lblNewLabel_2_2.setBounds(-1, 0, 268, 295);
		panel_1_2.add(lblNewLabel_2_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_3.setBounds(810, 134, 268, 295);
		frame.getContentPane().add(panel_1_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				CinemaTicketLucknow ct = new CinemaTicketLucknow();
				ct.getTextField().setText("Heropanti 2");
			}
		});
		lblNewLabel_2_3.setIcon(new ImageIcon("image\\MOVIES2\\HEROPANTI2.jpg"));
		lblNewLabel_2_3.setBounds(-1, 0, 268, 295);
		panel_1_3.add(lblNewLabel_2_3);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_4.setBounds(1080, 134, 268, 295);
		frame.getContentPane().add(panel_1_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("");
		lblNewLabel_2_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				CinemaTicketLucknow ct = new CinemaTicketLucknow();
				ct.getTextField().setText("Lal Singh Chadda");
			}
		});
		lblNewLabel_2_4.setIcon(new ImageIcon("image\\MOVIES2\\lal singh chadda.jpg"));
		lblNewLabel_2_4.setBounds(0, 0, 268, 295);
		panel_1_4.add(lblNewLabel_2_4);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setLayout(null);
		panel_1_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_5.setBounds(2, 431, 268, 295);
		frame.getContentPane().add(panel_1_5);
		
		JLabel lblNewLabel_2_5 = new JLabel("");
		lblNewLabel_2_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				CinemaTicketLucknow ct = new CinemaTicketLucknow();
				ct.getTextField().setText("90 ML");
			}
		});
		lblNewLabel_2_5.setIcon(new ImageIcon("image\\MOVIES2\\90ml.jpg"));
		lblNewLabel_2_5.setBounds(-1, 0, 268, 295);
		panel_1_5.add(lblNewLabel_2_5);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_1_1.setBounds(271, 431, 268, 295);
		frame.getContentPane().add(panel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				CinemaTicketLucknow ct = new CinemaTicketLucknow();
				ct.getTextField().setText("RRR");
			}
		});
		lblNewLabel_2_1_1.setIcon(new ImageIcon("image\\MOVIES2\\rrr.jpg"));
		lblNewLabel_2_1_1.setBounds(0, 0, 268, 295);
		panel_1_1_1.add(lblNewLabel_2_1_1);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_2_1.setBounds(540, 431, 268, 295);
		frame.getContentPane().add(panel_1_2_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("");
		lblNewLabel_2_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				CinemaTicketLucknow ct = new CinemaTicketLucknow();
				ct.getTextField().setText("KGF Chapter 2");
			}
		});
		lblNewLabel_2_2_1.setIcon(new ImageIcon("image/MOVIES2/KGF2.jpg"));
		lblNewLabel_2_2_1.setBounds(-1, 0, 268, 295);
		panel_1_2_1.add(lblNewLabel_2_2_1);
		
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setLayout(null);
		panel_1_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_3_1.setBounds(809, 431, 268, 295);
		frame.getContentPane().add(panel_1_3_1);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("");
		lblNewLabel_2_3_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				CinemaTicketLucknow ct = new CinemaTicketLucknow();
				ct.getTextField().setText("Baahubali 2");
			}
		});
		lblNewLabel_2_3_1.setIcon(new ImageIcon("image\\MOVIES2\\baahubali-2-the-conclusion_149577721640.jpg"));
		lblNewLabel_2_3_1.setBounds(0, 0, 268, 295);
		panel_1_3_1.add(lblNewLabel_2_3_1);
		
		JPanel panel_1_4_1 = new JPanel();
		panel_1_4_1.setLayout(null);
		panel_1_4_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_4_1.setBounds(1079, 431, 268, 295);
		frame.getContentPane().add(panel_1_4_1);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("");
		lblNewLabel_2_4_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				CinemaTicketLucknow ct = new CinemaTicketLucknow();
				ct.getTextField().setText("Ek Villain Returns");
			}
		});
		lblNewLabel_2_4_1.setIcon(new ImageIcon("image\\MOVIES2\\ek villain retuns.jpg"));
		lblNewLabel_2_4_1.setBounds(0, 0, 268, 295);
		panel_1_4_1.add(lblNewLabel_2_4_1);
	}
}
