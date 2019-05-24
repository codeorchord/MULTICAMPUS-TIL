package lab.java.basic;



class Outer3 {
	private int outVar = 5;
	
	public void outerMethod() {
		method();
//		Inner inner = new Inner();
	}
	
	public void method() {
		int local = 10;
		class Inner {
			public void innerMethod() {
				System.out.println("local=" + local);
//				local += 3;
				//Loca Inner Class 가 참조하는 local 변수는 final이어야 합니다.
				//명시적으로 선언 했었는데.. 지금은 자동으로...
			}
		}
		Inner inner = new Inner();
		inner.innerMethod();
	}
	
	
}



public class LocalInnerTest {
	public static void main(String[] args) {
		Outer3 outer = new Outer3();
		outer.method();
	}
}
