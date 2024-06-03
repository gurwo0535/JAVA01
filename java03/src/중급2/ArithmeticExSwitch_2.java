package 중급2;

import java.util.Scanner;

public class ArithmeticExSwitch_2 {
	public static void main(String[] args) {
		int x = 0,y = 0,sum=0;
		String obj = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산 >> ");
		x = scanner.nextInt();
		obj = scanner.next();
		y= scanner.nextInt();
		
		switch (obj) {
		case "+":
			System.out.print(x+obj+y+"의 계산 결과는 >>"+(x+y));
			break;
		case "-":
			System.out.print(x+obj+y+"의 계산 결과는 >>"+(x-y));
			break;
		case "*":
			System.out.print(x+obj+y+"의 계산 결과는 >>"+(x*y));
			break;
		case "/":
			if (x !=0 && y != 0) {
				System.out.print(x+obj+y+"의 계산 결과는 >>"+(x/y));
				break;
			}else {
				System.out.println("0으로 나눌수 없습니다");
			}break;

		default:
			System.out.println("잘못된 연산자 입니다");
			break;
		}
	}
}
