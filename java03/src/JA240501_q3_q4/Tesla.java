package JA240501_q3_q4;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		
		System.out.print("매수 수량을 입력하시오 : ");
		
		Scanner sc = new Scanner(System.in);
		int tes = sc.nextInt(); // 스캐너 입력값
		int zuzu = tes;
		tes = tes*520; // 1주가 520이기때문에 입력값 x 520
		int a = tes/100; // 나누기 100해서 100 달러로 권으로 계산
		int b  = tes%100/10;// 나누기 10 해서 10 달러 권으로 계산
		
		
		System.out.println("테슬라 "+zuzu+"주");
		System.out.println("100달러짜리 "+a+"매");
		
		if (!(b==0)) {			
			System.out.println("10달러짜리 "+b+"매");
		}	
		
	}
}
