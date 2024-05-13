package J0513;

import java.util.Scanner;
// 배열과 for문으로 돈의 단위별로 갯수 구하기
public class ChangeMoney {
	
	public static void main(String[] args) {
		
		System.out.print("금액을 입력하시오 : ");
		
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		for (int i = 0; i < unit.length; i++) {
			int res =  money/unit[i];
			
			if (res>0) {
				System.out.println(unit[i]+"원 짜리 :"+res+"개");
				money = money%unit[i];
			}
		}
		
	}
	
}	
		//while 문
//		while (won>0) {
//			if (won>=unit[0]) {
//				System.out.println(unit[0]+"원 짜리"+won/unit[0]+"개");
//			}
//			if (won>=unit[1]) {
//				System.out.println(unit[1]+"원 짜리"+won%unit[0]/+unit[1]+"개");
//			}
//			if (won>=unit[2]) {
//				System.out.println(unit[2]+"원 짜리"+won%unit[0]%unit[1]/unit[2]+"개");
//			}
//			if (won>=unit[3]) {
//				System.out.println(unit[3]+"원 짜리"+won%unit[0]%unit[1]%unit[2]/unit[3]+"개");
//			}
//			if (won>=unit[4]) {
//				System.out.println(unit[4]+"원 짜리"+won%unit[0]%unit[1]%unit[2]%unit[3]/unit[4]+"개");
//			}
//			if (won>=unit[5]) {
//				System.out.println(unit[5]+"원 짜리"+won%unit[0]%unit[1]%unit[2]%unit[3]%unit[4]/unit[5]+"개");
//			}
//			if (won>=unit[6]) {
//				System.out.println(unit[6]+"원 짜리"+won%unit[0]%unit[1]%unit[2]%unit[3]%unit[4]%unit[5]/unit[6]+"개");
//			}
//			if (won>=unit[7]) {
//				System.out.println(unit[7]+"원 짜리"+won%unit[0]%unit[1]%unit[2]%unit[3]%unit[4]%unit[5]%unit[6]/unit[7]+"개");
//			}break;
//		}

//for (int i = 0; i < won; i++) {

//3중상급B1 배열과반복문2 (ChangeMoney)
//1
// 배열과반복문을이용하여프로그램을작성해보자.
// 키보드에서정수로된돈의액수를입력받아오만원권, 만원권, 천원
//권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1
//원짜리동전각몇개로변환되는지예시와같이출력하라.
// 이때반드시다음배열을이용하고반복문으로작성하라.
// int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의
//종류
// *.출력
// 금액을입력하시오>>65123
// 50000원 짜리 : 1개
// 10000원 짜리 : 1개
// 1000원 짜리 : 5개
// 100원 짜리: 1개
// 10원 짜리: 2개
// 1원짜리: 3개