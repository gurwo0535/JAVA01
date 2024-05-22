package J0522;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	int price;
	
	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class SteamTest {
	public static void main(String[] args) {
		//업 캐스팅 
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(1, "NoteBook", 100));
		list.add(new Product(2, "TV", 320));
		list.add(new Product(3, "Washing Machine", 250));
		list.add(new Product(4, "Air Conditioner", 500));
		
		List<String> result = list.stream()
		//객체 가격이 300보다 큰 제품을 출력 
		.filter(p->p.price > 300)
		//300초과한제품의 이름 출력 
		.map(p->p.name)
		//리스트 변환 
		.collect(Collectors.toList());
		
		System.out.println("실행결과 : "+result);
		
		
		
		
	}
}
