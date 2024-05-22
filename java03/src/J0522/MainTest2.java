package J0522;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//list를 사용하는 이유 좀더 알아보자 .

public class MainTest2 {
	public static void main(String[] args) {
		
		//list를 사용하는 이유는 자유성 떄문 
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 8; i++) {
			list.add(i);
		}
		// 왜 배열이 나옴?????????????
//		/[0, 1, 2, 3, 4, 5, 6, 7]
		// 배열이 아니고 list를 사용하여 []가 자동으로 감싸주는것 
		
		System.out.println(list);
		
		//왜 스트림으로 받는다고 ?
		Stream<Integer> myStream = list.stream();
		
		//중간연산이 filter나 map이 오고
		myStream.filter(s->s>=5)
		
		//마지막 연산으로 forEach가 왔다
		//마지막연산 (collect,sum,count ... )
		.forEach(n->System.out.println(n));
		
		//스트림을 생성하더라도 list 원 데이터는 바꿔지않는다 .
		System.out.println(list);
		
		
	}
}
