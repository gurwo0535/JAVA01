package JA240501_q3_q4;

import java.util.Scanner;

public class ArithmeticExSwitch {
	public static void main(String[] args) {
	
		System.out.print("연산 >> ");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		int c = sc.nextInt();
		int res = 0;
		
		
		

		
		
		switch (b) {
		case "+" : res = a+c; break;
		
		case "-":res = a-c;break;
		
		case "x":res = a*c;break;
		
		
		/*
		 * case안에 if else 변수 넣을수 있음
		 */
		case "/":
		if (c==0) {
			System.out.println("0으로 나눌수 없습니다.");
			return;
		} else {
			res = a/c;
		}
			break;
			default:
			System.out.println("잘못된 연산자 입니다.");
			break;
		}
		
		System.out.println(a+b+c+"의 계산 결과는 : "+res);
	}
	
}
		
		
		/*	if 문을 "/"안에 넣지않음 
		while 문을 덮는 식으로 사용 
		
		내가쓴 예제
	 */
		
//	if (b.equals("/")&&c==0) {
//			System.out.println("0으로 나눌수 없습니다.");
//			return;
//	} else {
//		switch (b) {
//		case "+" : res = a+c; break;
//		
//		case "-":res = a-c;break;
//		
//		case "x":res = a*c;break;
//		
//		case "/":res = a/c;break;
//		
//		default:
//			System.out.println("잘못된 연산자 입니다.");
//			break;
//		}
//		
//	}	
		


/*
 * 중급7 Scanner 로 문자열 입력, switch (ArithmeticExSwitch)
 1
  사칙연산을입력받아계산하는프로그램을작성하고자한다. 
연산자는+,-,*,/ 의 네가지로 하고 피연산자는 모두 정수로
한다.
  피연산자와연산자는실행사례와같이빈칸으로분리하여
입력한다.
  0으로나누기시“0으로나눌수없습니다.” 를출력하고종료
한다.
  *.출력
 연산>>2 + 4
  2+4의 계산결과는6
  switch 문을 이용하여 프로그램을 작성하라.
 */
