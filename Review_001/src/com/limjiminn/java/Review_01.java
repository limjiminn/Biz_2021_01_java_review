package com.limjiminn.java;
/*
 *  콘솔화면에 다음과 같이 출력하시오
 *  
 *  30 + 40 = 70
 *	30 * 40 = 1200
 * 	40 - 30 = 10
 * 	40 / 20 = 2 
 */
public class Review_01 {
	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 40;
		
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) );
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2) );
		System.out.println(num2 + " - " + num1 + " = " + (num2 - num1) );
		num1 = 20;
		System.out.println(num2 + " / " + num1 + " = " + (num2 / num1) );
		
	}

}
