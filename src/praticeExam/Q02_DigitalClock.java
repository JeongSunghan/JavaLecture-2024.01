package praticeExam;

public class Q02_DigitalClock {
	public static void main(String[] args) {
		int duration = 0;
		for (int hour = 0; hour <= 23; hour++) {
			for(int minute = 0; minute <= 59; minute++) {
				String timeStr = hour + ":" + minute;
				if(timeStr.indexOf("3") >= 0)
					duration += 60;
			}
			System.out.println(duration);
		}
	}

}
