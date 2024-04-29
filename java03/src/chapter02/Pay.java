package chapter02;

import java.util.Scanner;

//시간을 입력받아서 임금 계산 
public class Pay {
	public static void main(String[] args) {
		
		final int RATE = 10000;
		int pay;//급여
		
		System.out.print("총 근무시간은 : ");
		Scanner sc =new Scanner(System.in);
	int hour= sc.nextInt();
	
	
	
//	8시간 이하는 변동 없음 
//	8시간 이상 : 1.5 배
//	
	if (hour > 8) {
		pay =(int)(RATE* 8 +(RATE * (hour - 8)*1.5));
	} else {
		pay = hour * RATE;
	}
	System.out.println("삐빅.. 급여는 "+ pay + "입니다.");
	}
}
