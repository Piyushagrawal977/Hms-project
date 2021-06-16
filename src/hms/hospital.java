package hms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hospital extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hospital frame = new hospital();
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
	public hospital() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 780, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\hospital-management-software1s594x320.jpg"));
		lblNewLabel.setBounds(35, 24, 682, 320);
		contentPane.add(lblNewLabel);

		JTextPane txtpnThisProjectJust = new JTextPane();
		txtpnThisProjectJust.setBackground(Color.WHITE);
		txtpnThisProjectJust.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnThisProjectJust.setText(
				"This project just gives a simple idea how a record of various doctors and patients can be kept in hospital. With better knowledge of java, mysql and the use of more functions, the program can be made more user friendly and practically applicable. In present form this project just gives a reflection of how management may be done in organization such as hospital with the help of simple functions for adding, diagnosing ,updating the records and many more.\r\n\r\n");
		txtpnThisProjectJust.setBounds(35, 371, 682, 138);
		contentPane.add(txtpnThisProjectJust);

		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\Close.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(577, 519, 140, 32);
		contentPane.add(btnNewButton);
	}
}
