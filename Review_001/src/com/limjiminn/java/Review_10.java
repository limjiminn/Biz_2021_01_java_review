package com.limjiminn.java;

import java.util.Random;
import java.util.Scanner;

/*
 * 1. Random 클래스를 사용하여 1 ~ 100까지 숫자 중 1개를 생성하여
 * 		rndNum 변수에 저장
 * 2. 화면에 "숫자입력 >> " 프롬포트 표시 후
 * 3.  1 ~ 100까지 정수를 입력받는다
 * 4. 입력받은 정수와 rndNum 변수에 저장된값을 비교하여
 * 5. 큰가, 작은가를 알려주고
 * 6. rndNum에 저장된 값을 맞추는 게임
 * 
 * 7. 2 부터 5까지를 계속 반복하면서 값을 맞춘다
 * 8. 만약 정수값에 -1을 입력하면 게임을 중단한다
 */
public class Review_10 {
	public static void main(String args[]) {
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		int rndNum = rnd.nextInt(100) + 1;

		while (true) {
			System.out.print("숫자입력 >> ");
			int num1 = scan.nextInt();

			if (num1 == rndNum) {
				System.out.println("    WINNER");
				break;
			} else if (num1 > rndNum) {
				System.out.println(num1 + " 보다 작다");
			} else if (num1 < rndNum) {
				System.out.println(num1 + " 보다 크다");
			} else {
				System.out.println("You Lose...");
			}

		}
	}

}
