package J240508_package1;

import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나르 입력하시오 : ");
		String s = sc.next();
		char c = s.charAt(0);
		
//		for (char i ='a'; i <= c; i++) {//abc 계속 반복 (c를 입력)
		
		for (char i =c; i >= 'a'; i--) {//-1 씩 감소하면서 이전 알파벳 출력
//			for (char  j = 'a'; j <= c; j++) {//c까지만 반복 
			
				for (char  j = 'a'; j <= i; j++) { 
					//입력받은 알파벳부터 하나씩 이전 알바펫으로 반복 출력
					//  입력값 c 에서 시작해서 i 까지 반복하는 코드 
				System.out.print(j);
			}
			System.out.println();
		}
	}
}



//중상급2 2중 중첩반복문2 (PrintAlphabet)
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