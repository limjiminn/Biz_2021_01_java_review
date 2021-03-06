package com.limjiminn.java;

import java.util.Scanner;

/*
 * Scanner 클래스를 사용하여 키보드에서 2 ~ 9 까지 중 1개의 숫자를
 * 입력 받고, 다음과 같이 구구단을 출력하시오.
 * 입력한 숫자가 2 ~ 9 까지 이외의 값이면 경고를 보이고 끝내시오
 */
public class Review_11 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.print("구구단 :");
		int intNum = scan.nextInt();

		int num = 0;
		boolean two = intNum > 1;
		boolean nin = intNum < 10;

		if (two && nin) {
			for (int i = 0; i < 8; i++) {
				num = i + 2;

				System.out.print(intNum);
				System.out.print(" x ");
				System.out.print(num);
				System.out.print(" = ");
				System.out.println(intNum * num);

			}

		}else {
			System.out.println("   경고");
		}
	}

}
