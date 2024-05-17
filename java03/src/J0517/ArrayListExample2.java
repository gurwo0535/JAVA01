package J0517;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
		
	//ArrayList클래스 타입으로 ArrayList 클래스로 
		//객체생성 (제니릭타입 파라미터 string)
	ArrayList<String> array = new ArrayList<>();
	boolean aaa = array.add("oracle");
	System.out.println(aaa);
	boolean bbb = array.add("my sql");
	System.out.println(bbb);
	
	//중복된 객체를 추가해도 문제 없음 .
	boolean ccc = array.add("oracle");
	System.out.println(ccc);
	
	for (int i = 0; i < array.size(); i++) {
		String str = array.get(i);
		System.out.println(i+": "+ str );
		
	}
}
}
