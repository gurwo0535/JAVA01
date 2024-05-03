package J240503_q4;

import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) {
		
		
		
	
		
		
		
		System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
		Scanner sc = new Scanner(System.in);
//		char alphabet = sc.next().charAt(0); 
		
		String aaa = sc.next();	
		 char alphabet = aaa.charAt(0);
		
	
		
		for (char i = alphabet; i >= 'a'; i--) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
	}
}




//상급2 2중 중첩반복문2 (PrintAlphabet)
//1
// Scanner 를 이용하여 소문자 알파벳 하나 입력받고다음
//과같이출력하는프로그램을작성하라.
// 다음은e를입력받았을경우이다.
// *.출력
// 소문자알파벳하나를입력하시오>>e
// abcde
// abcd
// abc
// ab
// a