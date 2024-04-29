package quset01;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		
		System.out.print("정수를 입력하시오 >> ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double aa = (a*b)/2;
		double bb = ((a+b)*c)/2;
		
		if (c != 0) {
			System.out.println("사다리꼴의 넓이는 "+ bb);
		} else {
			System.out.println("삼각형의 넓이는 " + aa);
		}
		sc.close();
	}
}
