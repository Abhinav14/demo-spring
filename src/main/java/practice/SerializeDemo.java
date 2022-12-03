package practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Abhinav";
		e.address = "Electronic City, Bangalore";
		e.SSN = 123456789;
		e.number = 101;
		
		try{
			FileOutputStream fout = new FileOutputStream("C:\\Abhinav\\TP_Images\\emp.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(e);
			out.close();
			fout.close();
			System.out.println("Serialized data is saved in the file emp.txt");
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
}
