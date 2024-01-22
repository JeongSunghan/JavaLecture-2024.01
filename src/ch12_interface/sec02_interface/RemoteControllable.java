package ch12_interface.sec02_interface;

public interface RemoteControllable {
	//상수
	public static final int MIN_VAOLUME = 0;
	int MAX_VOLUME = 10;			//public static final 생략해도 무방
	
	
	//추상 메소드
	public abstract void turnOn();
	public abstract void turnOff();
	void setVolume(int volume);			//public abstract 생략해도 무방

	
}
