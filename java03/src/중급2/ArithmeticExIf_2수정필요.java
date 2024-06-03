package 중급2;

import java.util.Scanner;
 // 잘못된 연산자입니다 넣고 싶다 
public class ArithmeticExIf_2수정필요 {
	public static void main(String[] args) {
		
		int x = 0,y = 0,sum=0;
		String obj = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산 >> ");
		x = scanner.nextInt();
		obj = scanner.next();
		y= scanner.nextInt();
		
		if (x != 0 && y != 0) {
			if (obj.equals("+")) {
				System.out.print(x+obj+y+"의 계산 결과는 >>"+(x+y));
			}
			if (obj.equals("-")) {
				System.out.print(x+obj+y+"의 계산 결과는 >>"+(x-y));
			}
			if (obj.equals("*")) {
				System.out.print(x+obj+y+"의 계산 결과는 >>"+(x*y));
			}
			if (obj.equals("/")) {
				System.out.print(x+obj+y+"의 계산 결과는 >>"+(x/y));
			}
		}else {
			System.out.println("0으로 나눌수 없습니다");
		}
		
	}
}
