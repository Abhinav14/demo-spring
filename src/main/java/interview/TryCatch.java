package interview;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TryCatch {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("File_Path"))){
			String line;
			while((line = br.readLine())!= null){
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
