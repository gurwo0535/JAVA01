package java240430_cha03;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		
		System.out.println("정수 3개 입력 >> ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int medain = 0;// 중간값 변수 설정 

		if ((a>b&&a<c) || (a>c && a<b)) {
			medain = a;
		}else if ((b>a&&b<c) || (b>c && b<a)) {
			medain = b;
		}else {
			medain = c;
		}
		
		System.out.println("중간 값은 : " + medain);
//		if (a==b || a==c || b==c) {
//			return;
//		} else if (){
//
//		}
//		System.out.println("중간 값은 : ");
	}
}

/*
기본 6 Scanner 와 if 문 연습(Median)
 Scanner 클래스로 정수 3개를 입력 받고 3개의 숫자 중
중간 크기의 수를 출력하라.
 중복되지 않는 숫자를 입력하라.
 평균값을 구하는 것이 아님에 주의하라.
 *.출력
 정수 3개 입력>>20 100 33
 중간 값은 33
*/