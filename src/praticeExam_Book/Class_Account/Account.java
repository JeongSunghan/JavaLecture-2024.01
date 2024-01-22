package praticeExam_Book.Class_Account;

public class Account {
	private int balance;
	public static final int MIN_BALANCE = 0;
	// 최소값 지정
	public static final int MAX_BALANCE = 1000000;
	// 최대값 지정

	public int getBalance() {
		// 메소드 생성
		return balance;
		// 반환이 있는 메소드(Acount에 있는 balance값)
	}

	public void setBalance(int balance) {
//		if (balance < MIN_BALANCE || balance > MAX_BALANCE)
//			;
//		// MIN = 0, MAX = 100만
//		//Acount에 있는 bal가 0보다 같거나 작으면 혹은 bal가 100만보다 크거나 같으면
//		return;
//		//반환한다
//		this.balance += balance;
//		//증감식 = this.balacne = this.balance + balance
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE)
			this.balance += balance;

	}

}
