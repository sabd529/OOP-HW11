//Name:Sayeed Abdurrehman
//Class: Object Oriented Programming
//This projects demonstrates the use of serialization to modify a menu.
package homework011;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Welcome_Form {
	
		public JFrame frame;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Welcome_Form window = new Welcome_Form();
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
		public Welcome_Form() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 450, 558);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JButton btnNewButton = new JButton("Add New Profile");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					Add_Details_Form demo=new Add_Details_Form();
					
					frame.setVisible(false);
				    
			        demo.frame.setVisible(true);
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton.setBounds(81, 76, 267, 41);
			frame.getContentPane().add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("Print All Profiles");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					
					PrintData demo=	new PrintData();
					
					frame.setVisible(false);
				    
			        demo.frame.setVisible(true);
			        
			        
				}
			});
			btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton_1.setBounds(81, 180, 267, 41);
			frame.getContentPane().add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("Modify Profile");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
	ModifyUser demo=new ModifyUser();
					
					frame.setVisible(false);
				    
			        demo.frame_1.setVisible(true);
				}
			});
			btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton_2.setBounds(81, 281, 267, 41);
			frame.getContentPane().add(btnNewButton_2);
			
			JButton btnNewButton_3 = new JButton("Delete Profile");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
	RemovePerson demo=new RemovePerson();
					
					frame.setVisible(false);
				    
			        demo.frame.setVisible(true);
				}
			});
			btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton_3.setBounds(81, 381, 267, 41);
			frame.getContentPane().add(btnNewButton_3);
			
			JLabel lblNewLabel = new JLabel("WELCOME");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
			lblNewLabel.setBounds(148, 23, 162, 20);
			frame.getContentPane().add(lblNewLabel);
			
			JButton btnNewButton_4 = new JButton("Exit Button");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
	frame.setVisible(false);
				}
			});
			btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton_4.setBounds(81, 467, 267, 41);
			frame.getContentPane().add(btnNewButton_4);
		}

	}