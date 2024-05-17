package J0517;

public class BoxExample2 {
	public static void main(String[] args) {
		
		//제네릭 타입파라미터 : String
//		Box2<String> box1 = new Box2<String>();
		
		//new Box2<>() 뒤쪽 제니릭 타입은 생략 가능 
		//자바 7부터
		Box2<String> box1 = new Box2<>();
		
		box1.set("Hello~");
		
		// 컴파일 단계에서 제네릭 타입 감지
		//string인데 777int 타입을 넣으니 오류
//		box1.set(777);
		
		//불필요한 타입변환이 생기지않는다.
		String greet = box1.get();
		System.out.println(greet);
		
		Box2<Integer> box2 = new Box2<>();
		
		//현재Integer타입인데 string타입을 넣으니 오류
//		 box2.set(hello);
		
		 box2.set(777);
		 //auto unboxing
		 int value = box2.get();
		 System.out.println(value);
		 
		 
	}
}
