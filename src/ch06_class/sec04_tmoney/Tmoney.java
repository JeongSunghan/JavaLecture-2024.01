package ch06_class.sec04_tmoney;

public class Tmoney {
	private int age;
	private int cash;
	
	
	//상수 잡아주기
	public static final int CHILD_FARE = 730;
	public static final int YOUTH_FARE = 1010;
	public static final int ADULT_FARE = 1450;
	
	public Tmoney() { }
	
	public Tmoney(int age, int cash) {
		super();
		this.age = age;
		this.cash = cash;
	}
	
	public int getCash() {
		return cash;
	}
	
	public void charge (int cash) {
		this.cash += cash;
	}
	public boolean ride() {
		if (age >= 7 && age <=12) {
			if (cash >= CHILD_FARE) {
				cash -= CHILD_FARE;	return true;
			}
			return false;
		}else if (age >= 13 && age <= 18) {
			if (cash >= YOUTH_FARE) {
				cash -= YOUTH_FARE; return true;
			}
			return false;
		}else if(age >= 19) {
			if (cash >= ADULT_FARE) {
				cash -= ADULT_FARE; return true;
			}
			return false;
			
		}
		return true;
	}

	@Override
	public String toString() {
		return "Tmoney [age=" + age + ", cash=" + cash + "]";
	}
	
	
}

