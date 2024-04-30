package java240430_cha03;

import java.util.Scanner;

/*
 * 정수를 입력받음
 * 입력받은 갯수와 평균 출력
 * 마지막에 -1을 입력 중단
 * 
 * 
 */

//스캐너 갯수 증가 , 
public class WhileExample {
	public static void main(String[] args) {
		
		int count = 0;
		int sum = 0;
		
		System.out.print("정수를 입력하고 마지막에 -1을 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		n이 -1이 아닐떄까지 반복
		while (n != -1) {
//			sum = sum+n; == sum += n;
			sum += n; 
//			입력받은 갯수를 증가
			count++;
			 n = sc.nextInt();
			
		}
		
		if (count==0) {
			System.out.println("입력된 수가 없습니다.");
		} else {
			System.out.println("정수의 갯수는 "+ count + "개 이며 ");
			System.out.println("평균은 "+(double)sum/count+"이다.");
		}
	}
}
