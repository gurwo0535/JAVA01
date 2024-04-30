package qusetion02;

import java.util.Scanner;

public class TaxiFare {
	public static void main(String[] args) {
		
		int fare = 0 ;
		int income = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 1; i < 11; i++) {
			System.out.print(i+"번쨰 요금을 입력하세요 : ");
			fare =sc.nextInt();
			income+=fare;
			
			
//			System.out.println("요금을 입력하세요 : "+fare*i);
		}
		System.out.println("총수입 : "+income);
		sc.close();
	}
}
//중급3 10명의 손님들이낸요금의합(TaxiFare)
//1
// *.main 메소드 설계
// 변수들
// fare: 요금
// income: 총 수입
// 알고리즘
// (1) income = 0
// (2) 다음을 10번 반복한다:
//
//
//
//2.1 "요금을 입력하세요: "를 출력한다
//2.2 fare = 읽어 들인 요금
//2.3 income = income + fare
// (3) 총 수입을 출력한다.