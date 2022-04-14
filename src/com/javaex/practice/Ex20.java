package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int c1 = sc.nextInt();
		System.out.print("100원 개수: ");
		int c2 = sc.nextInt();
		System.out.print("50원 개수: ");
		int c3 = sc.nextInt();
		System.out.print("10원 개수: ");
		int c4 = sc.nextInt();
		
		System.out.println("동전의 총합은 " +(500*c1+100*c2+50*c3+10*c4)+ " 원 입니다.");
		
		
		
		sc.close();
		
		
	}
}
