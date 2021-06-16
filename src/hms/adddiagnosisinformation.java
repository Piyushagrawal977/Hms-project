package hms;

import project.connectionprovider;
import java.sql.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

//import project.connectionprovider;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class adddiagnosisinformation extends JFrame {

	public int flag=0;
	
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adddiagnosisinformation frame = new adddiagnosisinformation();
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
	public adddiagnosisinformation() {
		
		con=connectionprovider.getCon();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 780, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		JLabel lblNewLabel = new JLabel("PatientID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(220, 45, 101, 31);
		contentPane.add(lblNewLabel);
		
		final JLabel lblNewLabel_1 = new JLabel("Patient ID doesn't Exist!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(254, 101, 257, 31);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_1.setVisible(false);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				try {
					
//					String patientID=textField_3.getText();
//					int id=Integer.parseInt(patientID);
//					Connection con=connectionprovider.getCon();
//					PreparedStatement pst=null;
//					//Statement =con.createStatement();
//					//ResultSet =st.executeQuery("select *from patient where patientID="+id+" ");
//					pst=con.prepareStatement("select *from patient where id="+id+" ");
//					//pst.setInt(1,id);
//					ResultSet rs=pst.executeQuery();
//					
//
//                      if(rs.next()==false)
//						lblNewLabel_1.setVisible(true);
//					else
//					{
//						lblNewLabel_1.setVisible(false);
//						textField_3.setEditable(false);
//						flag=1;
//						
					JOptionPane.showMessageDialog(null, "Connection done");
					}
					
				//	pst.close();
			//	}
				
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Connection Error");
				}
				
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\search.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(543, 45, 110, 31);
		contentPane.add(btnNewButton);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(23, 142, 707, 50);
		contentPane.add(table);
		 
		
		JLabel lblNewLabel_2 = new JLabel("Symptom's");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(23, 268, 101, 40);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Diagnosis");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(23, 338, 99, 40);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Medicine");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(23, 409, 110, 40);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(132, 275, 189, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(132, 345, 190, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(132, 409, 190, 32);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Ward Required?");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(429, 271, 137, 39);
		contentPane.add(lblNewLabel_5);
		
		
		
		final JLabel lblNewLabel_6 = new JLabel("Type of Ward");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(429, 335, 127, 43);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_6.setVisible(false);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"None", "General", "Duo", "Single"}));
		comboBox.setBounds(579, 335, 137, 40);
		contentPane.add(comboBox);
		
		comboBox.setVisible(false);
		
		
		
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("Yes");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected())
				{
					lblNewLabel_6.setVisible(true);
					comboBox.setVisible(true);
				}
			}
		});
		
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxNewCheckBox.setBounds(581, 272, 135, 37);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton_1 = new JButton("Save\r\n\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==1)
				{
					String patientID=textField_3.getText();
					String sympton=textField.getText();
					String diagnosis=textField.getText();
					String medicines=textField.getText();
					String wardreq;
					String typeofward;
					if( chckbxNewCheckBox.isSelected())
					{
						wardreq="YES";
						typeofward=(String)comboBox.getSelectedItem();
						
					}
					else
					{
						wardreq="NO";
						typeofward="";
						
					}
					try {
						Connection con=connectionprovider.getCon();
						Statement st=con.createStatement();
						st.executeQuery("insert into patientreport values('"+patientID+"','"+sympton+"','"+diagnosis+"','"+medicines+"','"+wardreq+"','"+typeofward+"')");
						JOptionPane.showMessageDialog(null, "Successfully Updated");
						setVisible(false);
						
					}
					catch(Exception e1)
					{
						JOptionPane.showMessageDialog(null, e);
					} 
				
				}
					else
						JOptionPane.showMessageDialog(null, "PatientID field is empty!");
					
				
			}
		});
		
		btnNewButton_1.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\save-icon--1.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(76, 500, 143, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Close\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		
		btnNewButton_2.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\HMS ICON\\Close.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(518, 500, 135, 40);
		contentPane.add(btnNewButton_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_3.setBounds(331, 45, 137, 27);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("D:\\piyush\\CSE\\image\\download4 780x600.jpg"));
		lblNewLabel_7.setBounds(0, 0, 766, 563);
		contentPane.add(lblNewLabel_7);
	}

	
	
	
}
