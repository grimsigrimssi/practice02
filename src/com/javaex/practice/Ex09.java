package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		int num_1;
		int num_2;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		num_1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		num_2 = sc.nextInt();
		
		if(num_1 > num_2) {
			if(num_1%num_2 == 0) {
				System.out.println(num_2 + "는(은) " + num_1 + " 의 약수입니다.");
			}else {
				System.out.println(num_2 + "는(은) " + num_1 + " 의 약수가 아닙입니다.");
			}
		}else if(num_1 < num_2) {
			if(num_2%num_1 == 0) {
				System.out.println(num_1 + "는(은) " + num_2 + " 의 약수입니다.");
			}else {
				System.out.println(num_1 + "는(은) " + num_2 + " 의 약수가 아닙입니다.");
			}
		}		
		sc.close();
		
	}

}
