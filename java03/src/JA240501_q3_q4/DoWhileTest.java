package JA240501_q3_q4;

public class DoWhileTest {
	public static void main(String[] args) {
		
		int a = 0;
		int num = 0;
	
		// 선생님
		do {
			if (a>99) {
				break;
			}
			num+=a;
			a+=2;
		} while (true);
		System.out.println("짝수들의 합은 : " + num);
		
		// 나 
//		do {
//			num=num+a;
//			a+=2;
//
//		} while (a<100);
//		
//		System.out.println("짝수들의 합은 : " + num);
	}
}


//급B 7 DoWhile (DoWhileTest.java)
//1
// DoWhile 을 이용하여 0부터 시작하여99까지의짝수들
//의합을계산하라.
// *.출력
// 2450