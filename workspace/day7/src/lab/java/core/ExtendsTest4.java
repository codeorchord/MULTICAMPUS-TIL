package lab.java.core;

class Parent4 {
	
}


class Child4 extends Parent4 {
	

}

class Child_ extends Parent4 {
	
}


public class ExtendsTest4 {

	public static void main(String[] args) {
		Child4 c4 = new Child4();
		Child5 c5 = new Child5();
		Parent4 p = new Parent4();
		
		//레퍼런스변수(객체) instanceof 타입(클래스명, 인터페이스명)
		System.out.println(c4 instanceof Child4); //is a 관계 체크
		System.out.println(c4 instanceof Parent4);//상속 관계 체크
		System.out.println(p instanceof Child4);
//		System.out.println(c5 instanceof Child4); //컴파일오류
		
		
		int[] array = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
	}

}
