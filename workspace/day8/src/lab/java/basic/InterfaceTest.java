package lab.java.basic;

public class InterfaceTest {

	public static void main(String[] args) {
//		Animal animal = new Animal(); //Interface 는 객체 생성 불가
		System.out.println(Animal.EYES);
		Animal animal = new Cat();
		animal.move();
		((Cat)animal).eat();
		
		
	}

}
