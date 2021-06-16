package hms;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.xdevapi.Statement;

import project.connectionprovider;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class find extends JFrame {

	public int flag=0;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					find frame = new find();
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
	Statement st=null;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel;
	private JLabel lblContactNo;
	private JLabel lblAge;
	private JLabel lblGender;
	private JLabel lblBloodGroup;
	private JLabel lblAddress;
	private JLabel lblAnyMajorDisease;
	private JLabel lblPatientI;
	public find() {
		con=connectionprovider.getCon();
		//st=con.createStatement();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 780, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField.setBounds(258, 22, 168, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String st="select *from patient where patientID=?";
				PreparedStatement ps=con.prepareStatement(st);
				int id=Integer.parseInt(textField.getText());
				ps.setInt(1,id);
				ResultSet rs=ps.executeQuery();
				if(rs.next())
				{
					textField_1.setText(rs.getString(2));
					textField_2.setText(rs.getString(3));
					textField_3.setText(rs.getString(4));
					textField_4.setText(rs.getString(5));
					textField_5.setText(rs.getString(6));
					textField_6.setText(rs.getString(7));
					textField_7.setText(rs.getString(8));
					
				}
		else
			JOptionPane.showMessageDialog(null, "Patient ID does not Exist");
			
	}
				
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Connection Error");
				}
				
			}
		});
		btnNewButton.setBounds(476, 22, 126, 37);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_1.setBounds(355, 93, 247, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_2.setBounds(355, 149, 247, 32);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_3.setBounds(355, 204, 247, 32);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_4.setBounds(355, 267, 247, 32);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_5.setBounds(355, 325, 247, 32);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_6.setBounds(355, 389, 247, 32);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_7.setBounds(355, 452, 247, 32);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   int  patientID=Integer.parseInt(textField.getText());
				
				String name=textField_1.getText();
				String contactnumber=textField_2.getText();
				String age=textField_3.getText();
				String gender=textField_4.getText();
				String bloodgroup=textField_5.getText();
				String address=textField_6.getText();
				String anymajordisease=textField_7.getText();
				try {
					String s1="update patient set name='"+name+"',contactno='"+contactnumber+"',age='"+age+"',gender='"+gender+"',bloodgroup='"+bloodgroup+"',address='"+address+"',anymajordisease='"+anymajordisease+"' where patientID="+patientID+" ";
					//Statement st=(Statement) con.createStatement();
					//((java.sql.Statement) st).executeUpdate("update pateint set name='"+name+"',contactno='"+contactnumber+"',age='"+age+"',gender='"+gender+"',bloodgroup='"+bloodgroup+"',address='"+address+"',anymajordisease='"+anymajordisease+"' where patientID="+patientID+" ");
					//st=(Statement) con.createStatement();
					PreparedStatement p=con.prepareStatement(s1);
					p.execute();
					JOptionPane.showMessageDialog(null, "Successfully Updated ");
					setVisible(false);
					new find().setVisible(true);
				}
				catch(Exception e2)
				{
					JOptionPane.showMessageDialog(null, "Error");
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(58, 516, 136, 37);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("CLOSE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2.setBounds(538, 516, 136, 37);
		contentPane.add(btnNewButton_2);
		
		lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(84, 93, 136, 32);
		contentPane.add(lblNewLabel);
		
		lblContactNo = new JLabel("Contact No.");
		lblContactNo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblContactNo.setBounds(84, 149, 136, 32);
		contentPane.add(lblContactNo);
		
		lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAge.setBounds(84, 204, 136, 32);
		contentPane.add(lblAge);
		
		lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblGender.setBounds(84, 267, 136, 32);
		contentPane.add(lblGender);
		
		lblBloodGroup = new JLabel("Blood Group");
		lblBloodGroup.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblBloodGroup.setBounds(84, 325, 136, 32);
		contentPane.add(lblBloodGroup);
		
		lblAddress = new JLabel("Address\r\n");
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAddress.setBounds(84, 389, 136, 32);
		contentPane.add(lblAddress);
		
		lblAnyMajorDisease = new JLabel("Any Major Disease Suffered Earlier");
		lblAnyMajorDisease.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAnyMajorDisease.setBounds(84, 452, 247, 32);
		contentPane.add(lblAnyMajorDisease);
		
		lblPatientI = new JLabel("Patient ID");
		lblPatientI.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPatientI.setBounds(84, 27, 136, 32);
		contentPane.add(lblPatientI);
	}
}
