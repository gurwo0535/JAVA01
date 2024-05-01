package JA240501_q3_q4;

import java.util.Iterator;
import java.util.Scanner;

public class PrintAsterisk {
	public static void main(String[] args) {
		
		System.out.print("정수를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		
		//i가 y축 , j가 x축 
		
//		for (int i = 0; i <= num; i++) {
		//감소시키는 로직을 위해 역으로 진행
			for (int i = num; i >0; i--) {
				//하나씩 줄이기 위해 i값 사용
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}		
		
		
		
		// 나 못품 
		// 첫쨰 줄 *****만 나옴 
//		for (int i = 0; i < num; i++) {
//			for (int j = num; j < num; j++) {
//				
//				System.out.print("*");
//			}
//			System.out.print("*");
//		}





//중급C 2 : 2중 중첩반복문(PrintAsterisk)
// Scanner 를 이용하여 정수를 입력받고다음과같이*를
//출력하는프로그램을작성하라.
// 다음은5를입력받았을경우이다.
// *.출력
// 정수를입력하시오>>5
// *****
// ****
// ***
// **
// *