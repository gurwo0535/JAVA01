package JA240501_q3_q4;

import java.util.Scanner;

public class ThressSixNine {
	public static void main(String[] args) {
		
		System.out.print("10~99 사이의 정수를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		
		/*
		 * count : 3,6,9,의 갯수
		 *  a : 입력받는 정수
		 *  x 는 10의 자리 
		 *  y 는 1의 자리
		 */
		int count = 0, num, a, b;
		num = sc.nextInt();
		
		a = num/10;
		b = num%10;
		
		/// 선생님 
		//3,6,9일떄
		if (a%3 == 0) {
			//카운트증가
			count++;
		}
		if (b%3 == 0&& b !=0) {
			count++;
		}
		if (count ==2) {
			System.out.println("박수짝짝");
		}else if (count==1) {
			System.err.println("박수짝");
		}else {
			System.err.println("박수없음");
			
		}

		
		
		
		
		
		//쳇지피티 정답 안나옴
//		if ((a/10==3||a/10==6||a/10==9)||(a%10==3||a%10==6||a%10==9)) {
//			System.out.println("박수짝짝");
//		}else {
//				if (a%10%3==0) {
//					System.out.println("박수짝");	
//				}
//			}
		} 
}	
	
		
		
		
		// 나 
//		if (a/10==3||a/10==6||a/10==9) {
//		}  if(a%3==0&&a%10!=0){
//			System.out.println("박수짝짝");
//			return;
//		}else {
//			if (a%10%3==0) {
//				System.out.println("박수짝");
//		} 
//		
//			
//		}

//a/10==3||a/10==6||a/10==9
//
//a%10%3==0 && a%10!=0/
//a%10%3==0