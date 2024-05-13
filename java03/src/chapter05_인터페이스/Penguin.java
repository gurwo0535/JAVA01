package chapter05_인터페이스;

//Penguin이 Bird클래스를 상속 받음

//객체생성시 (wing,walk,eat,life,swim) 5개 맴버 생성 

//public class Penguin extends Bird,Swim : 자바 클래스 다중상속 불가 // 오류
// 인터페이스 다중상속 됨 (implements 키워드 사용)

// 인터페이스 사용후 객체생성시 (wing,walk,eat,life)+swim(인터페이스) 
public class Penguin extends Bird implements Swim2 {

	//인터페이스를 상속받기 위해서 추상 메소드 오버라이드를 사용 
	@Override
	public void swim() {
		System.out.println("펭귄 헤엄 penguin swiming");
		
	}
//	public void swim() {
//	}
}
