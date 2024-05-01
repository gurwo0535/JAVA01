package JA240501_q3_q4;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
	
		
		
		
		/*
		 *  선생님 
		 *  else if 를 쓴다고 다 좋은게 아니다
		 *  multiple ==false   =   !multiple
		 */
		System.out.print("양의 정수를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean multiple = false;
		
		if (number%3==0) {
			System.out.println("3의 배수이다.");
			multiple = true;
		}if (number%5==0) {
			System.out.println("5의 배수이다.");
			multiple = true;
		}if (number%8==0) {
			System.out.println("8의 배수이다.");
			multiple = true;
		}if (multiple ==false) {
			System.out.println("어느 배수도 아니다.");
			multiple = true;
		}
		
		
	}
}
//		나
//		System.out.print("양의 정수를 입력하시오 : ");
//		Scanner sc = new Scanner(System.in);
//		int number = sc.nextInt();
//		boolean multiple = false;
//		
//		if (number%3==0) {
//			System.out.println("3의 배수이다");
//			multiple = true;
//		} if (number%5==0) {
//			System.out.println("5의 배수이다");
//			multiple = true;
//		} if (number%8==0) {
//			System.out.println("8의 배수이다");
//			multiple = true;
//		}if(!multiple) {
//			System.out.println("어느 배수도 아니다");
//		}
//		
//	}
//}




//
//급B 9 입력받은양의정수가3의배수, 5의배
//수혹은8의배수인지를알려준다.(Multiple)
//
//scanner: 키보드로부터 데이터를 읽어 들이기 위해 필요한변수
//number: 입력 받은 양의 정수
//multiple: 배수 여부 확인
//알고리즘
//multiple을 false로 초기화한다.
//양의정수를읽어들여number에저장한다.
// number를 3으로 나눈 나머지가0이면‘3의배수이다’를출력하고multiple을true로 한다.
// number를 5로 나눈 나머지가0이면‘5의배수이다’를출력하고multiple을 true로 한다.
// number를 8로 나눈 나머지가0이면‘8의배수이다’를출력하고multiple을 true로 한다.
// multiple이 false이면 ‘어느 배수도 아니다’를 출력한다.
//양의정수를입력하세요: 352
// 8의 배수이다
//양의정수를입력하세요: 15
// 3의 배수이다
//5의 배수이다
//양의정수를입력하세요: 353
//어느배수도아니다