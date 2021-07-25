package hms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JLabel;

public class info extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					info frame = new info();
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
	public info() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 780, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Contact");
		btnNewButton.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\phone 50x50.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Contacts().setVisible(true);
			}
		});
		btnNewButton.setBounds(32, 26, 182, 53);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Photos\r\n");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\hospital\\images 50x50.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new image1().setVisible(true);
			
			}
		});
		btnNewButton_1.setBounds(284, 26, 190, 53);
		contentPane.add(btnNewButton_1);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\about 50x50.png"));
		btnAbout.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new hospital().setVisible(true);
			}
		});
		btnAbout.setBounds(544, 26, 182, 53);
		contentPane.add(btnAbout);
		
		JButton btnNewButton_2 = new JButton("Close");
		btnNewButton_2.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\Close.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_2.setBounds(573, 120, 126, 33);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\780X600 REC F.png"));
		lblNewLabel.setBounds(-23, 3, 800, 170);
		contentPane.add(lblNewLabel);
	}
}
