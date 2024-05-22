package J0522;

@FunctionalInterface
//제네릭 타입 T를 가진 함수형 인터페이스 
interface MyFuntion5<T>{
	
	//제네릭 타입 T를 매개변수로 받음
	void print(T x);
	
	// 인터페이스 안에서 추상메소드 2개 사용시 오류 발생 
//	void print2(T x);
}

public class LambdaEx5 {
	public static void main(String[] args) {
		MyFuntion5<String> f1 = (x) -> System.out.println(x);
		f1.print("ABC");
		
		MyFuntion5<Integer> f2 = (x) -> System.out.println(x);
		//Integer 객체를 람다식에 넘겨준다 .
		//----------------
		// 오토 박싱 이란다 
		// 오토 박싱 : 생략 인가 ?
		f2.print(Integer.valueOf(100));
		//f2.print(100); // 이거랑 뭐가 다름 ??
	}
}
