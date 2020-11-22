//Name:Sayeed Abdurrehman
//Class: Object Oriented Programming
//This projects demonstrates the use of serialization to modify a menu.
package homework011;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
	
	public class PersonClass implements java.io.Serializable {
		
		private String name;
		private String Phone_Number;
		private String Date_Of_Birth;
		private String Email_Address;
		
		PersonClass (String n,String P,String D,String E)
		{
			name=n;
			Phone_Number=P;
			Date_Of_Birth=D;
			Email_Address=E;
		}
		PersonClass()
		{
			
		}
		public void WriteData(java.util.List<PersonClass> personList)
		{
			try {
			      FileOutputStream fileOut = new FileOutputStream("PersonData.txt");
			      ObjectOutputStream out = new ObjectOutputStream(fileOut);
			      
			      for(int x=0;x<personList.size();x++)
			    	  out.writeObject(personList.get(x));
			      out.close();
			      fileOut.close();
			    } catch (IOException i) {
			      i.printStackTrace();
			    }
		}
		public ArrayList<PersonClass> ReadData()
		{
			ArrayList<PersonClass>PersonList  =new ArrayList<PersonClass>();
			try
			{
				
			FileInputStream fis = new FileInputStream("PersonData.txt");
			ObjectInputStream in = new ObjectInputStream(fis);

			PersonClass obj1=(PersonClass) in.readObject();
			while(obj1!=null)
			{
				PersonList.add(obj1);

				 obj1=(PersonClass) in.readObject();
		
			}
			 fis.close();
				in.close();
			}
			catch (Exception ex)
				{
						System.out.println("All Data Read");
				}
			return PersonList;
			
		}
		String GetName()
		{
			return name;
		}
		public String  GetNumber()
		{
			return Phone_Number;
		}
		public String DOB()
		{
			return Date_Of_Birth;
		}
		
		public String EmailAddress()
		{
			return Email_Address;
		}
		
		
		public void SetName(String s)
		{
			name=s;
		}
		public void SetNumber(String n)
		
		{
			Phone_Number=n;
		}
		
		public void SetDOB(String d)
		{
			Date_Of_Birth=d;		
		}
		public void SetEmail(String E)
		{
			Email_Address=E;
		}
		
		
	}