package chapter02;

import java.util.Scanner;

//점수를 입력받아서 80점이상 이면 합격 

public class SuccessOrFail {
	public static void main(String[] args) {
		
		System.out.print("점수를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
//		if (score>=80) 
//			System.out.println("축하합니다???? 합격입니다.");
		if (score>=80) System.out.println("축하합니다???? 합격입니다.");
		
		
		
		
		
		sc.close();
	}
}
