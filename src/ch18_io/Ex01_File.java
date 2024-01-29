package ch18_io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Ex01_File {
	public static void main(String[] args) throws IOException {
		File file = new File ("c:/Temp/README.txt");	//file
		File dir = new File ("c:/Temp/test");		//directory
		
		if (!dir.exists())		//디렉토리가 없으면
			dir.mkdir();		//디렉토리 생성
		
		if 	(!file.exists())		//파일이 없으면
			file.createNewFile();	//파일 생성
		
		
		//cmd 창에서 dir \temp 한 결과
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles();
		for (File content: contents)
			System.out.println(content);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd aa HH:mm");
		for (File f: contents) {
			System.out.printf("%-24s" ,sdf.format(f.lastModified()));
			if (f.isDirectory())
				System.out.printf("%-14s %-20s%n", "<DIR>", f.getName());
			else
				System.out.printf("%,14d %-20s%n", f.length(), f.getName());
		}
	}

}
