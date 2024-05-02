package J240502;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		
		
		System.out.print("금액을 입력하시오 >> ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		int oman = money/50000;
		int man = money/10000;
		
	
		
		if (oman != 0) {
			System.out.println("오만원권 : "+oman+"매");
		}if (man != 0) {
			System.out.println("만원권 : "+man+"매");
		}
//			if (oman != 0) {
//			System.out.println("오만원권 : "+oman+"매");
//		}if (oman != 0) {
//			System.out.println("오만원권 : "+oman+"매");
//		}if (oman != 0) {
//			System.out.println("오만원권 : "+oman+"매");
//		}if (oman != 0) {
//			System.out.println("오만원권 : "+oman+"매");
//		} 
		
		
	}
	
	
}
//
//System.out.println("만원권 : "+"매");
//System.out.println("오천원권 : "+"매");
//System.out.println("천원권 : "+"매");
//System.out.println("오백원권 : "+"매");
//System.out.println("백원권 : "+"매");
//System.out.println("오십원권 : "+"매");
//System.out.println("십원권 : "+"매");
//System.out.println("일원권 : "+"매");



//중급C7 : Scanner 와 if 문 연습(ChangeMoney)
//1
// Scanner 클래스를 이용하여 정수로 된돈의액수를입력받아
//오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 
//50원짜리 동전, 10원짜리 동전, 1원짜리 동전각몇개로변환
//되는지출력하라.
// *.출력
// 금액을입력하시오>>65376
// 오만원권1매
// 만원권1매
// 천원권5매
// 백원3개
// 오십원1개
// 십원2개
// 일원6개