package mySQL;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Agra {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agra window = new Agra();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Agra() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setResizable(false);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width, screen.height);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TAJ CITY AGRA");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(152, 251, 152));
		lblNewLabel.setLocation(new Point(0, 2));
		lblNewLabel.setAlignmentY(5.0f);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 50));
		lblNewLabel.setBounds(0, 0, 1350, 78);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HOME");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new UserHomePage();
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
		lblNewLabel_1.setBounds(0, 79, 163, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("HOTELS");
		lblNewLabel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new Hotels();
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
		lblNewLabel_1_3.setBounds(331, 79, 229, 45);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("ATM");
		lblNewLabel_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new Atm();
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
		lblNewLabel_1_4.setBounds(162, 79, 171, 45);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("ABOUT");
		lblNewLabel_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new AboutAgra();
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
		lblNewLabel_1_5.setBounds(1100, 79, 250, 45);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_2 = new JLabel("CINEMA");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new CinemaAgra();
			}
			
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_2.setForeground(new Color(0,0,225));
				lblNewLabel_1_2.setBackground(new Color(139,0,0));
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_2.setForeground(new Color(139,0,0));
				lblNewLabel_1_2.setBackground(new Color(143,188,143));
			}
		});
		lblNewLabel_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_2.setBackground(new Color(143, 188, 143));
		lblNewLabel_1_2.setOpaque(true);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_2.setBounds(557, 79, 242, 45);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 123, 1350, 606);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("IMAGE\\AGRA\\agra.png"));
		lblNewLabel_2_1.setBounds(0, 0, 1350, 595);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("TOURISM PLACES");
		lblNewLabel_1_1.setBounds(799, 79, 305, 45);
		frame.getContentPane().add(lblNewLabel_1_1);
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new TouristInAgra();
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
	}
}
