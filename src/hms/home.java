package hms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Component;

public class home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home window = new home();
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
	public home() {
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
		
		JButton btnNewButton = new JButton("PATIENT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new patient().setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\patient (50,50).png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton.setBounds(21, 162, 267, 56);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DOCTOR");
		btnNewButton_1.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\doctor 50x50.jpg"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new doctor().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(21, 297, 267, 56);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("HOSPITAL");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new info().setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\rsz_hospital_information.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_2.setBounds(21, 422, 267, 56);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("LOGOUT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Do you really want to log out","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					
					frame.setVisible(false);
				}
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\exit.png"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_3.setBounds(21, 551, 267, 56);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\main without bue.png"));
		lblNewLabel.setBounds(0, 0, 1526, 783);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(467, 594, 45, 13);
		frame.getContentPane().add(label);
	}

}
