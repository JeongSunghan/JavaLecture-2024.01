package ch12_interface.sec12_bank_refactor;

public interface AccountService {
	int DELETED = 1;		// public static final 이 생략되어 있음
	
	void createAccount();	// public abstract 가 생략되어 있음
	
	void accountList();
	
	void deposit();
	
	void withdraw();
	
	void delete();
	
	Account findAccount(String ano);
	
}
