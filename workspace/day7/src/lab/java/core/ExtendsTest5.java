package lab.java.core;

class Parent5 {
	protected int add(int a, int b) {
		return a+b;
	}
}


class Child5 extends Parent5 {
	void add(int a, int b, int c) { //Overload 메서드
		System.out.println((int)((a+b)*0.9));
	}
	
	protected int add(int a, int b) { //Override 메서드
		return (int)((a+b)*0.9);
	}
}


public class ExtendsTest5 {

	public static void main(String[] args) {
		Child5 c5 = new Child5();
		System.out.println(c5.add(3, 4));

	}

}
