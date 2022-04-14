package com.javaex.practice;

public class Ex03 {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		int	b = y++ *2;
		
		System.out.println("a=" +a); // x값 증가 이후 값 대입 (2*2=4) // 증가 후 출력
		System.out.println("b=" +b); // y값 증가 이전 값 대입 (1*2=2) // 출력 후 증가
		System.out.println("x=" +x); // 증가 연산자로 둘다 값은 1씩 증가
		System.out.println("y=" +y); // 증가 연산자로 둘다 값은 1씩 증가
		
		
		
	}
}
