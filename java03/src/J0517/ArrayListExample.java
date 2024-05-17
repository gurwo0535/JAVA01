package J0517;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		////List 컬렉션에서 ArrayList거 클래스로 객체 생성 
		// (제네릭 타입파라미터를 string)
		// 업캐스팅
		List<String> list =  new ArrayList<>(); // List에 커서 위치하고 컨트롤 T 
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlt/JSP");
		
		// 2번자리에 Database를 넣는다
		list.add(2, "Database"); 
		list.add("Spring"); 
		
		int size = list.size();
		System.out.println("총 list 의 갯수 : "+size);
		
		String skill =  list.get(2);
		
		System.out.println("2번쨰 인덱스 : "+ skill);
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ " : "+str);
		}
		
		System.out.println();
		
		//인덱스로 객체를 삭제했다
		list.remove(2);
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ " : "+str);
		}
		
		
		System.out.println();
		
		list.remove("Spring");
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ " : "+str);
		}
	}
}
