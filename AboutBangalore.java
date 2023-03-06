package mySQL;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AboutBangalore {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutBangalore window = new AboutBangalore();
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
	public AboutBangalore() {
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(675, 89, 675, 366);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("BANGALORE PALACE");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(220, 220, 220));
		lblNewLabel_1.setBounds(0, 0, 675, 60);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("image\\BANGALORE\\bengaluru.jpg"));
		lblNewLabel_2_1.setBounds(0, 60, 675, 306);
		panel_1.add(lblNewLabel_2_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, 89, 675, 366);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("VIDHANA SOUDHA");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1_1.setBackground(new Color(220, 220, 220));
		lblNewLabel_1_1.setBounds(0, 0, 675, 60);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("image\\BANGALORE\\10-best-tourist-places-to-visit-in-Bangalore-and-must-visit-places-near-it.jpg"));
		lblNewLabel_2.setBounds(0, 60, 675, 306);
		panel_1_1.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 454, 1350, 275);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("About Bangalore City");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(new Color(240, 230, 140));
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.BOLD, 35));
		lblNewLabel_3.setBounds(0, 0, 1350, 67);
		panel.add(lblNewLabel_3);
		
		JTextArea txtpnTheTajCity = new JTextArea();
		txtpnTheTajCity.setEditable(false);
		txtpnTheTajCity.setText("Bengaluru (also called Bangalore) is the capital of India's southern Karnataka state. The center"
								+ " of India's high-tech industry, \nthe city is also known for its parks and nightlife. By Cubbon"
								+ "Park, Vidhana Soudha is a Neo-Dravidian legistlative building. For-\nmer royal residences include "
								+ "19th century Bangalore Palace, modeled after England's Windsor castle, and Tipu Sultan's Summ-\ner Palace,"
								+ "an 18th century teak structure. The city's history dates back to around890 CE, as found in a stone inscription "
								+ "found \nat the Nageshwara Temple in Begur, Banagalore. In 1537 CE, Kempe Gowda - a feudal ruler under the Vijayanagara "
								+ "Empire - \nestablished a mud fort, considered the foundation modern Bangalore and its oldest areas, or petes,"
								+ "which still exist."
								+ "");
		txtpnTheTajCity.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtpnTheTajCity.setBounds(0, 67, 1350, 208);
		panel.add(txtpnTheTajCity);
		
		JButton btnNewButton = new JButton("\uF0E7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new Bengluru();
			}
		});
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setOpaque(false);
		btnNewButton.setBorder(null);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Wingdings", Font.PLAIN, 30));
		btnNewButton.setBounds(41, 11, 74, 44);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("BANGALORE (IT HUB) ");
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 60));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(135, 206, 250));
		lblNewLabel.setBounds(0, 0, 1350, 88);
		frame.getContentPane().add(lblNewLabel);
	}
}
