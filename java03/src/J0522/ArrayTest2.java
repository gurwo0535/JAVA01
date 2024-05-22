package J0522;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayTest2 {
	public static void main(String[] args) {
		
		String[] a = {"a","b","c","d"};
		int[] b = {1,5,5,7,3,3,42,6,8,45323,4,63,2,1};
		
		//(Arrays.asList(a)) : 배열 객체를 리스트로 전환 
		System.out.println(Arrays.asList(a));
		
		//list 객체 생성 제니릭 타입 
		List<String> list = Arrays.asList(a);
		
		System.out.println("@# list.get(0)==> "+list.get(0));
		
		//sort(b, 4, 14) : b배열의 4번부터 14번까지 오름차순 정렬 
		Arrays.sort(b, 4, 14);
		
		//toString으로 형변환 
		System.out.println(Arrays.toString(b));
//		{1,5,5,7,3,3,42,6,8,45323,4,63,2,1};	
//		---->
		//[1, 5, 5, 7, 1, 2, 3, 3, 4, 6, 8, 42, 63, 45323]
		
		// 첫값부터 오름차순 정렬로 초기화 
		Arrays.sort(b);
//		 ==>  [1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 42, 63, 45323]
		System.out.println(Arrays.toString(b));
		
		// a배열을 내림차순으로 정렬 
		Arrays.sort(a, Collections.reverseOrder());
		
//		{"a","b","c","d"} ==> [d, c, b, a] 
		System.out.println(Arrays.toString(a));
		
		// 다시 오름차순으로 초기화 
		Arrays.sort(a);
//		[d, c, b, a]  ==> [a, b, c, d]
		System.out.println(Arrays.toString(a));
		
//		--> 인덱스 2번부터 인덱스 4번 전까지의 
		Arrays.sort(a,2,4,Collections.reverseOrder());
		//[a, b, c, d] ==> [a, b, d, c] 
		
		System.out.println(Arrays.toString(a));
		
		String[] cc = {"11","12","13","23","53","223","145","53"};
		
		// 기본 배열의 53을 가장 큰 수로 인식후 
		// 첫째자리를 보고 내림차순으로 정렬 시킴 
		Arrays.sort(cc, Collections.reverseOrder());
		//[53, 53, 23, 223, 145, 13, 12, 11]
		System.out.println(Arrays.toString(cc));
		
		//배열객체 b를 c로 복사 
		int[] c = Arrays.copyOf(b, b.length);
		//[1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 42, 63, 45323]
		System.out.println(Arrays.toString(c));
		
		// 배열 객체 a를 인덱스 크기 3인 배열로 복사 후 d에 저장 
		String[] d = Arrays.copyOf(a, 3);
		//[a, b, d]
		System.out.println(Arrays.toString(d));
		
	}
}	
