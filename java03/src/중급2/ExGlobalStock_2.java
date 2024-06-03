package 중급2;

import java.util.Scanner;

public class ExGlobalStock_2 {
	public static void main(String[] args) {
		
	int medo,mesu = 0,yangdo=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("매수금액을 입력하시오 :");
		mesu = scanner.nextInt();
		System.out.print("매도금액을 입력하시오 :");
		medo = scanner.nextInt();
		yangdo = (medo-mesu)*22/100; 
		
		if (medo<=mesu) {
			yangdo = 0;
		}
		System.out.println("양도세 : " +yangdo);
	}
}
