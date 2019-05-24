package lab.java.core;

public class FactorialTest {
	
	static int factorial(int n) {
		int result = 0;
		
		if( n == 1)
			result = 1;
		else
			result = n * factorial(n-1); 
		
		return result;
	}

	public static void main(String[] args) {
		
		int result = factorial(10);
		System.out.println(result);

	}

}
