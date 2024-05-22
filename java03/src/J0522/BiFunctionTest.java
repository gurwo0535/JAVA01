package J0522;

import java.util.function.BiFunction;

class Calculator{
	public static int add(int a,int b) {
		return a+b;
		
	}
}

public class BiFunctionTest {
	public static void main(String[] args) {
		//U 가뭔가요 ? 
		// apply() 사용법 ? 
		
		//BiFunction<> 매개변수 두개를 받고 하나를 반환 
//		BiFunction<Integer, Integer, Integer> obj = (x1,x2)->x1+x2;
		
		//obj =Calculator::add 객체 = 클레스이름:: 메소드 
		BiFunction<Integer, Integer, Integer> obj =Calculator::add;
		
		//오토 언박싱
		int result = obj.apply(10, 20);
		System.out.println("주어진 수의 덧셈 : "+result);
		
		
	}
}
