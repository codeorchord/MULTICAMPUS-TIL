package lab.java.core;

import java.util.Scanner;

public class Sosu {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요 (종료 : 0) : ");
			int n = input.nextInt();
			if( n == 0 ) {
				System.out.println("Bye~~");
				break;
			}
			
			boolean bSosu = !(n < 2);
			for(int i = 2; i < n; i++) {
				if( n % i == 0 || n < 0) {
					bSosu = false;
					break;
				}
			}
			
			if(bSosu) System.out.printf("%d은(는) 소수입니다.\n\n", n);
			else System.out.printf("%d은(는) 소수가 아닙니다.\n\n", n);
			
		}
		input.close();

	}

}
