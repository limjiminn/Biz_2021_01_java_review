package com.callor.applications.service;

import java.util.Scanner;

public class ScoreService {

	public void score() {
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
