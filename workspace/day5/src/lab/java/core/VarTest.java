package lab.java.core;

public class VarTest {
	
	public int member;
	
	public void method() {
		int local =3;
		//클래스 내에서 멤버들 간에는 객체 생성없이 참조사용 가능
		System.out.println(member);
//		System.out.println(local);
	}
	
	public void method2() {
		method();
//		System.out.println(local);
	}

	public static void main(String[] args) {
		VarTest test = new VarTest();
		System.out.println(test.member);

	}

}
