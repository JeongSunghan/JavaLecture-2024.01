package ch12_interface.sec02_interface;

public class Main {

	public static void main(String[] args) {
		Audio audio = new Audio();
		audio.turnOn();
		audio.setVolume(12);
		audio.turnOff();
		
		Television tv = new Television();
		tv.turnOn();
		tv.setVolume(5);
		tv.turnOff();
		
		//다형성 방법으로 타입을 부여할 수 있음
		//장점 : 구현객체가 무엇이든지 간에 동일한 코드를 사용할 수 있음
		RemoteControllable rc = new Audio();
		rc.turnOn(); rc.setVolume(7); rc.turnOff();
		
		rc = new Television();
		rc.turnOn(); rc.setVolume(7); rc.turnOff();		
	}

}
