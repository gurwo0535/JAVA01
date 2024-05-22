package J0522;

import java.util.Arrays;

public class MainTest1 {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		//sum()을 넣음으로써 최종연산
		int sumValue = Arrays.stream(arr).sum();
		System.out.println("실행결과 : "+sumValue);
		
		//count() : 리턴타입 long 가진다 
		long count = Arrays.stream(arr).count();
		System.out.println("실행결과 : "+count);
		
		
	}
}
