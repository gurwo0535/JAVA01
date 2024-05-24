package 중급;

import java.util.Scanner;

public class TaxiFare {
	public static void main(String[] args) {
		
		int fare, income = 0;
		
//		System.out.println("요금을 임력하세요 : ");
		Scanner scanner= new Scanner(System.in);
		
		for (int i = 0; i <= 10; i++) {
			System.out.print("요금을 임력하세요 : ");
			fare = scanner.nextInt();
			income = income + fare;
			
		}

		System.out.println("총수입 : "+ income);
	}
}



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