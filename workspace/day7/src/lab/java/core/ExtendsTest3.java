package lab.java.core;

class Parent3 {
	
	int age = 55;
	
}


class Child3 extends Parent3 {
	
	int age = 26;
	
	public void printAge() {
		int age = 23;
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
	}
	
}


public class ExtendsTest3 {

	public static void main(String[] args) {
		Child3 c = new Child3();
		c.printAge();

	}

}
