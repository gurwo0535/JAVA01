package quset01;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		
		System.out.print("정수 3개를 입력하시오 >> ");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		boolean ex = (a + b > c) && (b + c > a)&& (c + a > b);
		
	if (ex) {
		System.out.println("삼각형이 됩니다.");

	}else {
		System.out.println("삼각형이 될수 없었습니다.");
	}

	
//	if ((a + b) <= c) || ((b + c) <= a)|| ((c + a) <= b) {
//		System.out.println("삼각형이 됩니다.");
//
//	}else {
//		System.out.println("삼각형이 될수 없었습니다.");
//	}
	
	}
	
	
}

