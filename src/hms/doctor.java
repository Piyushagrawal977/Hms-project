package hms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class doctor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					doctor frame = new doctor();
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
	public doctor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1540, 830);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add New Doctor's Record\r\n");
		btnNewButton.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\add new patient.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new addnewdoctor().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(39, 194, 352, 77);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update Doctor's Record\r\n");
		btnNewButton_1.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\rsz_update_details.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Udr().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(39, 337, 352, 77);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("All Doctor's Record");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Adr().setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\rsz_history1.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(39, 494, 352, 77);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Main Menu");
		btnNewButton_3.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\exit.png"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.setBounds(39, 637, 352, 77);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\main without bue.png"));
		lblNewLabel.setBounds(0, 0, 1526, 793);
		contentPane.add(lblNewLabel);
	}
}
