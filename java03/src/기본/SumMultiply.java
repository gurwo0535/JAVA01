package 기본;

import java.util.Scanner;

public class SumMultiply {
	public static void main(String[] args) {
		
		int a,b,sum,mul;
		
		System.out.print("두 개지요 : ");
		
		Scanner scanner = new Scanner(System.in);
		
		a=scanner.nextInt();
		b=scanner.nextInt();
		sum=a+b;
		mul=a*b;
		
		System.out.println("두수의 합은 :"+sum);
		System.out.println("두수의 곱은 :"+mul);
	}
}


//Scanner 클래스를 이용하여 2개의 정수를 입력받고, 합
//계와곱셈을출력하는프로그램을작성하라.
// *.출력
// 2개의정수입력>>5 8
// 두수의합은13
// 두수의곱은40