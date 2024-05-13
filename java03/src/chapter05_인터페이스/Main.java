package chapter05_인터페이스;

public class Main {
	public static void main(String[] args) {
//		new Animal(); // 추상 클래스는 객체 생성을 못함 abstract
		Animal a; // 참조변수 선언은 된다 
//		new Bird(); // 추상 클래스는 객체 생성을 못함 abstract
		Penguin p = new Penguin();
		//(wing,walk,eat,life)+swim(인터페이스) 맴버 5개중 수영한다 
		p.swim(); // .을찍고 올라오는건 객체의 맴버 
		
		Bird p2 = new Penguin();// 업캐스팅 
//		p2.swim(); // 업캐스팅은 슈퍼클래스의 맴버만 접근 가능 (오류 발생)
		p2.walk();// 업캐스팅은 슈퍼클래스의 맴버만 접근 가능
		p2.eat();
		System.out.println("------------");
		Penguin p3 =  (Penguin)p2;// 다운캐스팅
		p3.swim();// 다운캐스팅은 모든 맴버에 접근 가능 
		
		Bird d = new Duck();// 업캐스팅
		d.eat();//업캐스팅은 슈퍼클래스의 맴버만 접근 가능 
		Duck d2 =(Duck)d;// 다운캐스팅
		d2.fly();// 다운캐스팅 했으므로 모든 맴버 접근가능 
		
		//추상클래스를 참조변수 선언(슈퍼클래스로 추상클래스이지만 참조변수 선언은 가능 )
		Animal d3 = new Duck();//업캐스팅은 슈퍼클래스의 맴버만 접근가능 
		int x = d3.life;
		System.out.println("x-->"+x);
		
//		new Swim2();// 추상타입이 불가 하듯이 , 인터페이스 타입도 객체 생성 불가 
		
		Swim2 s = new Penguin();// 인터페이스를 참조한 변수 선언 가능/ 
		// 참조클래스와 같이 인터페이스 클래스 이지만 참조변수 선언은 가능 
		s.swim();
		
		
		//인터페이스가 인터페이스 배열 2개를 가리킨다
		//객체배열과 형태가 비슷 
		//s2[0],s2[1]
		Swim2[] s2 = new Swim2[2];// 객체 생성은 못하지만 객체 배열 생성은 가능하다 
		s2[0] = new Penguin();// s2[0] =>참조 변수 , 객체
		s2[1] = new Duck();// s2[1] =>참조 변수 , 객체
		s2[0].swim();
		s2[1].swim();
		
		// 컴파일러 단계는 알수 없고, 런타임 실행시 오류 발견
//	 	s2[2] =  new Penguin();// Index 2 out of bounds for length 2
		// 인덱스 값이 2개인데 s2[2]라는 3번째 인덱스 값을 요구하여 오류가 남 
		
		
		
		
	}
}
