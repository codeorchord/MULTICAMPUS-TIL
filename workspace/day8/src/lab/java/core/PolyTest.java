package lab.java.core;

public  class PolyTest {
	
	public static final void aaa() {
		
	}
	
//	public  abstract void method2();
		

	
	
	
	public void method(Object o) {
		System.out.println(o.toString());
		
		if(o instanceof String) {
			System.out.println("length : " + ((String)o).length());
		}
		
		if(o instanceof Integer) {
			System.out.println("intValue : " + ((Integer)o).intValue());
		}
		
		
		
	}

	public static void main(String[] args) {
		PolyTest test = new PolyTest();
		
		Object o = new Object();
		test.method(o);
		
		String s = new String("java"); 
		test.method(s); //파라미터 전달시 부모타입으로 UpCasting
		
		Integer integer = new Integer(100);
		test.method(integer);
		//UpCasting 으로 전달받은 파라미터만 실제 객체로 DowCasting 가능함
		
		Object[] obj = {
			new String("Korea"),
			new Integer("100"),
//			new Parent(),
//			new Child(),
			new Double("0.5")
		};
		System.out.println(((String)obj[0]).substring(1, 3));
		
		for(int i = 0; i < obj.length; i++)
			System.out.println(obj[i].getClass());
		
		lab.java.basic.Animal cat = new lab.java.basic.Cat();
	}

}
