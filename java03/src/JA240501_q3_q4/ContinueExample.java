package JA240501_q3_q4;

import java.util.Iterator;
import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		
		System.out.println("정수를 5개 입력하시오 : ");
		
	
		
		// 선생님  양수일떄의 코딩
		int n, sum =0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			if (num>=0) {
				sum+=num;
			}
		}
		
		
		
		
		/// 쳇지피티   음수일떄 continue를 사용하는 코딩
//		Scanner sc = new Scanner(System.in);
//		int sum= 0;
//		
//		for (int i = 0; i < 5; i++) {
//			int num = sc.nextInt();
//			
//			if (num<=0) {
//				continue;
//			}
//			sum += num;
//		}
//		
		
		System.out.println("양수의 합은 : "+ sum);
	}
}

		//나 답 안나옴
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int d = sc.nextInt();
//		int e = sc.nextInt();
//	
//		int sum = 0;
//		
//		if (a>0) {
//			sum = sum+a;
//		}  if (b>0){
//			sum = sum+b;
//		} if (c>0){
//			sum = sum+c;
//		} if (d>0){
//			sum = sum+d;
//		} if (e>0){
//			sum = sum+e;
//		}
