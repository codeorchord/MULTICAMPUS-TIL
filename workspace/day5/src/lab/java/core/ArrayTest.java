package lab.java.core;

public class ArrayTest {

	public static void main(String[] args) {
		
		Array array1 = new Array("첫번째", 3, 4);
		Array array2 = new Array("두번째", 3, 4);
		
		array1.makeArrayData();
		array2.makeArrayData();
		
		array1.printArray();
		array2.printArray();
		
		Array.findMatchNumber(array1, array2);
	}

}
