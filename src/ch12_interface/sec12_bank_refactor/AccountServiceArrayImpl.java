package ch12_interface.sec12_bank_refactor;

import java.util.Scanner;

public class AccountServiceArrayImpl implements AccountService {
	private static Account[] accountArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);
	private static int index = 3;
	
	public AccountServiceArrayImpl() {
		accountArray[0] = new Account("1000", "제임스", 10000);
		accountArray[1] = new Account("1001", "마리", 300000);
		accountArray[2] = new Account("1002", "브라이언", 2000000);
	}
	
	@Override
	public void createAccount() {
		System.out.println("-----------");
		System.out.println(" 계좌 생성");
		System.out.println("-----------");

		String ano = "" + (1000 + index);		// index : 현재 빈 곳을 가리킴
		System.out.print("계좌주 이름> ");
		String owner = scan.nextLine();
		System.out.print("최초 입금액> ");
		int balance = Integer.parseInt(scan.nextLine());
		Account account = new Account(ano, owner, balance);
		accountArray[index++] = account;
	}

	@Override
	public void accountList() {
		System.out.println("-----------");
		System.out.println(" 계좌 목록");
		System.out.println("-----------");	
		
		for (int i = 0; i < index; i++) {
			Account acc = accountArray[i];
			if (acc.getIsDeleted() == AccountService.DELETED)
				continue;
			System.out.printf("%s %-6s\t%,10d%n", acc.getAno(), acc.getOwner(), acc.getBalance());
		}
	}

	@Override
	public void deposit() {
		System.out.println("-----------");
		System.out.println("   입금");
		System.out.println("-----------");
		
		System.out.print("계좌 번호> ");
		String ano = scan.nextLine();
		System.out.print("입금액> ");
		int balance = Integer.parseInt(scan.nextLine());
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("계좌번호를 확인하세요.");
			return;
		}
		account.setBalance(balance + account.getBalance());
		System.out.println("입금이 완료되었습니다.");
	}

	@Override
	public void withdraw() {
		System.out.println("-----------");
		System.out.println("   출금");
		System.out.println("-----------");	

		System.out.print("계좌 번호> ");
		String ano = scan.nextLine();
		System.out.print("출금액> ");
		int balance = Integer.parseInt(scan.nextLine());
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("계좌번호를 확인하세요.");
			return;
		}
		if (account.getBalance() >= balance) {
			account.setBalance(account.getBalance() - balance);
			System.out.println("출금이 완료되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}

	@Override
	public Account findAccount(String ano) {
		for (Account acc: accountArray) {
			if (acc == null)
				return null;
			if (ano.equals(acc.getAno()) && acc.getIsDeleted() != AccountService.DELETED)
				return acc;
		}
		return null;
	}

	@Override
	public void delete() {
		System.out.println("-----------");
		System.out.println("   삭제");
		System.out.println("-----------");	

		System.out.print("계좌 번호> ");
		String ano = scan.nextLine();
		Account account = findAccount(ano);
		account.setIsDeleted(AccountService.DELETED);
	}

}
