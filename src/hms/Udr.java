package hms;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import project.connectionprovider;
import javax.swing.ImageIcon;

public class Udr extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Udr frame = new Udr();
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
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel;
	private JLabel lblContactNo;
	private JLabel lblAge;
	private JLabel lblGender;
	private JLabel lblBloodGroup;
	private JLabel lblAddress;
	private JLabel lblPatientI;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	public Udr() {
		con=connectionprovider.getCon();
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
		btnNewButton.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\search.png"));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String st="select *from doctorid where doctorid=?";
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
		textField_1.setBounds(362, 93, 240, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_2.setBounds(362, 149, 240, 32);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_3.setBounds(362, 204, 240, 32);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_4.setBounds(362, 270, 240, 37);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_5.setBounds(362, 344, 240, 32);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_6.setBounds(362, 418, 240, 32);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\save-icon--1.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   int  doctorid=Integer.parseInt(textField.getText());
				
				String name=textField_1.getText();
				String contactnumber=textField_2.getText();
				String age=textField_3.getText();
				String degree=textField_4.getText();
				String specialization=textField_5.getText();
				String experience=textField_6.getText();
				//String anymajordisease=textField_7.getText();
				try {
					String s1="update doctorid set name='"+name+"',contactnumber='"+contactnumber+"',age='"+age+"',degree='"+degree+"',specialization='"+specialization+"',experience='"+experience+"' where doctorid="+doctorid+" ";
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
		btnNewButton_2.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\Close.png"));
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
		lblAge.setBounds(84, 204, 158, 48);
		contentPane.add(lblAge);
		
		lblGender = new JLabel("Degree");
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblGender.setBounds(84, 267, 158, 48);
		contentPane.add(lblGender);
		
		lblBloodGroup = new JLabel("Specialization");
		lblBloodGroup.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblBloodGroup.setBounds(84, 341, 158, 48);
		contentPane.add(lblBloodGroup);
		
		lblAddress = new JLabel("Experience");
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAddress.setBounds(84, 410, 158, 48);
		contentPane.add(lblAddress);
		
		lblPatientI = new JLabel("Doctor ID");
		lblPatientI.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPatientI.setBounds(84, 16, 158, 48);
		contentPane.add(lblPatientI);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\780X600 REC F.png"));
		lblNewLabel_1.setBounds(-30, 0, 796, 563);
		contentPane.add(lblNewLabel_1);
	}

}
