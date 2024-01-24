package ch14_exception;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01_Checked {

	public static void main(String[] args) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			Class cls = Class.forName("java.lang.Object");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			isr.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램의 마지막입니다.");
	}

}
