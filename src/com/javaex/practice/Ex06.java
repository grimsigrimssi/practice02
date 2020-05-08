package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		int num_1;
		int num_2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개를 입력해주세요");
		System.out.print("숫자1: ");
		num_1 = sc.nextInt();
		System.out.print("숫자2: ");
		num_2 = sc.nextInt();
		
		if(num_1 > num_2) {
			System.out.print("큰수: " + num_1 + "     ");
			System.out.println("작은수: " + num_2 + "입니다.");
		}else if(num_1 <= num_2) {
			System.out.print("큰수: " + num_2 + "     ");
			System.out.println("작은수: " + num_1 + "입니다.");
		}
		sc.close();
		
	}

}
