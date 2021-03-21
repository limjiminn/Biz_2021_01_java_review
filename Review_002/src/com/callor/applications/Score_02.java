package com.callor.applications;

import com.callor.applications.service.ScoreService;

public class Score_02 {
/*
 * c.c.a.service.ScoreService 클래스를 생성한 후
 * score() 메서드 생성하여
 * 성적을 입력 받고 총점과 평균을 구하는 코드를 작성
 * Score_02 클래스의 main() method 에서
 * ScoreService 클래스의 score()메서드를 호출하여
 * 성적을 출력하시오
 */
	public static void main(String[] args) {
		
		ScoreService ss = new ScoreService();
		
		ss.score();
		
	}
}
