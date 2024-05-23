package 기본;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		
		int a,b,c;
		
		System.out.print("정수 3개를 입력하시오 : ");
		
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		if (a+b>c && a+c>b && b+c>a) {
			System.out.println("삼각형 ㅇㅇ");
		}else {
			System.out.println("삼각형 ㄴㄴ ");
		}
		
		
		
	}
}



// Scanner 를 이용하여 삼각형의 변의 길이를 나타내는정
//수를3개입력받고이3개의수로삼각형을만들수있
//는지판별하라. 삼각형이되려면두변의합이다른한
//변보다커야한다.
//  *.출력
// 정수3개를입력하시오>>4 3 5
//  삼각형이됩니다