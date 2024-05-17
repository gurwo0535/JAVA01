package J0517;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


class AA {}

public class HashSetEXample {
	public static void main(String[] args) {
	
	//set 인터페이스 컬랙션 타입으로 HashSet클래스 객체 생성 
	 Set<String> set = new HashSet<>();

		
//	 Set<Object> set = new HashSet<>();
	 set.add("Java");
	 set.add("JDBC");
	 set.add("1Batis");
	 set.add("Servlt/JSP");
	 
	 //set 컬랙션 객체를 중복 저장 불가
//	 set.add("Java");
	 
	 AA a = new AA();
	 
	 //Object 타입으로 사용가능
//	 set.add(a); 
	 
	 
	 int size = set.size();
	 System.out.println("총 객체수 :" +size);
	 
	 // set컬랙션은 iterator메소드를 호출해서 
	 // Iterator 인터페이스 타입으로 값을 받음 
	 Iterator<String> iterator = set.iterator();
	 
	 //while 두번쨰 누르면 
	 //iterator 형식의 while 문이 나옴 
	 //element 참조변수 명만 바꿔서 사용 
	 while (iterator.hasNext()) {
		String element = (String) iterator.next();
		System.out.println("\t"+element);
		
	 }
	 set.remove("JDBC");
	 
	 System.out.println("총 객체수 :" +set.size());
	 
	 for (String element : set) {
		 System.out.println("\t"+element);
		
	}
	 
	 //객체가 하나라도 있는지 조사 
	 if (set.isEmpty()) {
		System.out.println("비어있음");
	} else {
		System.out.println("객체 있음");

	}
	 
	 //저장된 모든 객체를 삭제
	 set.clear();
	 
	 if (set.isEmpty()) {
		 System.out.println("비어있음");
	 } else {
		 System.out.println("객체 있음");
		 
	 }
	}
}
