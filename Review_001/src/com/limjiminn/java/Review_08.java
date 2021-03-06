package com.limjiminn.java;

import java.util.Random;

/*
 * for(int i = 0; i < 100; i++)반복문, if() 비교 연산 명령문
 * Random 클래스를 사용하여 다음문제를 풀이하시오
 * 
 * 1 ~ 100 까지 임의의 숫자 100개를 만들고 생성된 숫자 중 "34"보다 큰 값이 나오면
 * 몇 번째 인지 보여주고 반복문을 중단하시오
 */

public class Review_08 {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			int num1 = i + 1;
			
			Random rnd = new Random();

			int num = rnd.nextInt(100) + 1;
			
			if (num > 34) {
				System.out.println(num + " 는 " + num1 + "번째 반복문");
				break;
			}
			System.out.println(num + " 는 " + num1 + "번째 반복문");
		}

	}

}
