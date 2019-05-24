package com.lg.workshop2.lotto;

import java.util.Random;

public class Lotto {
	public static final int LOTTO_NUM_CNT = 6;
	
	public int[] getnerateLottoNumbers() {
		int numbers[] = new int[LOTTO_NUM_CNT];
	
		for(int i = 0; i < numbers.length; i++) {
			boolean bSame;
			while(true) {
				bSame = false;
				int r = getRandomNumber();
			
				for(int j = 0; j < i; j++ ) {
					if(r == numbers[j]) {
						bSame = true;
						break;
					}
				}
				
				if(bSame == false) {
					numbers[i] = r;
					break;
				}
			}
		}
		
		return numbers;
	}
	
	public void displayLottoNumbers(int[] lottoNumbers) {
		System.out.println("<< Lotto >>");
		for(int num : lottoNumbers) {
			System.out.printf("%d ", num);
		}
	}
	
	public void sortLottoNumbers(int[] lottoNumbers) {
		for(int i = 0; i < lottoNumbers.length; i++) {
			for(int j = i+1; j < lottoNumbers.length; j++) {
				if(lottoNumbers[i] > lottoNumbers[j]) {
					int tmp = lottoNumbers[i];
					lottoNumbers[i] = lottoNumbers[j];
					lottoNumbers[j] = tmp;
				}
			}
		}
	}
	
	private static int getRandomNumber() {
		return new Random().nextInt(45) + 1;
	}
	
	
}
