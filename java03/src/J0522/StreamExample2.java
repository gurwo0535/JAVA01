package J0522;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//List<String>
//map의 사용법 알아보자 

public class StreamExample2 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java","Stream","Library");
		System.out.println("입력데이터 : "+words);
		
		//스트림 생성
//		words.stream();

		 
		List<Integer> result = words.stream()
		//메소드 참조로 문자열 길이 구함 
		.map(String::length)
		//리스트 생성 
		.collect(Collectors.toList());
		
		System.out.println("실행결과 : "+result);
	}
}
