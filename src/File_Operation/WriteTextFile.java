package File_Operation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
	public static void main(String args[]) throws IOException {
		File file = new File("C:\\Users\\ganuk\\eclipse-workspace\\CoreJava11Sept\\src\\File_Operation\\UserDB.txt");
		
		FileWriter fw = new FileWriter(file,true);//pass true for append mode
		
		BufferedWriter br = new BufferedWriter(fw);
		
		String ContentTowrite = "I  am a boss here";
		
		br.write(ContentTowrite);
		
		br.close();//save
		fw.close();
		file = null;
		
		
	}
}
