package quset01;

import java.util.Scanner;

public class Won3Dallar {
	public static void main(String[] args) {
		
		//환율 고정할떄 상수 사용(관습적으로 대문자)
		final int RATE = 1100;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위 원 ) >> ");
		int won = sc.nextInt();
		int dollor = won/RATE;
		
		System.out.println(won+ "원은 " + "$" + dollor + "입니다.");
	}
	
	public static double dollar() {
		
		
		return 0.0;
	}
	
}
