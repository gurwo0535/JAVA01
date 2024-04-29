package quset01;

import java.lang.reflect.Method;
import java.util.Scanner;

class Aaa{}
class Baa{}

//public class : 자바 파일 안에 두개이상 존재시 오류 

//JVM이 수많은 class 에서 public class 를 찾아감
public class ExCalculation {
//	Method 여러개 사용해도 무관 
	public static void bnbb() {}
	public static void aaa() {}
//	JVM 이 수많은 메소드 에서 main 메소드를 찾아감 
	public static void main(String[] args) {
		
		System.out.print("2개의 실수 입력 >> ");
		
		Scanner sc = new Scanner(System.in);
		
		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		
		System.out.println("두수의 덧셈은 " + (a+b));
		System.out.println("두수의 뺄셈은 " + (a-b));
		System.out.println("두수의 곱셈은 " + (a*b));
		System.out.println("두수의 나눗셈은 " + (a/b));
		
		sc.close();
	}
}
