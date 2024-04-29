package quset01;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		
		System.out.print("3자리수 정수 입력(100~999) >> ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
//		int aa = (a/100) + (a- (a/100)*100)/10  ;
//		
//		int bb = ((a- (a/100)*100)/10)* ((a- (a/100)*100)%10)  ;
//		
//		System.out.println(aa);
//		
//		System.out.println(bb);
		
//		int rest = a%100;
//		int aa = a/100;
//		int bb = rest/10;   같은 방식
//		int cc = rest%10;
		
		int aa = a/100;
		int bb = a%100/10;
		int cc = a%100%10;
		
		int sum = aa+bb;
		int multiply = bb*cc;
		
		System.out.println("100의 자리와 10의 자리의 합은 : "+ sum);
		System.out.println("10의 자리와 1의 자리의 곱은 : "+ multiply);
		
	}
}
