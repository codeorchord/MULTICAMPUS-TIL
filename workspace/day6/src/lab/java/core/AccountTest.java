package lab.java.core;

import java.util.Scanner;

public class AccountTest {
	
	public static int getUserInput() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	
	public static int getmenuItem() {
		System.out.println("[ Menu ]");
		System.out.println("1. 입금");
		System.out.println("2. 출금");
		System.out.println("9. 종료");
		System.out.print("=> Menu 선택 : ");
		
		return getUserInput();
	}
	
	public static int getAmount() {
		System.out.print("금액 : ");
		return getUserInput();
	}

	public static void main(String[] args) {
		Account account = new Account("CUST01", "소지섭", "1-22-333", 100000);
		
		account.printAccount();
		
		while(true) {
			int amount = 0;
			
			switch(getmenuItem()) {
			case 1:
				amount = getAmount();
				System.out.printf("%d원을 입금합니다.\n", amount);
				account.addBalance(amount);
				break;
			case 2:
				amount = getAmount();
				System.out.printf("%d원을 출금합니다.\n", amount);
				account.substractBalance(amount);
				break;
			case 9:
				System.out.println("Bye~~");
				System.exit(0);
			}
			
			System.out.println("================");
			System.out.println("현재 잔액: " + account.getBalance());
			System.out.println("================");
		}
	}

}
