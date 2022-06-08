package read;

import java.io.FileReader;
import java.io.Reader;

public class Read2 {

	public static void main(String[] args) throws Exception {
		
		
		Reader reader = new FileReader("C:\\Users\\TJ\\OneDrive\\Desktop\\test.txt");
		int readData;
		
		char[]	cbuf = new char[3];
		while((readData=reader.read(cbuf))!=-1) {
			System.out.println(readData);
		}
	}

}
