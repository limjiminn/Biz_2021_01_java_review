package com.limjiminn.java;

import java.util.Random;

/*
 * for(int i = 0; i < 100; i++)반복문, if() 비교 연산 명령문
 * Random 클래스를 사용하여 다음문제를 풀이하시오
 * 
 * 1 ~ 100 까지 임의의 숫자 100개를 만들고 100개 중에 짝수들 만의 합을 구하시오
 */

public class Review_07 {
	public static void main(String args[]) {

		int sum = 0;

		for (int i = 0; i < 100; i++) {

			Random rnd = new Random();
			

			int num = rnd.nextInt(100) + 1;
			if (num % 2 == 0) {
				sum += num;
			}

		}
		System.out.println("임의 수 100개중 짝수의 합 : " + sum);
	}
}
