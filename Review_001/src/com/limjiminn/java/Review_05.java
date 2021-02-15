package com.limjiminn.java;

/*
 * for(int i = 0; i < 100; i++) 반복 명령문,
 * if() 비교연산 명령문을 사용하여 다음문제를 풀이 하시오
 * 
 * 7 ~ 106 까지 범위 수 중에서 3의 배수들을 Console에 보이고
 * 그 합을 구하시오
 */
public class Review_05 {

	public static void main(String[] args) {

		int num = 0;
		int sum = 0;

		for (int i = 0; i < 100; i++) {
			num = i + 7;
			boolean bYes = num % 3 == 0;

			if (bYes) {
				sum += num;
			}

		}
		System.out.println("106 까지의 수중에 3의 배수의 합: " + sum);
	}

}
