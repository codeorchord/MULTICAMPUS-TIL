package com.workshop.account;

import java.util.Scanner;

public class AccountTest {
	
//	public static int getUserInput() {
//		Scanner input = new Scanner(System.in);
//		return input.nextInt();
//	}
//	
//	public static int getmenuItem() {
//		System.out.println("[ Menu ]");
//		System.out.println("1. 입금");
//		System.out.println("2. 출금");
//		System.out.println("9. 종료");
//		System.out.print("=> Menu 선택 : ");
//		
//		return getUserInput();
//	}

	public static void main(String[] args) {
		
		System.out.println("[공지] 계좌를 개설합니다.");
		Account account = new Account("CUST01", "홍길동", "11-222-3333", 100000);
		account.printAccountInfo();
		
		account.deposit(30000);
		account.printAccountInfo();
		
		account.deposit(-10000);
		account.printAccountInfo();
		
		account.withdraw(50000);
		account.printAccountInfo();
		
		account.withdraw(100000);
		account.printAccountInfo();
		
		account.withdraw(-10000);
		account.printAccountInfo();
		
		account.deposit(20000);
		account.printAccountInfo();

	}

}
