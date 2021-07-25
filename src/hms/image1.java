package hms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class image1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					image1 frame = new image1();
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
	public image1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 780, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
			
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\Close.png"));
		btnNewButton_1.setBounds(556, 523, 119, 30);
		contentPane.add(btnNewButton_1);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\hospital\\GsBMpQpS_303x237.jpg"));
		lblNewLabel.setBounds(59, 10, 303, 237);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\620X256.png"));
		lblNewLabel_1.setBounds(59, 257, 620, 256);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\303X237.png"));
		lblNewLabel_2.setBounds(372, 10, 303, 237);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\right arrow2 70x70.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new image2().setVisible(true);
			}
		});
		btnNewButton.setBounds(702, 202, 43, 130);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\780X600 REC F.png"));
		lblNewLabel_3.setBounds(-32, 0, 798, 578);
		contentPane.add(lblNewLabel_3);
	
		
		
	}
}
