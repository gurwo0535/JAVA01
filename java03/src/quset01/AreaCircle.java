package quset01;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
		
		System.out.println("반지름을 입력하세요>>");
		
		float pi = 3.14f;
//		int radius = 10;
	
		Scanner sc = new Scanner(System.in);
		
		int radius = sc.nextInt();
		
		double AreaCircle = radius*radius*pi;
		
		System.out.println("원의 면적은 "+(AreaCircle)+"입니다.");
		
		sc.close();
		
		
		
		
		
	}

}
