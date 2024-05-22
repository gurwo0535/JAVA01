package J0522;

import java.util.function.Supplier;

public class InstanceMethod {
	
	//Supplier 인터페이스 / 매개변수는 없고, 반환값만 있음 
	
	static void print(Supplier<Integer>f) {
		System.out.println(f.get());
		
	}	
	public static void main(String[] args) {
		
		String s= "Hello World!";
		//s의 길이 
		System.out.println(s.length());
		
		//Supplier<Integer> f = s.length()
		print(()-> s.length());
		
		
		//메소드 참조 / 클래스(참조변수:메소드 ) ?? 이거 맞나 ?
		print(s::length);
	}
}
