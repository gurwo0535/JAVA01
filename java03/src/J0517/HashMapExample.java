package J0517;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		
		//Map 컬랙션 : 구조가 키,값으로 구성 
		//업캐스팅 
		//Map인터페이스 타입으로 HashMap클래스 객체 생성 
		//(키:문자열, 값: 정수형이  래퍼클래스이다 )
		Map<String, Integer> map = new HashMap<>();
		map.put("임영웅", 31);
		map.put("양틱", 38);
		map.put("이찬원", 25);
		
		//키는 중복이 안됨 
//		map.put("임영웅", 30);
		
		//값은 중복 허용
		map.put("김호중", 31);
		map.put("정동원", 14);
		
		//Map.Entry 구조로 키,값을 구성 
		System.out.println("총 Entry 수 :"+ map.size());
		
//		map.get() : 키에 해당하는값이 출력된다 
		System.out.println("임영웅 : "+map.get("임영웅"));
		System.out.println();
		
		Set<String> keyset = map.keySet();
		
		Iterator<String> keyiterator =  keyset.iterator();
		
		
		//map 컬랙션 키,값을 가져오는 1번쨰 방식
		while (keyiterator.hasNext()) {//컬랙션 객체가 있으면 참 
			//컬랙션 객체를 가져옴 
			// key만 가져옴 
			String key = (String) keyiterator.next();
			//get()메소드로 map컬랙션의 키를 가지고 값을 가져옴 
			// 값만 가져옴
			Integer value = map.get(key);
			
			//출력 순서는 랜덤으로 발생됨 
			System.out.println("\t"+key+": "+value);
			
		}
		
		System.out.println();
		
		map.remove("임영웅");
		System.out.println("총 Entry 수 :"+ map.size());
		
		
		//Map.Entry 구조로 키/값 객체를 받음
		Set<Map.Entry<String, Integer>> entrySet =  map.entrySet();
		
		//set 컬랙션 방식으로 객체 처리 (키,값을 가져옴 )
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		
		//map 컬랙션 키,값을 가져오는 2번쨰 방식
		while (entryIterator.hasNext()) {
			//컬랙션 객체를 가져옴
			Map.Entry<String, Integer> entry = entryIterator.next();
			//키를 가져옴 
			String key = entry.getKey();
			//값을 가져옴 
			Integer value = entry.getValue();
			
			System.out.println("\t"+key+": "+value);
			
		}
		System.out.println();
		map.clear();
		
		System.out.println("총 Entry 수 :"+ map.size());
	}
}
