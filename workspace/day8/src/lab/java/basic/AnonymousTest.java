package lab.java.basic;

public class AnonymousTest {

	public static void main(String[] args) {
		//public class Bird implements Animal 선언 없이
		//생성과 동시에 구현이 되는 클래스
		Animal bird = new Animal() {

			@Override
			public void move() {
				System.out.println("Flying");
			}
			
			public void eat() {
				System.out.println("벌레");
			}
			
		};
		
		bird.move();
//		bird.eat(); //Animal Interface에 선언이 안 되어 있어서 참조 불가.
		
		new Animal() {

			@Override
			public void move() {
				System.out.println("Flying");
			}
			
			public void eat() {
				System.out.println("벌레");
			}
			
		}.move();

	}

}
