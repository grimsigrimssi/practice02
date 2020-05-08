package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		int num_1;
		int num_2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		num_1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		num_2 = sc.nextInt();
		
		if(num_1 > num_2) {
			System.out.println("몫: " + num_1/num_2);
			System.out.println("나머지: " + num_1%num_2);
		}else if(num_1 <= num_2) {
			System.out.println("몫: " + num_2/num_1);
			System.out.println("나머지: " + num_2%num_1);
		}
		
		sc.close();
		
	}

}
