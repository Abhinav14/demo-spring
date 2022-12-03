package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) {
		Employee e = null;
		FileInputStream fin;
		try {
			fin = new FileInputStream("C:\\Abhinav\\TP_Images\\emp.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			e = (Employee)in.readObject();
		} catch (FileNotFoundException fnf) {
			// TODO Auto-generated catch block
			fnf.printStackTrace();
		} catch (IOException io) {
			// TODO Auto-generated catch block
			io.printStackTrace();
		} catch (ClassNotFoundException cnf) {
			// TODO Auto-generated catch block
			cnf.printStackTrace();
			return;
		}
		
		System.out.println("Deserialized Employee...");
		System.out.println("Name: "+e.name);
		System.out.println("Address: "+e.address);
		System.out.println("SSN: "+e.SSN);
		System.out.println("Number: "+e.number);
	}

}
