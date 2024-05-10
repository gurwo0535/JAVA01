package J0510;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
	public static void main(String[] args) {
		
		
		// 선생님 
		Scanner sc = new Scanner(System.in);
		int numberToGuess;
		int guess;
		Random generator = new Random();
		numberToGuess = generator.nextInt(10)+1;
		System.out.print("추측한숫자를 입력하세요 : ");
		
		guess = sc.nextInt();
		while (guess!=numberToGuess) {
			System.out.println("허접~");
			if (guess>numberToGuess) {
				System.out.println("추측한 숫자가 너무 큽네다");
			} else {
				System.out.println("추측한 숫자가 너무 작습니다");
			}
			System.out.print("추측한숫자를 입력하세요 : ");
			guess = sc.nextInt();
		}
		System.out.println("축하");
		sc.close();
	}
}		
		
		// 나 
//		int numberToGuess;
//		int guess;
//		Random generator = new Random();
//		numberToGuess = generator.nextInt(10)+1;
//		
//		System.out.print("추측한숫자를 입력하세요 : ");
//		
//		while (true) {
//			guess = sc.nextInt();
//			if (numberToGuess==guess) {
//				System.out.println("축하");
//				break;	
//			}if (numberToGuess>guess) {
//				System.out.println("추측한 숫자가 너무 작습니다");
//			}if (numberToGuess<guess) {
//				System.out.println("추측한 숫자가 너무 큽네다");		
//			}
//		}
//		
//}
//}


//중상급9 1부터 10까지의
//숫자맞추기(guessNumber)
// 1
//  *.main 메소드 설계
// 변수들
// numberToGuess: 사용자가 맞추려고 노력하는 숫자
// guess: 사용자가추측한숫자
// 알고리즘
// (1) 1부터10사이의정수를임의로만든다
//추측한숫자를입력하세요: 9
//추측한숫자가 틀렸습니다
//추측한숫자가 너무큽니다
//추측한숫자를입력하세요: 3
//추측한숫자가 틀렸습니다
//추측한숫자가 너무작습니다
//추측한숫자를입력하세요: 5
//추측한숫자가 틀렸습니다
//추측한숫자가 너무작습니다
//추측한숫자를입력하세요: 6
//맞추셨습니다
// (2) 사용자에게추측한숫자를입력하라고요청하는메시지를출력한다
// (3) 사용자가추측한숫자를읽어들인다
// (4) 추측한숫자가틀린동안다음을반복하고맞으면(5)번으로간다
// 4.1 추측한숫자가틀렸다는메시지를출력한다
// 4.2 추측한 숫자가 너무크거나너무작다는메시지를출력한다
// 4.3 사용자에게추측한숫자를입력하라고요청하는메시지를출력한다
// 4.4 사용자가추측한숫자를읽어들인다
// (5) 사용자가추측한숫자가맞았다는메시지를출력한다