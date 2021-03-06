package com.limjiminn.java;

/*
 * for(int i = 0; i < 100; i++) 반복문 if() 비교 연산 명령문을
 * 사용하여 다음 문제를 풀이하시오
 * 
 * 1 ~ 100 까지 범위 수 중에서 3의 배수 이면서, 5의 배수인 수들의
 * 합을 구하시오
 */
public class Review_06 {

	public static void main(String[] args) {

		int num = 0;
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			num = i + 1;

			boolean thr = num % 3 == 0;
			boolean fiv = num % 5 == 0;

			if (thr && fiv) {
				sum += num;
			}

		}
		System.out.println("3의 배수 이면서, 5의 배수인 수들의 합: " + sum);

	}

}
