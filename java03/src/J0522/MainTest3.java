package J0522;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainTest3 {
	
	public static void main(String[] args) {
		List<String> sList = new ArrayList<>();
		sList.add("Tomas");
		sList.add("EdWrad");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		//Tomas EdWrad Jack 
		stream.forEach(s->System.out.print(s+" "));
		System.out.println("\n---------------------");
		
		
		//.sorted()를 사용하여 오름차순으로 변경 /EdWrad Jack Tomas 
		 sList.stream().sorted().
		 forEach(s->System.out.print(s+" "));
		 System.out.println("\n---------------------");
		
		 
		 //map(s->s.length())를 사용하여 각 문자열의 길이를 구함 
		 sList.stream().map(s->s.length()).
		 forEach(s->System.out.print(s+" "));
		 System.out.println("\n---------------------");
		 
		 //Tomas EdWrad // 5글자 이상 
		 sList.stream().filter(s->s.length()>=5).
		 forEach(s->System.out.print(s+" "));
	}
	
}
