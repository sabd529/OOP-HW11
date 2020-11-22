//Name:Sayeed Abdurrehman
//Class: Object Oriented Programming
//This projects demonstrates the use of serialization to modify a menu.
package homework011;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrintData {
		
		ArrayList<PersonClass>PersonList  =new ArrayList<PersonClass>();
		
		public JFrame frame;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PrintData window = new PrintData();
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
		public PrintData() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 703, 424);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JEditorPane editorPane = new JEditorPane();
			editorPane.setBounds(10, 89, 140, 217);
			frame.getContentPane().add(editorPane);
			
			JEditorPane editorPane_1 = new JEditorPane();
			editorPane_1.setBounds(168, 89, 140, 217);
			frame.getContentPane().add(editorPane_1);
			
			JEditorPane editorPane_2 = new JEditorPane();
			editorPane_2.setBounds(334, 89, 150, 217);
			frame.getContentPane().add(editorPane_2);
			
			JEditorPane editorPane_3 = new JEditorPane();
			editorPane_3.setBounds(512, 89, 165, 217);
			frame.getContentPane().add(editorPane_3);
			
			JLabel lblNewLabel = new JLabel("Name");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel.setBounds(45, 37, 105, 25);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel lblPhoneNumber = new JLabel("Phone Number");
			lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblPhoneNumber.setBounds(168, 37, 150, 25);
			frame.getContentPane().add(lblPhoneNumber);
			
			JLabel lblDateOfBirth = new JLabel("Date Of Birth");
			lblDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblDateOfBirth.setBounds(344, 37, 140, 25);
			frame.getContentPane().add(lblDateOfBirth);
			
			JLabel lblEmailAddress = new JLabel("Email Address");
			lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblEmailAddress.setBounds(512, 37, 140, 25);
			frame.getContentPane().add(lblEmailAddress);
			
			JButton btnNewButton = new JButton("Return To Main Menu");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					Welcome_Form demo=new Welcome_Form();
					
					frame.setVisible(false);
				    
			        demo.frame.setVisible(true);
					
					
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton.setBounds(224, 340, 250, 34);
			frame.getContentPane().add(btnNewButton);
			
			
			
			
			PersonClass demo=new PersonClass();
			
			PersonList=demo.ReadData();
			
			for(int x=0;x<PersonList.size();x++)
			{
				PersonClass temp=PersonList.get(x);
				System.out.println("Name :"+temp.GetName());
				editorPane.setText(	editorPane.getText()+temp.GetName()+"\n");
				editorPane_1.setText(	editorPane_1.getText()+temp.GetNumber()+"\n");
				editorPane_2.setText(	editorPane_2.getText()+temp.DOB()+"\n");
				
				editorPane_3.setText(	editorPane_3.getText()+temp.EmailAddress()+"\n");
			}
			
			
		}
		
		
		
		
	}