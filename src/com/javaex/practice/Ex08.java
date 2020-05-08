package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		int num_1;
		int num_2;
		int num_3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		num_1 = sc.nextInt();
		System.out.print("숫자2: ");
		num_2 = sc.nextInt();
		System.out.print("숫자3: ");
		num_3 = sc.nextInt();
		
		if(num_1 <= num_2 && num_1 <= num_3) {
			System.out.println("가장 작은수는 " + num_1 + " 입니다.");
		}else if(num_2 <= num_1 && num_2 <= num_3) {
			System.out.println("가장 작은수는 " + num_2 + " 입니다.");
		}else if(num_3 <= num_1 && num_3 <= num_2) {
			System.out.println("가장 작은수는 " + num_3 + " 입니다.");
		}
		sc.close();
		
	}

}
