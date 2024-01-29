package ch18_io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex03_OutputStream {
	public static void main(String[] args) {
		try {
		OutputStream os = new FileOutputStream("c:/Temp/output.txt");
		byte a = 0x41;		//"A" = 0X41
		char b = 'B';
		int c = 0x43;	
		os.write(a); os.write(b); os.write(c);
		
		byte[] arr = {97, 98, 99, 100, 101};
		os.write(arr);
		
		os.flush();
		os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
