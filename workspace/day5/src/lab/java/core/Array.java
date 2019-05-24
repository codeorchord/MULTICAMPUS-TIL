package lab.java.core;

import java.util.Random;

public class Array {
	private String title;
	private int row;
	private int col;
	private int[][] array;
	
	public Array(String title, int row, int col) {
		this.title = title;
		this.row = row;
		this.col = col;
		array = new int[row][col];
	}
	
	public int getRow() {
		return row;
	}
	
	public void setRow(int row) {
		this.row = row;
	}
	
	public int getCol() {
		return col;
	}
	
	public void setCol(int col) {
		this.col = col;
	}
	
	public int[][] getArray() {
		return array;
	}
	
	public void setArray(int[][] array) {
		this.array = array;
		this.row = array.length;
		this.col = array[0].length;
	}
	
	public void makeArrayData() {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				array[i][j] = getRandomNumber();
			}
		}
	}
	
	private int getRandomNumber() {
		return new Random().nextInt(row * col) + 1;
	}
	
	public void printArray() {
		System.out.printf("## %s Array 출력\n", title);
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void findMatchNumber(Array src, Array desc) {
		int r = src.getRow();
		int c = src.getCol();
		int[][] array1 = src.getArray();
		int[][] array2 = desc.getArray();
		
		int count = 0;
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				if(array1[i][j] == array2[i][j]) {
					System.out.printf("## 일치하는 숫자: [%d][%d] = %d, ", i, j, array1[i][j]);
					count++;
				}
			}
		}
		System.out.println();
		System.out.printf("## 일치하는 숫자 갯수 : %d\n", count);
	}
	
}
