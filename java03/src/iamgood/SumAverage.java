package iamgood;

import java.util.Iterator;
import java.util.Scanner;

public class SumAverage {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0, average = 0;
		
		for (int i = 0; i < num; i++) {
			System.out.print("정수를 입력하세여 : ");
			num = sc.nextInt();
			sum +=i;
			if (num == 00) {
				
			}
			average = sum/i;
		}
		System.out.println("합계는 "+sum+"입니다. 평균은 "+average+"입니당.");
		
	}
}
