package J0510;

import java.util.Iterator;
import java.util.Random;

public class RandomTen {
	public static void main(String[] args) {
		
		int n[] = new int[10];
		int sum =0;
		
		for (int i = 0; i < n.length; i++) {
			int r = (int)(Math.random()*10)+1;
			n[i] =r;//난수를 배열에 저장
			sum += n[i];// 배열 원소의 누적합계
		}
		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < n.length; i++) {
			System.err.print(n[i]+" ");
		}
		System.out.println();
		System.out.println("\n평균은 "+(double)sum/n.length);
	}
}	
		
		// 나 
//		int sum =0;
//		double average= 0.0;
//		int num[] = new int[10];
//		Random generator = new Random();
//		
//		for (int i = 0; i < num.length; i++) {
//			num[i] =generator.nextInt(10)+1;
//			 sum+=num[i];
//			 System.out.print(num[i]+" ");
//		}
//		average = (double)sum/num.length;
//		System.out.println("평균은 :"+average);
//	}
//	
//}



//
//정수를10개저장하는배열을만들고1에서10까지범
//위의정수를랜덤하게생성하여배열에저장하라.
//  그리고배열에든숫자들과평균을출력하라.
//  *.출력
// 랜덤한정수들: 8 7 3 4 1 5 3 2 9 9 
// 평균은5.1