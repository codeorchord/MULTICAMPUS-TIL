package lab.java.core;

import java.util.Scanner;

public class MyDiaryTest {
	
	public static int getUserInput() {
		System.out.print("## 월 입력(종료: -1) => ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		return n;
	}

	public static void main(String[] args) {
		
		MyDiary[] diary = new MyDiary[] {
				new MyDiary("데이트", 1, 5, "레스토랑"),
				new MyDiary("시험", 1, 7, "열공"),
				new MyDiary("찜질방", 1, 30, "땀빼기"),
				new MyDiary("야근", 2, 3, ""),
				new MyDiary("미장원", 2, 20, "변신"),
				new MyDiary("영화", 3, 3, "쿵푸팬더")
		};
		
		int m;
		while( (m = getUserInput()) != -1) {
			
			int n = 1;
			for(int i = 0; i < diary.length; i++) {
				if(diary[i].getMonth() == m) {
					System.out.printf("%d. %d월 %d일 : %s", n++, diary[i].getMonth(), diary[i].getDay(), diary[i].getTitle());
					
					if(!diary[i].getDesc().equals("")) 
						System.out.printf(", %s", diary[i].getDesc());
					
					System.out.println();
				}
			}
			
			if(n == 1) {
				System.out.printf("%d월에 등록된 일정이 없습니다.\n\n", m);
			}
			else {
				System.out.println();
			}
		}
		System.out.println("프로그램을 종료합니다!!");

	}

}
