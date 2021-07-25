package hms;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;
import project.connectionprovider;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Adr extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adr frame = new Adr();
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
	Connection con=null;
	public Adr() {
		con=connectionprovider.getCon();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 780, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Load");
		btnNewButton.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\load 50x50.png"));
		btnNewButton.setBounds(26, 488, 164, 47);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PreparedStatement pst=con.prepareStatement("select *from doctorid");
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					}
				
				catch(Exception e1){
					JOptionPane.showMessageDialog(null," Connection Error");
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 55, 735, 379);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scrollPane.setViewportView(table);
		
		JButton btnClose = new JButton("Close");
		btnClose.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\Close.png"));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClose.setBounds(535, 488, 164, 47);
		contentPane.add(btnClose);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\780X600 REC F.png"));
		lblNewLabel.setBounds(-22, 0, 806, 563);
		contentPane.add(lblNewLabel);
	}
}
