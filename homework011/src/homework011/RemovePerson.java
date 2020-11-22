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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class RemovePerson {

		int foundindex;
		boolean isfound;
		ArrayList<PersonClass>PersonList  =new ArrayList<PersonClass>();
		public JFrame frame;
		JLabel lblNewLabel_1;
		JLabel lblNewLabel_1_1;
		JLabel lblNewLabel_1_2;
		JLabel lblNewLabel_1_3;
		private JTextField textField;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						RemovePerson window = new RemovePerson();
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
		public RemovePerson() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
			frame.setBounds(100, 100, 793, 393);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Enter Email Address of Person that you want to remove");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel.setBounds(153, 33, 535, 29);
			frame.getContentPane().add(lblNewLabel);
			
			textField = new JTextField();
			textField.setBounds(294, 85, 152, 29);
			frame.getContentPane().add(textField);
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
			btnNewButton.setBounds(153, 239, 176, 38);
			frame.getContentPane().add(btnNewButton);
			
			 lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(64, 164, 110, 20);
			frame.getContentPane().add(lblNewLabel_1);
			
			 lblNewLabel_1_1 = new JLabel("");
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1_1.setBounds(223, 164, 110, 20);
			frame.getContentPane().add(lblNewLabel_1_1);
			
			 lblNewLabel_1_2 = new JLabel("");
			lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1_2.setBounds(389, 164, 110, 20);
			frame.getContentPane().add(lblNewLabel_1_2);
			
			 lblNewLabel_1_3 = new JLabel("");
			lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1_3.setBounds(569, 164, 198, 20);
			frame.getContentPane().add(lblNewLabel_1_3);
			
			JButton btnDeleteUser = new JButton("Delete  User");
			btnDeleteUser.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					if(isfound)
					{
						
					
					PersonList.remove(foundindex);
					PersonClass demo=new PersonClass();
					demo.WriteData(PersonList);
					lblNewLabel.setText("                       User Deleted Successfuly");
					lblNewLabel.setForeground(Color.GREEN);
					textField.setText("");
					lblNewLabel_1.setText("");
					lblNewLabel_1_1.setText("");
					 lblNewLabel_1_2.setText("");
					 lblNewLabel_1_3.setText("");
					}
					else
					{
						lblNewLabel.setText(" First Retrieve the User then Click on Remove Button");
						lblNewLabel.setForeground(Color.RED);
					}
				}
			});
			btnDeleteUser.setBounds(374, 239, 186, 38);
			frame.getContentPane().add(btnDeleteUser);
			
			JButton btnGoBack = new JButton("Go Back");
			btnGoBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
	Welcome_Form demo=new Welcome_Form();
					
					frame.setVisible(false);
				    
			        demo.frame.setVisible(true);
				}
			});
			btnGoBack.setBounds(286, 305, 133, 38);
			frame.getContentPane().add(btnGoBack);
		}

	}