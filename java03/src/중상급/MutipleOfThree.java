package 중상급;

import java.util.Scanner;

// for 문이 다른데 같은 i를 공유할수있는건가 ????


public class MutipleOfThree {
	public static void main(String[] args) {
		
		System.out.println("양의 정수 10개를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		int num[] = new int[10];
		int result = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
//			result = num[i];
		}
			System.out.print("3의 배수는 : ");
			for (int i = 0; i < num.length; i++) {
				if ( num[i]%3==0) {
					System.out.print( num[i]+" ");
				
			}
	
		}
		
		
	}
}
//
// 양의 정수를 10개 입력받아 배열에 저장하고, 배열에 있
//는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하
//라.
// *.출력
// 양의 정수 10개를 입력하시오>>1 5 99 22 345 154 
//2346 55 32 85
// 3의 배수는 99 345 2346 
