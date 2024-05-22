package J0522;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MainTest4 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//mapToInt : 기본형을 int 타입으로 변환 
		//리스트를 스트림으로 생성하고 int 로 변환하여 합계를 구함 
		 int sum1 = list.stream().mapToInt(n->n).sum();
		 // IntStream.of : 정수를 스트림으로 생성
		 int sum2 = IntStream.of(20,10,30).sum();
		 
		 System.out.println(sum1);
		 System.out.println(sum2);
		 
		 
		
	}
}
