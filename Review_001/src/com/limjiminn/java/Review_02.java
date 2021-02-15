package com.limjiminn.java;

/*
 * 정수형 변수 num1. num2를 선언
 * 두 변수에 30 과 40을 각각 저장
 * 두 변수에 저장된 값을 4칙 연산과 Mod(나머지)연산을 수행한 후 결과를
 * 정수형 변수 result1, result2, result3, result4, result5에 각각 저장
 * result* 변수에 저장된 값을 Console에 출력
 */

public class Review_02 {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		
		num1 = 30;
		num2 = 40;
		
		int result1 = num1 + num2;
		int result2 = num2 - num1;
		int result3 = num1 * num2;
		int result4 = num2 / num1;
		int result5 = num2 % num1;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		

	}

}
