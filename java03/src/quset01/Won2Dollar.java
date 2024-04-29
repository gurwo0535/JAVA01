package quset01;

import java.util.Scanner;

public class Won2Dollar {
	public static void main(String[] args) {
		
		
		//환율 고정할떄 상수 사용(관습적으로 대문자)
//				final int RATE = 1100;
		
		System.out.print("원화를 입력하시오(단위 원) >> ");
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt(); 
		
		double  b =  (a/1100);
		
		System.out.println(a+ "원은 " + "$" + b + "입니다.");
		
		sc.close();
	}
}
