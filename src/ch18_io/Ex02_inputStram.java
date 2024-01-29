package ch18_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Ex02_inputStram {

	public static void main(String[] args) throws Exception {
		InputStream is =new FileInputStream("c:/Temp/README.txt");
//		is = new FileInputStream(new File("c:/Temp/README.txt"));
		
		//읽는 방법1
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			System.out.println((char)data);			
		}
		is = new FileInputStream(new File("c:/Temp/README.txt"));
		byte[] arr = new byte[512];
		while (true) {
			int num = is.read(arr);
			System.out.println("읽은 바이트 수: " + num);
			if (num == -1)
				break;
			
		}
		System.out.println(new String(arr));
		is.close();
	}

}
