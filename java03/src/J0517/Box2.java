package J0517;

// 대문자 T를 타입파라미터로 받은 제네릭
public class Box2<T> {
	// 전체적으로 T가 String 타입이 된다 
	
	//타입파라미터를 t의 타입으로사용
	//3.Hello
	private T t;
	
	//타입파라미터를 메소드의 리턴타입으로 사용
	public T get() {
		return t;
	}
	
	//타입파라미터를 메소드의 매개변수 타입으로 사용
	public void set(T t) {//1.Hello
		this.t = t;//2.Hello
	}
}
