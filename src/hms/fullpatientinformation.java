package hms;

import java.awt.BorderLayout;
import project.connectionprovider;
import java.sql.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import net.proteanit.sql.DbUtils;
import project.connectionprovider;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.Connection;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JLabel;

public class fullpatientinformation extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fullpatientinformation frame = new fullpatientinformation();
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
	public fullpatientinformation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 780, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				try {
					Connection con=connectionprovider.getCon();
					java.sql.Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select *from patient inner join patientreport where patient.patientID");
					table.setAutoResizeMode(table.AUTO_RESIZE_OFF);
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Connection Error");
				}
			}
		});
		table.setFont(new Font("Tahoma", Font.BOLD, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		table.setBounds(10, 24, 746, 457);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\Close.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(596, 517, 127, 36);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\download4 780x600.jpg"));
		lblNewLabel.setBounds(0, 0, 766, 563);
		contentPane.add(lblNewLabel);
	}
}
