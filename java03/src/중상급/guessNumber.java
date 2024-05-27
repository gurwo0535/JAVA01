package 중상급;

import java.util.Scanner;

public class guessNumber {
	public static void main(String[] args) {
		int numberToGuess;
		int guess;
		Scanner scanner = new Scanner(System.in);
		numberToGuess = (int)(Math.random()*10)+1; 
		
		System.out.print("추측한 숫자를 입력하세요 :");
		guess = scanner.nextInt();
			
		while (guess!=numberToGuess) {
			System.out.print("추측한 숫자를 입력하세요 :");
			guess = scanner.nextInt();
		
		
		if (guess!=numberToGuess) {
			System.out.println("추측한 숫자가 틀렸습니다");	
		}else {
			
		}
		else if (guess<=numberToGuess) {
			System.out.println("쪼메 작네예");			
		}
		
		System.out.println("if 맞아여");
	}
	}
}
else if (guess>=numberToGuess) {
	System.out.println("넘모 큽네다");		
}

//*.main 메소드 설계
// 변수들
// numberToGuess: 사용자가 맞추려고 노력하는 숫자
// guess: 사용자가 추측한 숫자
// 알고리즘
// (1) 1부터 10사이의 정수를 임의로 만든다
// (2) 사용자에게 추측한 숫자를 입력하라고 요청하는 메시지를 출력한다
// (3) 사용자가 추측한 숫자를 읽어 들인다
// (4) 추측한 숫자가 틀린 동안 다음을 반복하고 맞으면 (5)번으로 간다
// 4.1 추측한 숫자가 틀렸다는 메시지를 출력한다
// 4.2 추측한 숫자가 너무 크거나 너무 작다는 메시지를 출력한다
// 4.3 사용자에게 추측한 숫자를 입력하라고 요청하는 메시지를 출력한다
// 4.4 사용자가 추측한 숫자를 읽어 들인다
// (5) 사용자가 추측한 숫자가 맞았다는 메시지를 출력한다