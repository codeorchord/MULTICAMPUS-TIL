package lab.java.basic;

class Outer {
	private int outVar = 5;
	
	public void outerMehod() {
//		System.out.println("outvar=" + outVar);
		Inner inner = new Inner();
		System.out.println("inVar=" + inner.inVar);

	}
	
	protected class Inner {
		private int inVar = 10;
		public void innerMethod() {
			System.out.println("outVar=" + outVar);
		}
	}
}


public class MemberInnerTest {

	public static void main(String[] args) {
//		Outer outer = new Outer();
//		outer.outerMehod();
		
		Outer.Inner inner = new Outer().new Inner();
		inner.innerMethod();
		
		Outer outer = new Outer();
		outer.outerMehod();
		
//		Outer.Inner inner2 = outer.new Inner();
	}

}
