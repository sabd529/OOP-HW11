
//Name:Sayeed Abdurrehman
//Class: Object Oriented Programming
//This projects demonstrates the use of serialization to modify a menu.package homework011;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

	public class ModifyUser {
		int foundindex;
		boolean isfound;
		ArrayList<PersonClass>PersonList  =new ArrayList<PersonClass>();
		public JFrame frame;
		public JFrame frame_1;
		JLabel lblNewLabel_1;
		JLabel lblNewLabel_1_1;
		JLabel lblNewLabel_1_2;
		JLabel lblNewLabel_1_3;
		private JTextField textField;
		private JLabel lblNewLabel_2;
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
						ModifyUser window = new ModifyUser();
						window.frame_1.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public ModifyUser() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 450, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame_1 = new JFrame();
			frame_1.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
			frame_1.setBounds(100, 100, 793, 491);
			frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame_1.getContentPane().setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Enter Email Address of Person that you want to modify");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel.setBounds(153, 33, 535, 29);
			frame_1.getContentPane().add(lblNewLabel);
			
			textField = new JTextField();
			textField.setBounds(294, 85, 152, 29);
			frame_1.getContentPane().add(textField);
			textField.setColumns(10);
			
			JButton btnNewButton = new JButton("Retrieve Information");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					
					
					
					
					
					 isfound=false;
					  foundindex=-1;
					String Email=textField.getText();
					PersonClass demo=new PersonClass();
					PersonList=demo.ReadData();
					
					for(int x=0;x<PersonList.size();x++)
					{
						if(PersonList.get(x).EmailAddress().equals(Email))
						{
							isfound=true;
							foundindex=x;
							
						}
					}
					textField.setText("");
					if(isfound)
					{ 
						lblNewLabel.setText("                          User Found");
						lblNewLabel.setForeground(Color.GREEN);
						
						
						lblNewLabel_1.setText(PersonList.get(foundindex).GetName());
						lblNewLabel_1_1.setText(PersonList.get(foundindex).GetNumber());
						 lblNewLabel_1_2.setText(PersonList.get(foundindex).DOB());
						 lblNewLabel_1_3.setText(PersonList.get(foundindex).EmailAddress());
						
						
						
						
						
						
					}
					else
					{
						lblNewLabel.setText("                    User Not Found Try Again ");
						lblNewLabel.setForeground(Color.RED);
						textField.setText("");
					}
					
				}
					
					
					
					
					
					
					
					
					
					
			});
			btnNewButton.setBounds(153, 343, 176, 38);
			frame_1.getContentPane().add(btnNewButton);
			
			 lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(31, 164, 152, 20);
			frame_1.getContentPane().add(lblNewLabel_1);
			
			 lblNewLabel_1_1 = new JLabel("");
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1_1.setBounds(223, 164, 110, 20);
			frame_1.getContentPane().add(lblNewLabel_1_1);
			
			 lblNewLabel_1_2 = new JLabel("");
			lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1_2.setBounds(389, 164, 110, 20);
			frame_1.getContentPane().add(lblNewLabel_1_2);
			
			 lblNewLabel_1_3 = new JLabel("");
			lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1_3.setBounds(569, 164, 198, 20);
			frame_1.getContentPane().add(lblNewLabel_1_3);
			
			JButton btnDeleteUser = new JButton("Modify User");
			btnDeleteUser.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					
					
					if(isfound)
					{
						String n=textField_1.getText();
						String number=textField_2.getText();
						String DOB=textField_3.getText()+"/"+textField_4.getText()+"/"+textField_5.getText();
						String Email=textField_6.getText();
						if(!n.equals(""))
						{
							PersonList.get(foundindex).SetName(n);
						}
						if(!number.equals(""))
						{
							PersonList.get(foundindex).SetNumber(number);
						}
						if(!DOB.equals("//"))
						{
							PersonList.get(foundindex).SetDOB(DOB);
						}
						if(!Email.equals(""))
						{
							PersonList.get(foundindex).SetEmail(Email);
						}
						
						PersonClass demo=new PersonClass();
						demo.WriteData(PersonList);
						lblNewLabel.setText("       	          User Data Modified Sucessfuly");
						lblNewLabel.setForeground(Color.GREEN);
						
						lblNewLabel_1.setText("");
						lblNewLabel_1_1.setText("");
						 lblNewLabel_1_2.setText("");
						 lblNewLabel_1_3.setText("");
					}
					else
					{
						lblNewLabel.setText(" First Retrieve the User then Click on Modify Button");
						lblNewLabel.setForeground(Color.RED);
					}
					
					
					
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					
					
					
					
					
					
					
					
					
				}
			});
			btnDeleteUser.setBounds(377, 343, 186, 38);
			frame_1.getContentPane().add(btnDeleteUser);
			
			JButton btnGoBack = new JButton("Go Back");
			btnGoBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
	Welcome_Form demo=new Welcome_Form();
					
					frame_1.setVisible(false);
				    
			        demo.frame.setVisible(true);
				}
			});
			btnGoBack.setBounds(294, 403, 133, 38);
			frame_1.getContentPane().add(btnGoBack);
			
			lblNewLabel_2 = new JLabel("After Retrieval,Type the new value in fields that you want to modify and keep rest of the fields empty");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_2.setBounds(81, 228, 633, 29);
			frame_1.getContentPane().add(lblNewLabel_2);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(31, 283, 152, 29);
			frame_1.getContentPane().add(textField_1);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(209, 283, 152, 29);
			frame_1.getContentPane().add(textField_2);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(389, 283, 38, 29);
			frame_1.getContentPane().add(textField_3);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(456, 283, 38, 29);
			frame_1.getContentPane().add(textField_4);
			
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(525, 283, 38, 29);
			frame_1.getContentPane().add(textField_5);
			
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(591, 283, 152, 29);
			frame_1.getContentPane().add(textField_6);
		}

	}