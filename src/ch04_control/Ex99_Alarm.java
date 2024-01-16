package ch04_control;

public class Ex99_Alarm {

	public static void main(String[] args) {
		int h = (int) Math.ceil(Math.random()*24 - 1);
		int m = (int) Math.ceil(Math.random()*60 - 1);
		
		if (m < 45) {
			m = 60-45+m;
			h--;
		}else 
			m-=45;
		if(h==-1)
			h = 23;
		System.out.println("현재 알람시간은: " + h +"시" + m +"분 입니다.");
	}
}