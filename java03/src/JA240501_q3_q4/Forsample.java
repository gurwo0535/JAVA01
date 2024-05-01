package JA240501_q3_q4;

import java.util.Iterator;

public class Forsample {
	public static void main(String[] args) {
		int sum = 0;
		
		
		
		// 선생님 
		
		for (int i = 1; i < 11; i++) {
			if (i<10) {
				System.out.print(i+"+");				
			} else {
				System.out.print(i+"=");
			}
			sum+=i;
		}
		System.out.println(sum);
		
	
		
		
		
		//나
//		for (int i = 1; i < 11; i++) {
//		System.out.print(i);
//			sum +=i;
//			if (i<10) {
//				System.out.print("+");
//			}
//		}
//		System.out.println("="+sum);
		
	}
}


//중급B 3 : for 문을 이용하여 1부터 10까지 합 출력 (ForSample)
//1
//for문을 이용하여 1부터 10까지 덧셈을표시하고합을구하시오.
//1+2+3+4+5+6+7+8+9+10=55