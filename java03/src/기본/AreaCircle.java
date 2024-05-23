package 기본;

import java.util.Scanner;

	
public class AreaCircle {
	
	//매소드 활용 연습 필요 
//	public static double pi() {
//		return 3.14;
//	}
	
	public static void main(String[] args) {
		
		double PI = 3.14;
		
		System.out.print("반지름을 입력하시오 : ");
		
		Scanner scanner = new Scanner(System.in);
		int radius = scanner.nextInt();
		
		// 소수점 둘째 자리에서 끊기 
		System.out.printf("원의 면적은 : %.2f\n", radius*PI);
		
		
	}
}


//Scanner 클래스를 이용하여 반지름을 입력받아원의면
//적출력하는프로그램을작성하라.
//  원주율=3.14로 가정하고 계산하라.
//  *.출력
// 반지름을입력하세요>>10
//  원의면적은314.0입니다.