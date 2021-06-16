package hms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1540, 830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN ID");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(660, 280, 138, 71);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setBounds(658, 372, 149, 60);
		frame.getContentPane().add(lblNewLabel_1);
		
		final JTextPane id = new JTextPane();
		id.setFont(new Font("Tahoma", Font.BOLD, 18));
		id.setBounds(856, 293, 430, 47);
		frame.getContentPane().add(id);
		
		pass = new JPasswordField();
		pass.setFont(new Font("Tahoma", Font.BOLD, 16));
		pass.setBounds(856, 381, 430, 47);
		frame.getContentPane().add(pass);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\login.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("9889")&& pass.getText().equals("admin"))
				{
				home.main(null);
				//new home().setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(null, "Incorrect id or Password");
				
			}

			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(856, 467, 155, 47);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\Close.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null,"Do you really want to Close this Application ","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
					System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(1112, 467, 132, 47);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel background = new JLabel("");
		background.setBackground(new Color(51, 102, 255));
		background.setForeground(new Color(102, 153, 102));
		background.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\sharda hospital 1540X830.png"));
		background.setBounds(0, 0, 1526, 793);
		frame.getContentPane().add(background);
	}
}
