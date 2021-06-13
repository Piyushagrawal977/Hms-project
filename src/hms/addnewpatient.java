
package hms;
import project.connectionprovider;

import java.sql.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.ComponentOrientation;
import javax.swing.DefaultComboBoxModel;

public class addnewpatient extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addnewpatient frame = new addnewpatient();
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
	public addnewpatient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 780, 600);
		contentPane = new JPanel();
		contentPane.setAlignmentY(150.0f);
		contentPane.setAlignmentX(280.0f);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("CLOSE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\Close.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(487, 478, 130, 38);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(182, 41, 106, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contact No.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(182, 89, 106, 38);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Age");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(182, 137, 106, 38);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(182, 185, 106, 38);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Blood Group");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(182, 233, 106, 38);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Address");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(182, 281, 106, 38);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Any Major Disease Suffered Earlier");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(182, 335, 320, 38);
		contentPane.add(lblNewLabel_7);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		textField_1.setBounds(331, 41, 286, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		textField_2.setBounds(331, 89, 286, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 15));
		textField_3.setBounds(331, 137, 286, 31);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 15));
		textField_4.setBounds(331, 233, 286, 31);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Dialog", Font.PLAIN, 15));
		textField_5.setBounds(331, 281, 286, 31);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Dialog", Font.PLAIN, 15));
		textField_6.setBounds(182, 383, 436, 44);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Dialog", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"NONE", "MALE ", "FEMALE ", "OTHERS"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(331, 185, 286, 32);
		contentPane.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("SAVE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String patientID=textField.getText();
				String name=textField_1.getText();
				String contactNumber=textField_2.getText();
				String gender=(String)comboBox.getSelectedItem();
				String age=textField_3.getText();
				String bloodGroup=textField_4.getText();
				String address=textField_5.getText();
				String anyMajorDisease=textField_6.getText();
				try 
				{
					Connection con=connectionprovider.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select max(patientID) from patient");
					rs.next();
					int patientID=rs.getInt(1);
					patientID++;
					st.executeUpdate("insert into patient values('"+patientID+"','"+name+"','"+contactNumber+"','"+age+"','"+gender+"','"+bloodGroup+"','"+address+"','"+anyMajorDisease+"')");
					JOptionPane.showMessageDialog(null, "Successfully Updated and Your Patient ID is "+patientID);
					setVisible(false);
					new addnewpatient().setVisible(true);
					
				}
				catch(Exception f)
				{
					JOptionPane.showMessageDialog(null, "Fix enter data in correct format");
				}
				
				 
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\save-icon--1.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(182, 478, 130, 38);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\download4 780x600.jpg"));
		lblNewLabel_8.setBounds(0, 0, 766, 563);
		contentPane.add(lblNewLabel_8);
	}
}
