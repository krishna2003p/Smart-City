package mySQL;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserHomePage {

	private JFrame frame;
	private JButton btnNewButton;
	private JTextField txtKrishna;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserHomePage window = new UserHomePage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public UserHomePage() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setResizable(false);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width,screen.height);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel welcomeUser = new JLabel("  WELCOME");
		welcomeUser.setVerticalAlignment(SwingConstants.TOP);
		welcomeUser.setHorizontalAlignment(SwingConstants.LEFT);
		welcomeUser.setToolTipText("");
		welcomeUser.setLabelFor(frame);
		welcomeUser.setForeground(new Color(139, 0, 0));
		welcomeUser.setFont(new Font("Sylfaen", Font.BOLD, 70));
		welcomeUser.setBounds(333, 13, 406, 75);
		frame.getContentPane().add(welcomeUser);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 86, 1350, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("Our Smart India");
		lblNewLabel.setForeground(new Color(139, 69, 19));
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 60));
		lblNewLabel.setBounds(193, 256, 478, 75);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to all in our Smart India.");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setForeground(new Color(128, 128, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 35));
		lblNewLabel_1.setBounds(193, 312, 779, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Hey guys! How are you, Select the city in which ");
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1.setForeground(new Color(240, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lblNewLabel_1_1.setBounds(193, 360, 735, 52);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("you want to see inner structure and also main ");
		lblNewLabel_1_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_2.setForeground(new Color(240, 255, 255));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lblNewLabel_1_2.setBounds(193, 393, 652, 48);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tourism Places and so more.");
		lblNewLabel_1_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_3.setForeground(new Color(240, 255, 255));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lblNewLabel_1_3.setBounds(193, 434, 617, 41);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("If you have any problem or query than you ");
		lblNewLabel_1_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_4.setForeground(new Color(240, 255, 255));
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lblNewLabel_1_4.setBounds(193, 474, 617, 41);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		txtKrishna = new JTextField();
		txtKrishna.setText("USER");
		txtKrishna.setEditable(false);
		txtKrishna.setOpaque(false);
		txtKrishna.setForeground(new Color(139, 0, 0));
		txtKrishna.setFont(new Font("Sylfaen", Font.BOLD, 70));
		txtKrishna.setBorder(null);
		txtKrishna.setCaretColor(Color.RED);
		txtKrishna.setBounds(769, 17, 374, 84);
		frame.getContentPane().add(txtKrishna);
		txtKrishna.setColumns(10);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("If you have any problem or query than you ");
		lblNewLabel_1_4_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_4_1.setForeground(new Color(240, 255, 255));
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lblNewLabel_1_4_1.setBounds(193, 511, 617, 41);
		frame.getContentPane().add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("also post in Contact Us page");
		lblNewLabel_1_4_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_4_2.setForeground(new Color(240, 255, 255));
		lblNewLabel_1_4_2.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lblNewLabel_1_4_2.setBounds(193, 549, 617, 41);
		frame.getContentPane().add(lblNewLabel_1_4_2);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(0, 86, 1350, 52);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2_3 = new JLabel("LOGOUT");
		lblNewLabel_2_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_2_3.setForeground(new Color(0,0,225));
				lblNewLabel_2_3.setBackground(new Color(225,225,225));
				lblNewLabel_2_3.setOpaque(true);
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel_2_3.setForeground(new Color(225,0,0));
				lblNewLabel_2_3.setOpaque(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=JOptionPane.showConfirmDialog(null,"Are you sure to Logout","Confirmmation Box",JOptionPane.YES_NO_OPTION);
				if(i==0)	{
					frame.dispose();
					new HomePage();
				
				}
				
			}
		});
		lblNewLabel_2_3.setBounds(732, 0, 221, 52);
		panel.add(lblNewLabel_2_3);
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setForeground(Color.RED);
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(1038, 0, 189, 51);
		panel.add(comboBox);
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setMaximumRowCount(15);
		comboBox.setForeground(new Color(128, 128, 0));
		comboBox.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select City", "Agra", "Bengluru", "Delhi", "Lucknow", "Mumbai"}));
		
		btnNewButton = new JButton("GO");
		btnNewButton.setBounds(1225, 0, 70, 52);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					if(comboBox.getSelectedItem().equals("Agra")) {
						frame.dispose();
						new Agra();
					}
					else if(comboBox.getSelectedItem().equals("Delhi")) {
						frame.dispose();
						new Delhi();
					}
					else if(comboBox.getSelectedItem().equals("Lucknow")) {
						frame.dispose();
						new Lucknow();
					}
					else if(comboBox.getSelectedItem().equals("Mumbai")) {
						frame.dispose();
						new Mumbai();
					}
					else if(comboBox.getSelectedItem().equals("Bengluru")) {
						frame.dispose();
						new Bengluru();
					}
					
				}
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setMnemonic(KeyEvent.VK_FIND);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 137, 1350, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("image\\lucknow\\smart-city-infographic-icons-night_107791-1540.jpg"));
		lblNewLabel_3.setBounds(0, 0, 1350, 729);
		frame.getContentPane().add(lblNewLabel_3);
		
		
	}
}
