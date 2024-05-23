package 기본;

import java.util.Scanner;

public class Won2Dollar {
	public static void main(String[] args) {
		final double doller = 1100;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원화 ㄱㄱ : ");
		int won = scanner.nextInt();
		
		
		System.out.println(won+"원은 $"+won/doller+"입니다");
		
	}
}


//Scanner 클래스를 이용하여 원화를 입력받아 달러로바
//꾸어다음예시와같이출력하는프로그램을작성하라.
// $1=1100원으로 가정하고 계산하라.
// *.출력
// 원화를입력하세요(단위원)>>3300
// 3300원은 $3.0입니다.