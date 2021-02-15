package com.limjiminn.java;

/*
 *  for() 반복 명령문, if() 비교연산 명령문을 사용하여 다음 문제를 풀이하시오
 *  
 *  1 ~ 100까지 범위 수 중에서 짝수들의 합을 구하시오
 *  예) 2 + 4 +...+ 100
 *  
 *  1 ~ 100까지 범위 수 중에서 홀수들의 합을 구하시오
 */
public class Review_04 {

	public static void main(String[] args) {

		int num = 0;
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < 100; i++) {
			num = i + 1;

			if (num % 2 == 0) {
				sum += num;

			} else {
				sum1 += num;
			}
		}
		System.out.println("100까지 수중에 짝수의 합 : " + sum);
		System.out.println("100까지 수중에 홀수의 합 : " + sum1);

	}

}
