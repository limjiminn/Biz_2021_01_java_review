package com.limjiminn.java;

import java.util.Scanner;

/*
 * Run(실행) 하면 화면에 "숫자입력 >>" 프롬포트 표시 후 임의의 정수를 
 * 키보드로 입력 후 Enter 입력한 숫자가 짝수인지 홀수인지 판별하여 console에 출력
 */
public class Review_09 {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("숫자입력 >> ");
		int intNum1 = scan.nextInt();
		
		if(intNum1 % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		System.out.println("홀수입니다.");
		
	}

}
