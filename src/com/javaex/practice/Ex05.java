package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		int height, weight; 
		float st_weight; 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		height = sc.nextInt();
		st_weight = (height-100)*0.9F;
		System.out.print("몸무게: ");
		weight = sc.nextInt();
		
		
		if(weight > st_weight) {
			System.out.print("과체중");	
		}else if(weight < st_weight) {
			System.out.print("저체중");
		}else {
			System.out.print("표준");
		}
		System.out.println(" 입니다.");
		
		System.out.println("표준체중: " + st_weight);
		
		
		sc.close();
		
		
	}

}
