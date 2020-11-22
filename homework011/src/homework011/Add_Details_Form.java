//Name:Sayeed Abdurrehman
//Class: Object Oriented Programming
//This projects demonstrates the use of serialization to modify a menu.
package homework011;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.util.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Add_Details_Form {

		public JFrame frame;
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_3;
		private JTextField textField_4;
		private JTextField textField_5;
		private JTextField textField_6;
		private JLabel lblNewLabel_2;
		List<PersonClass> PersonList=new ArrayList<PersonClass>();
		JLabel lblNewLabel_1;
		private JButton btnNewButton_1;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Add_Details_Form window = new Add_Details_Form();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public Add_Details_Form() {
			
			initialize();
			PersonClass demo=new PersonClass();
			PersonList=demo.ReadData();
			
		    lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(28, 252, 396, 27);
			frame.getContentPane().add(lblNewLabel_1);
			
			btnNewButton_1 = new JButton("Go Back");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
						Welcome_Form demo=new Welcome_Form();
					
					frame.setVisible(false);
				    
			        demo.frame.setVisible(true);
					
				}
			});
			btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton_1.setBounds(259, 290, 98, 25);
			frame.getContentPane().add(btnNewButton_1);
			 
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 450, 376);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Enter Name");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel.setBounds(42, 78, 126, 27);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel lblEnterPhoneNumber = new JLabel("Enter Phone Number");
			lblEnterPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblEnterPhoneNumber.setBounds(41, 116, 174, 27);
			frame.getContentPane().add(lblEnterPhoneNumber);
			
			JLabel lblEnterDateOf = new JLabel("Enter Date Of Birth");
			lblEnterDateOf.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblEnterDateOf.setBounds(42, 168, 151, 27);
			frame.getContentPane().add(lblEnterDateOf);
			
			JLabel lblEnterEmail = new JLabel("Enter Email");
			lblEnterEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblEnterEmail.setBounds(42, 214, 151, 27);
			frame.getContentPane().add(lblEnterEmail);
			
			textField = new JTextField();
			textField.setBounds(225, 81, 132, 25);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(225, 119, 132, 25);
			frame.getContentPane().add(textField_1);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(225, 171, 24, 25);
			frame.getContentPane().add(textField_3);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(285, 171, 27, 25);
			frame.getContentPane().add(textField_4);
			
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(343, 171, 63, 25);
			frame.getContentPane().add(textField_5);
			
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(225, 217, 132, 25);
			frame.getContentPane().add(textField_6);
			
			JButton btnNewButton = new JButton("Add User");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					try
					{
						String name=textField.getText();
						String Phonenumber=textField_1.getText();
						String DOB=textField_3.getText()+"/"+textField_4.getText()+"/"+textField_5.getText();
						String Email=textField_6.getText();
						
						PersonClass demo=new PersonClass(name,Phonenumber,DOB,Email);
						
						
						
						PersonList.add(demo);
						PersonClass temp=new PersonClass();
						temp.WriteData(PersonList);
						
					
						
						lblNewLabel_1.setText("      The User Data has been saved Successfully ");
						lblNewLabel_1.setForeground(Color.GREEN);
			
					}
					catch(Exception ex)
					{
						lblNewLabel_1.setText("One of the Information is Incorrect. Kindly write again");
						lblNewLabel_1.setForeground(Color.RED);
				
					
					}
					finally
					{
						textField.setText("");
						textField_1.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
					}
					
				
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton.setBounds(104, 290, 114, 23);
			frame.getContentPane().add(btnNewButton);
			
		 lblNewLabel_2 = new JLabel("Enter Details Of Person");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel_2.setBounds(129, 30, 240, 26);
			frame.getContentPane().add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("DD");
			lblNewLabel_3.setBounds(259, 174, 16, 19);
			frame.getContentPane().add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("MM");
			lblNewLabel_4.setBounds(322, 176, 24, 14);
			frame.getContentPane().add(lblNewLabel_4);
			
			JLabel lblNewLabel_5 = new JLabel("YY");
			lblNewLabel_5.setBounds(411, 176, 46, 14);
			frame.getContentPane().add(lblNewLabel_5);
		}
	}