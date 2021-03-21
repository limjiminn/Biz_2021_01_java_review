package com.callor.applications;

import java.util.Scanner;

public class Score_01 {
/*
 * Scanner 클래스를 사용하여 키보드에서
 * 국어, 영어, 수학 점수를 각각 입력 받아 변수에 저장
 * 각 점수는 0 ~ 100까지만 입력할 수 있음
 * 3과목의 합계와 평균을 계산하여 각각 변수에 저장
 * 다음과 같이 화면에 출력, 평균은 실수로 표현
 * ===========================================
 * 국어		영어	수학	총점	평균
 * -------------------------------------------
 * 82		83		77		242		80.666666
 * ===========================================
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		
		System.out.print("수학 : ");
		int math = scan.nextInt();
		
		int sum = kor + eng + math;
		
		float avg = (float) sum / 3;
		
		System.out.println("=================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(math + "\t");
		System.out.print(sum + "\t");
		System.out.println(avg);
		System.out.println("=================================");
		
		
	}
}
