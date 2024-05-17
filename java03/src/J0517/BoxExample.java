package J0517;

public class BoxExample {
	public static void main(String[] args) {
		Box box =new Box();
		//업캐스팅
		//Object Object ="홍길동"
		Object box2 =new Box();
		box.set("홍길동");
		//다운캐스팅
		String name =  (String)box.get();
		System.out.println(name);
		
		//업캐스팅
		//Object Object =777
		//Object가 최상위 클래스이기 떄문에 
		// 스트링타입 숫자타입 다 받을수 있음 
		box.set(777);
		//(int)로 다운캐스팅
		int number = (int)box.get();
		System.out.println(number);
		
		//업캐스팅
		//Object Object = new Apple()
		box.set(new Apple());
		//다운캐스팅 
		Apple apple = (Apple) box.get();
		//J0517.Apple@515f550a
		//패키지.클래스@의 해시코드
		System.out.println(apple);
	}
}
