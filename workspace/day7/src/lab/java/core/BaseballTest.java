package lab.java.core;

public class BaseballTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		while(true) {
			if(BaseBall.strike == 0 && BaseBall.ball == 0)
				System.out.printf("***** %d 번째 선수 출격 *****\n\n", BaseBall.player + 1);
			
			if(BaseBall.isStrike()) {
				System.out.println("공 던짐 => 스트라이크!!");
				BaseBall.strike++;
			}
			else {
				System.out.println("공 던짐 => 볼!!");
				BaseBall.ball++;
			}
			BaseBall.getStatus();
			
			
			if(BaseBall.ball == 4) {
				System.out.println("\n1루 출루");
				BaseBall.strike = 0;
				BaseBall.ball = 0;
				BaseBall.player++; 
			}
			else if(BaseBall.strike == 3) {
				BaseBall.outCount++;
				System.out.println(" ==> " + BaseBall.outCount + " 아웃");
				if(BaseBall.outCount < 3) {
					BaseBall.strike = 0;
					BaseBall.ball = 0;
					BaseBall.player++; 
				}
				else {
					System.out.println("쓰리아웃! 공수교체!!");
					break;
				}
				
				System.out.println("선수 교체");
			}
			else {
				System.out.println();
			}
			
			System.out.println();
		}
	}

}
