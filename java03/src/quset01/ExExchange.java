package quset01;

import java.util.Scanner;

public class ExExchange {
	public static void main(String[] args) {
		
		
		System.out.print("원화를 입력하시오(단위 원) >> ");
		
		Scanner sc = new Scanner(System.in);
		
		final double DOLLAR = 1200;
		final double EUT = 1500;
		
		int a = sc.nextInt();
		
		double dollar = a/DOLLAR;
		double eut =   a/EUT;

		System.out.println(a+"원은 $"+ dollar + "입니다.");
		System.out.println(a+"원은 E"+ eut + "입니다.");
		
		sc.close();
		
		
		
		
	}
}
