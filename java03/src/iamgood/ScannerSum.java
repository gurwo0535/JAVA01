package iamgood;

import java.util.Iterator;
import java.util.Scanner;

public class ScannerSum {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("숫자 입력 : ");
		int num2 = scan.nextInt();
		
		int smaller = Math.min(num1, num2);
		int larger = Math.max(num1, num2);
		int sum = 0;
		
		System.out.print("결과 : ");
		
		for (int i = smaller; i <= larger ; i++) {
			System.out.print(i);
			sum += i;
			if (i<larger) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println("합계 : "+sum);
	}
}


//
//• 지시사항 : 2개의 정숫값을 읽어서 두 정수 사이에 있는 모든 정숫값을 작은 것부터 
//큰 순으로 표시하고 두숫자를 포함한 숫자들의 총합을 구하는 프로그램을 작성하시오.
//• 요구사항 (*모두 충족할 것)
//▪ Scanner클래스를 이용하여 숫자 두 개를 입력받아 처리한다. 예를 들어, 5 , 16을 입력하면 5부터 16까지
//예를 들어, 5 , 16을 입력하면 5부터 16까지 출력되고,.
//20,2 를 입력하면 2부터 20까지 순으로 출력되도록 한다.
//▪ 입력하는 두 숫자의 범위에 대한 합계를 출력한다.

//예시
//숫자입력 : 5
//숫자입력 : 3
//결과 : 3 , 4 , 5
//합계 : 1
