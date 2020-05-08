package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {

		int age = 15;
		
		//age가 0살 초과이고 18살 미만 이면
		//if(0 < age < 18) { age가 int로 선언되어  정수이므로 0 < 삭제
		
		if(age < 18) {
			System.out.println("청소년 입니다.");
		}
		
	}

}
