package File_Operation;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadTextFile {
	public static void main(String args[]) throws IOException{
		File file = new File("C:\\Users\\ganuk\\eclipse-workspace\\CoreJava11Sept\\src\\File_Operation\\UserDB.txt");
		
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		
		while((line = br.readLine()) != null) {
			
			System.out.println(line);
		}
	}

}
