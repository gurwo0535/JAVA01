package J240508_package1;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하시오 : ");
		int intArray[] = new int[10];
		
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
		}
		System.out.print("3의 배수는 : ");
		for (int i = 0; i < intArray.length; i++) {
				if (intArray[i]%3==0) {
					System.out.print (intArray[i]+" ");
				}
			}
		
	}
	
}		
		
		
		
		///나 
//		System.out.print("양의 정수를 입력하시오 : ");
//		Scanner scan = new Scanner(System.in);
//		
//		int intArray[] = new int[10];
//		
//		int baesu = 0;
//		
//		for (int i = 0; i < intArray.length; i++) {
//			intArray[i] = scan.nextInt();
//			
//			if (i==0) {
//				System.out.print("3의 배수는 : ");
//				
//			}
//			
//			if (intArray[i]%3==0) {
//				baesu = intArray[i];
//				System.out.print (baesu+" ");
//			} 
//		}



//중상급5 배열과반복문(MutipleOfThree)
//1
// 양의정수를10개입력받아배열에저장하고, 배열에있
//는정수중에서3의배수만출력하는프로그램을작성하
//라.
// *.출력
// 양의정수10개를입력하시오>>1 5 99 22 345 154 
//2346 55 32 85
// 3의 배수는99 345 2346 