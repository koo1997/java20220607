package read;

import java.io.OutputStream;

public class Sysout {

	public static void main(String[] args) throws Exception{
		
		OutputStream os = System.out;
		
		for(byte b= 48;b<100;b++) {
			os.write(b);
		}
		
		
	}

}
