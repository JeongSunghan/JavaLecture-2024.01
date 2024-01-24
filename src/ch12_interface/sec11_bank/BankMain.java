package ch12_interface.sec11_bank;

import java.util.Scanner;

public class BankMain {
	private static Account[] accountArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);
	private static AccountService accountService = new AccountServiceImpl();

	public static void main(String[] args) {
		boolean run = true;
		accountArray[0] = new Account("1000", "제임스", 10000);
		accountArray[1] = new Account("1001", "마리", 300000);
		accountArray[2] = new Account("1002", "브라이언", 2000000);
		while (run) {
			System.out.println("+============+============+========+=========+========+");
			System.out.println("| 1.계좌생성 | 2.계좌목록 | 3.예금 | 4. 출금 | 5.종료 |");
			System.out.println("+============+============+========+=========+========+");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
			case 1:
				accountService.createAccount(accountArray); break;
			case 2:
				accountService.accountList(accountArray); break;
			case 3:
				accountService.deposit(accountArray); break;
			case 4:
				accountService.withdraw(accountArray); break;
			case 5:
				run = false; break;
			default:
				System.out.println("Warning: 1 ~ 5 사이의 숫자만 입력하세요.");
			}
		}
		System.out.println("프로그램 종료");
	}

}
