package hms;

import project.connectionprovider;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class updatepatient extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updatepatient frame = new updatepatient();
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
	public updatepatient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400,150, 780, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setBounds(182, 78, 106, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contact No.");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_2.setBounds(182, 126, 106, 38);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Age");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_3.setBounds(182, 176, 106, 38);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4.setBounds(182, 237, 106, 38);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Blood Group");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_5.setBounds(182, 297, 106, 38);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Address");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_6.setBounds(182, 358, 106, 38);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Any Major Disease Suffered Earlier");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_7.setBounds(182, 406, 320, 38);
		contentPane.add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Dialog", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"NONE", "MALE ", "FEMALE ", "OTHERS"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(340, 240, 286, 32);
		contentPane.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(340, 78, 286, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(340, 132, 286, 32);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(340, 181, 286, 34);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(340, 296, 286, 32);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(340, 357, 286, 32);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(182, 454, 444, 31);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Patient ID");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(182, 41, 106, 27);
		contentPane.add(lblNewLabel);
		
		textField_7 = new JTextField();
		textField_7.setBounds(341, 34, 130, 32);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("Search\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(textField_7.getText());
				try
				{
					Connection con=connectionprovider.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select *from patient where patientID="+id+" ");
					if(rs.next())
							{
								textField.setText(rs.getString(2));
								textField_1.setText(rs.getString(3));
								textField_2.setText(rs.getString(4));
								textField_3.setText(rs.getString(5));
								textField_4.setText(rs.getString(6));
								textField_5.setText(rs.getString(7));
								textField_6.setText(rs.getString(8));
								
							}
					else
						JOptionPane.showMessageDialog(null, "Patient ID does not Exist");
						
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Connection Error");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(506, 34, 120, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(49, 515, 154, 38);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Close");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_2.setBounds(570, 515, 144, 38);
		contentPane.add(btnNewButton_2);
		
	}
}
