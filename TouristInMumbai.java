package mySQL;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TouristInMumbai {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TouristInMumbai window = new TouristInMumbai();
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
	public TouristInMumbai() {
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

		JButton btnNewButton = new JButton("\uF0E7");
		btnNewButton.setBorder(null);
		btnNewButton.setOpaque(false);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new Mumbai();
			}
		});
		btnNewButton.setFont(new Font("Wingdings", Font.PLAIN, 30));
		btnNewButton.setBounds(100, 21, 75, 53);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Tourism Places in Mumbai");
		lblNewLabel.setBounds(0, 0, 1350, 88);

		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(0, 255, 0));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 50));
		frame.getContentPane().add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBounds(0, 123, 1350, 606);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("image\\MUMBAI\\Best-Places-to-Visit-in-Mumbai.jpg"));
		lblNewLabel_2.setBounds(0, 0, 675, 305);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("image\\MUMBAI\\m_Mumbai_dest_landscape_l_1029_1543.jpg"));
		lblNewLabel_2_1.setBounds(675, 0, 675, 305);
		panel.add(lblNewLabel_2_1);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("image\\MUMBAI\\water-kingdom-mumbai-tourism-entry-fee-timings-holidays-reviews-header.jpg"));
		lblNewLabel_3.setBounds(0, 304, 450, 302);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("image\\MUMBAI\\global-vipassana-pagoda.jpg"));
		lblNewLabel_3_1.setBounds(452, 304, 450, 302);
		panel.add(lblNewLabel_3_1);

		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon("image\\MUMBAI\\702408349-H.jpg"));
		lblNewLabel_3_2.setBounds(900, 304, 450, 302);
		panel.add(lblNewLabel_3_2);

		JLabel lblNewLabel_1 = new JLabel(
				"Mumbai is the industrial capital of India. It is the biggest populated city");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setForeground(Color.white);
				lblNewLabel_1.setBackground(new Color(139, 0, 0));
			}

			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setForeground(new Color(139, 0, 0));
				lblNewLabel_1.setBackground(new Color(143, 188, 143));
			}

//			@Override
//			public void mouseClicked(MouseEvent e) {
//				frame.dispose();
//				new TajMahal();
//			}
		});
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(143, 188, 143));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 88, 1350, 36);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
