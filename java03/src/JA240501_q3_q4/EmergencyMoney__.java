package JA240501_q3_q4;

import java.util.Scanner;

public class EmergencyMoney__ {
	public static void main(String[] args) {

		
		// 선생님
		final int hundred = 120000;
		final int ten = 12000;
		int res, money, num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가구수를 입력하세요 : ");
		num = sc.nextInt();
		
		if (num ==1 ) {
			money = 400000;
		}else if (num ==2) {
			money = 600000;	
		}else if (num ==3) {
			money = 800000;	
		}else {
			money = 1000000;	
		}
		res = money/hundred;
		//100달러가 1장 이상일떄
		if (res>0) {
			System.out.println("100달러짜리 "+res+"매");
		}
		//나머지 돈을 다시 셋팅 
		money = money%hundred;
		//10달러짜리 계산해야함
		res = money/ten;
		//10달러가 1장 이상일떄
		if (res>0) {
			System.out.println("10달러짜리 "+res+"매");
		}
	}
}
	

		
		
		
		
		
		
		
		
		// 내가 짠 코딩 안맞음
		
//		System.out.print("가구수를  입력하시오 : ");
//		Scanner sc = new Scanner(System.in);
//		
//		int gagu = sc.nextInt();
//		int dollar = 1200;
//		int ziwon = 0;
//		int backdal = dollar*100;
//		int sipdal = backdal*10;
//		
//		
//		switch (gagu) {
//		case 4:
//			ziwon = 1000000;
//			break;
//		case 3:
//			ziwon = 800000;
//			break;
//		case 2:
//			ziwon = 600000;
//			break;
//		case 1:
//			ziwon = 400000;
//			break;
//			}
//		int a = (ziwon/backdal);
//		int b = (ziwon%100)/10;
//
//		
//		
//		
//		System.out.println("100달러짜리 "+a +"매");
//		System.out.println("10달러짜리 "+b +"매");

//
//중급C 1 긴급재난지원금연습(EmergencyMoney)
//1
// Scanner 클래스를 이용하여 정수로된가구수를입력받아100달러권, 10달러권
//각몇개로변환되는지출력하라.
// (단, 기준은 1인 가구: 40만원, 2인 가구: 60만원, 3인 가구: 80만원, 4인 이상 가
//구: 100만원)
// $1=1200원으로 가정하고계산하라.