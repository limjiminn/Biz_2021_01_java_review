package com.limjiminn.java;

/*
 * for() 반복 명령문을 사용하여 다음 코드를 작성하시오
 * 
 * 100 ~ 1000까지 범위 수를 100 단위 씩 출력 
 * 100 200 300 ~~~ 1000
 * 
 * 1 ~ 10 순서 번호를 붙여 문자열 출력
 * 1.홍길동 2.홍길도 3.~~~~~~ 10.홍길동
 * 
 */
public class Review_03 {

	public static void main(String[] args) {
		
		int num = 0;
		
		for (int i = 0; i < 10; i++) {

			num = (i + 1) * 100;

			System.out.print(num + " ");

		}
		System.out.println();
		System.out.println("======================================");
		
		for( int i = 0; i < 10; i++) {
			
			num = i + 1;
			
			System.out.print(num + ".홍길동 ");
			
		}
		
		

	}

}
