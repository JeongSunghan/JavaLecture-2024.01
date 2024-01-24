package ch12_interface.sec12_bank_refactor;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	private int isDeleted;
	
	public Account() { }
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public Account(String ano, String owner, int balance, int isDeleted) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.isDeleted = isDeleted;
	}

	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
}
