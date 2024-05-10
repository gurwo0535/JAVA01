package J0510;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		
		//Random() 사용 
		int rNumber;
		Random generator = new Random();
		
//		generator.nextInt();//난수발생(범위:int타입)
//		generator.nextInt(10);//난수발생(0~9)
//		generator.nextInt(10)*(-1);//난수발생(-9~0)
		
		while (true) {
			rNumber = generator.nextInt(10)+1;
			System.out.println(rNumber);
			if (rNumber == 7) {
				break;
			}
		}
		
	}
}
	
		
		
		// 나 Math.random(); 사용 

//		while (true) {
//			int n = rNumber(); 
//			System.out.println(n);
//			if (n == 7) {
//				System.out.println("종료합니다");
//				break;
//			}
//		}
//				
//	}
//	public static int  rNumber() {
//		
//		double x = 10 * Math.random();
//		
//		int temp = (int)x;
//		
//		return temp+1;
//		

//
//중상급7 1부터10까지의
//숫자맞추기(RandomNumber)
//  *.main 메소드설계
//변수들
// rNumber: 1부터10사이의임의의정수
//알고리즘
// (1) 1부터10사이의정수를임의로만든다
// (2)숫자를출력한다.
//  (3) 7이라는숫자가출력되면종료한다.