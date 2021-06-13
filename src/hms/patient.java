package hms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class patient extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					patient frame = new patient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public patient() {
		setBounds(new Rectangle(10, 100, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1540, 830);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add New Patient Record");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new addnewpatient().setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\add new patient.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(25, 103, 334, 75);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add Diagnosis Information");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new adddiagnosisinformation().setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\add diag.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(25, 235, 334, 75);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Update Patient Record");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new updatepatient().setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\rsz_update_details.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(25, 367, 334, 75);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Full History Of The Patient");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new fullpatientinformation().setVisible(true);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\rsz_history1.png"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.setBounds(25, 499, 334, 75);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Main Menu");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				//new home().setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\exit.png"));
		btnNewButton_4.setBounds(25, 631, 334, 75);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\sharda hospital 1600X840.jpg"));
		lblNewLabel.setBounds(0, 0, 1537, 804);
		contentPane.add(lblNewLabel);
	}
}
