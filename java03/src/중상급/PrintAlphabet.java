package 중상급;

import java.util.Scanner;

//charAt(0); 
//지정한 인덱스에서 char 값을 반환합니다. 
//인덱스의 범위는 0에서 length() - 1입니다. 
//배열 인덱싱의 경우 시퀀스의 첫 번째 char 값은 
//인덱스 0, 다음은 인덱스 1 등입니다

public class PrintAlphabet {
	public static void main(String[] args) {
		
		System.out.print("소문자 알파벳 하나를 입력하시오>> ");
		Scanner scanner = new Scanner(System.in);
		char alphabet = scanner.next().charAt(0);
		
		 //  abcde
		// abcd
		// abc
		// ab
		// a
		
//for(아스키 코드 사용하므로 char i = 입력한 알파벳부터 작아져야 하므로 시작점 alphabet;
//	i >= alphabet값부터 a까지 작아져야 하므로 'a'; 줄어들기 떄문에 i--) {
// for(char j = a부터 커지므로 'a'; j<= 한개씩 줄어드는 i값에 맞추기 위해 i; j++)
//		}
			
		for (char i = alphabet; i >= 'a' ; i--) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}
}


//Scanner 를 이용하여 소문자 알파벳 하나 입력받고 다음
//과 같이 출력하는 프로그램을 작성하라.
// 다음은 e를 입력받았을 경우이다.
// *.출력
// 소문자 알파벳 하나를 입력하시오>>e
// abcde
// abcd
// abc
// ab
// a