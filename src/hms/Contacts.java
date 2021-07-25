package hms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Contacts extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contacts frame = new Contacts();
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
	public Contacts() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 780, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\Close.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(558, 489, 155, 48);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\phone-not-being-used.png"));
		lblNewLabel_3.setBounds(485, 320, 228, 134);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Helpline No.                 0120-2323625\r\n\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(48, 102, 644, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmeregencyNo = new JLabel("\r\nEmeregency No.        +91-120-2333999, +91-9803742732\r\n\r\n\r\n");
		lblEmeregencyNo.setForeground(Color.WHITE);
		lblEmeregencyNo.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEmeregencyNo.setBounds(48, 160, 644, 48);
		contentPane.add(lblEmeregencyNo);
		
		JLabel lblHelplineNo = new JLabel("Helpline No.                 0120-2323625\r\n\r\n");
		lblHelplineNo.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblHelplineNo.setBounds(48, 218, 644, 48);
		contentPane.add(lblHelplineNo);
		
		JLabel lblNewLabel_1 = new JLabel("Covid Help Line              18004192211");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(48, 276, 644, 48);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblChildHelpline = new JLabel("Child Helpline                 1098");
		lblChildHelpline.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblChildHelpline.setBounds(48, 344, 644, 48);
		contentPane.add(lblChildHelpline);
		
		JLabel lblWomenHelpline = new JLabel("Women Helpline            1091");
		lblWomenHelpline.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblWomenHelpline.setBounds(48, 402, 644, 48);
		contentPane.add(lblWomenHelpline);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\780X600 REC F.png"));
		lblNewLabel_2.setBounds(-39, 0, 822, 575);
		contentPane.add(lblNewLabel_2);
	}

}
