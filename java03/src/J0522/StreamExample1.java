package J0522;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		System.out.println("입력데이터 : "+numbers);
		
		// 스트림으로 만듬 
//		numbers.stream();
		
//		filter()로 짝수만출력 
//		실행결과 : [2, 4, 6, 8]
		List<Integer> result = numbers.stream()
		.filter(n->{return n%2 == 0;})
		
//	 	 map()로 제곱 
		.map(n->{return n*n;})
		
		// 스트림객체를 리스트로 변환 /최종연산 
		.collect(Collectors.toList());
		
		//실행결과 : [4, 16, 36, 64]
		System.out.println("실행결과 : "+result);
	}
}
