package 기본;

import java.util.Scanner;

public class ExCalculation {
	public static void main(String[] args) {
	
		double a,b, sum,minus,mul,div;
		
		System.err.print("2개 지요 : ");
		Scanner scanner = new Scanner(System.in);
		
		a= scanner.nextInt();
		b= scanner.nextInt();
		
		sum=a+b;
		minus=a-b;
		mul=a*b;
		div=a/b;
		
		System.out.println("두수의 덧셈은 : "+sum);
		System.out.println("두수의 뺄셈은 : "+minus);
		System.out.println("두수의 곱셈은 : "+mul);
		System.out.println("두수의 나눗셈은 : "+div);
	}
}



//Scanner 클래스를 이용하여 2개의 실수를 입력받고, 덧
//셈,뺄셈,곱셈,나눗셈을 출력하는 프로그램을작성하라.
//  *.출력
// 2개의실수입력>>5 2
//  두수의덧셈은7.0
//  두수의뺄셈은3.0
//  두수의곱셈은10.0
//  두수의나눗셈은2.5