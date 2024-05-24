package 중급;

public class ForTest {
public static void main(String[] args) {
	int sum = 0 ;
	for (int i = 0; i < 100; i++) {
		if (i%2 ==0) {
			sum +=i;
		}
	}
	System.out.println(sum);
}
}



//for 을 이용하여0부터시작하여99까지의짝수들의합
//을계산하라.
//  *.출력
// 2450