package package1;



class Other {
	public void access() {
		Parent p = new Parent();
		System.out.println(p.name);
		p.name = "hi";
		System.out.println(p.name);
	}
}


public class DefaultTest {
	public static void main(String[] args) {
		Other o = new Other();
		o.access();
		
		Child c = new Child();
		c.access();
	}
	
}