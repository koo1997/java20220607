package read;

public class Sis {

	public static void main(String[] args) throws Exception {
		byte[] byteData = new byte[15];	
		int a=System.in.read(byteData);
		System.out.println(a-2);
		System.out.println(byteData);
		
		
	}

}
