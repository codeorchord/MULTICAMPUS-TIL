package lab.java.core;

public class Account {
	private String custId;
	private String custName;
	private String accountNumber;
	private int balance;
	
	public Account() {}
	public Account(String custId, String custName, String accountNumber, int balance) {
		this.custId = custId;
		this.custName = custName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
		if(balance <= 0) {
			System.out.printf("잔액 오류입니다 : %d원\n", balance);
			System.exit(0);
		}
	}
	
	public String getCustId() {
		return custId;
	}
	
	public void setCustId(String custId) {
		this.custId = custId;
	}
	
	public String getCustName() {
		return custName;
	}
	
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void addBalance(int amount) {
		if(amount <= 0) {
			System.out.printf("금액 오류입니다 : %d원\n", amount);
		}
		else {
			this.balance += amount;
		}
	}
	
	public void substractBalance(int amount) {
		if(amount < 1) {
			System.out.printf("금액 오류입니다 : %d원\n", amount);
		}
		else if (this.balance < amount) {
			System.out.println("출금 불가!! 잔고가 부족합니다.");
		}
		else {
			this.balance -= amount;
		}
	}
	
	public void printAccount() {
		System.out.println("=================");
		System.out.println("고객번호 : " + this.custId);
		System.out.println("고객명 : " + this.custName);
		System.out.println("고객번호 : " + this.accountNumber);
		System.out.println("잔액 : " + this.balance);
		System.out.println("=================");
	}
}
