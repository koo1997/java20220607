package read;

import java.io.FileReader;
import java.io.Reader;

public class Read1 {

	public static void main(String[] args) throws Exception {
		
		
		Reader reader = new FileReader("C:\\Users\\TJ\\OneDrive\\Desktop\\test.txt");
		int readData;
		while((readData=reader.read())!=-1) {
			char charData = (char)readData; 
			System.out.println(charData);
		}
		
	}

}
