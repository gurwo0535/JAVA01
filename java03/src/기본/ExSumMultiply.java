package 기본;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		
		System.out.print("3자리수 정수 입력(100-999) : ");
		
		Scanner scanner = new Scanner(System.in);
		int num =scanner.nextInt();
		
		int num100 = num/100;
		int num10 = (num-num100*100)/10;
		int num1 = (num-num100*100)%10;
		
		while (num>99 && num<1000) {
			if (num100 != 0) {
				System.out.println("100의 자리와 10의 자리의 합은 :"+(num100+num10));
				System.out.println("10의 자리와 1의 자리의 곱은 :"+(num10*num1));
			}
			break;
		}
		
		
	}
}


// Scanner 클래스를 이용하여 3자리의 정수(100~999사이)
//를입력받고, 백의 자리와십의자리는합하고,10의자
//리와1의자리를곱하기를출력하는프로그램을작성하
//라.
// *.출력
// 3자리수정수입력(100~999)>>321
// 100의 자리와 10의 자리의합은5
// 10의 자리와1의자리의곱은2