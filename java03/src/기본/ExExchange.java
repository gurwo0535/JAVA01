package 기본;

import java.util.Scanner;

public class ExExchange {
	public static void main(String[] args) {
		final double doller = 1200;
		final double EUR = 1500;
		double setdoller, setEUR;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하시오 : ");
		int won = scanner.nextInt();
		
		setdoller = won/doller;
		setEUR = won/EUR;
		
		System.out.println(won+"원은 $"+setdoller+"입니다");
		System.out.println(won+"원은 E"+setEUR+"입니다");
		
	}
}

//
// Scanner 클래스를 이용하여 원화를 입력받아 달러, 유로
//화로바꾸어다음예시와같이출력하는프로그램을작
//성하라.
//  $1=1200원으로 가정하고 계산하라.
//  1EUR=1500원으로 가정하고 계산하라.
//  *.출력
// 원화를입력하세요(단위원)>>3600
//  3600원은 $3.0입니다.
//  3600원은 E2.4입니다.