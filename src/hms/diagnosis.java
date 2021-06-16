package hms;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.xdevapi.Statement;

import net.proteanit.sql.DbUtils;
import project.connectionprovider;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

public class diagnosis extends JFrame {

	public int flag=0;
	public int k=0;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					diagnosis frame = new diagnosis();
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
	private JTable table;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	//private JLabel lblNewLabel_5;
	private JButton btnNewButton_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	//private JComboBox comboBox ;
	public diagnosis() {
		
		//lblNewLabel_5.setVisible(false);
		//comboBox.setVisible(false);
		
		con=connectionprovider.getCon();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 780, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Patient ID Doesn't Exist");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(231, 88, 240, 32);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField.setBounds(231, 24, 192, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel_5 = new JLabel("Type of Ward");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(441, 312, 117, 32);
		contentPane.add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"None", "General", "Single", "Duo"}));
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 16));
		comboBox.setBounds(591, 312, 148, 32);
		contentPane.add(comboBox);
		
		lblNewLabel.setVisible(false);
		lblNewLabel_5.setVisible(false);
		comboBox.setVisible(false);
		
		
		JButton btnNewButton = new JButton("search");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					String st="select *from patient where patientID=?";
					PreparedStatement ps=con.prepareStatement(st);
					int id=Integer.parseInt(textField.getText());
					ps.setInt(1,id);
					ResultSet rs=ps.executeQuery();
					java.sql.Statement s= con.createStatement(  rs.TYPE_SCROLL_SENSITIVE,rs.CONCUR_UPDATABLE);
				
					if(rs.next()==false)
					{
						lblNewLabel.setVisible(true);
						
					}
					else
					{ 
						
						lblNewLabel.setVisible(false);
					    flag=1;
					    k=1;
					}
					
					if(flag==1)
					{
						ResultSet rs1=ps.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(rs1));
					}
					
//					JOptionPane.showMessageDialog(null,"Conenction Done");
//					setVisible(false);
					//new diagnosis.setVisible(true);
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Connection Error");
				}
			}
		});
		btnNewButton.setBounds(476, 24, 169, 39);
		contentPane.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 127, 746, 39);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.BOLD, 16));
		scrollPane.setViewportView(table);
		
		lblNewLabel_1 = new JLabel("Symptom's");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(24, 226, 141, 32);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Diagnosis");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(24, 312, 141, 32);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Medicines\r\n");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(24, 405, 141, 32);
		contentPane.add(lblNewLabel_3);
		
		
	
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_1.setBounds(174, 227, 186, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_2.setBounds(175, 313, 185, 32);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_3.setBounds(175, 399, 185, 32);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Ward Required\r\n");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(441, 223, 141, 39);
		contentPane.add(lblNewLabel_4);
		
		
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Yes\r\n");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected())
				{
					lblNewLabel_5.setVisible(true);
					comboBox.setVisible(true);
					
				}
				else 
				{
					lblNewLabel_5.setVisible(false);
					comboBox.setVisible(false);
				}
			}
		});
		
	    JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(k==1)
			{
				int id=Integer.parseInt(textField.getText());
				String symptom=textField_1.getText();
				String diagnosis=textField_2.getText();
				String medicine=textField_3.getText();
				String wardreq;
				String typeward;
				if(chckbxNewCheckBox.isSelected())
				{
					wardreq="YES";
					typeward=(String)comboBox.getSelectedItem();
				}
				else
				{
					wardreq="NO";
					typeward=" ";
				}
				try {
					java.sql.Statement st=con.createStatement();
					st.executeUpdate("insert into patientreport values('"+id+"','"+symptom+"','"+diagnosis+"','"+medicine+"','"+wardreq+"','"+typeward+"') ");
					JOptionPane.showMessageDialog(null,"Sucessfully filled");
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Connection Error");
				}
			}
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(10, 514, 132, 39);
		contentPane.add(btnNewButton_1);
		
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxNewCheckBox.setBounds(608, 223, 117, 39);
		contentPane.add(chckbxNewCheckBox);
		
		
		
		
		
		JButton btnNewButton_2 = new JButton("Close");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2.setBounds(619, 514, 123, 39);
		contentPane.add(btnNewButton_2);
		
	
	}
}
