package ch12_interface.sec02_interface;

public class Audio implements RemoteControllable {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControllable.MAX_VOLUME)
			this.volume = RemoteControllable.MAX_VOLUME;
		else if (volume < RemoteControllable.MIN_VAOLUME)
			this.volume = RemoteControllable.MIN_VAOLUME;
		else
			this.volume = volume;
		
		System.out.println("현재 오디오 볼륨: " + this.volume);
			
	}
	
}
