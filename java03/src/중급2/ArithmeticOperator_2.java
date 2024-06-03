package 중급2;

import java.util.Scanner;

public class ArithmeticOperator_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = scanner.nextInt();
		
		System.out.println(num+"초는 "+num/3600+"시간, "+num%3600/60+"분, "+num%60+"초입니다");
		
		
		
	}
}
