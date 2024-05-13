package chapter05_인터페이스2;


//기본 . 180초 동안 부재중이면 타임아웃 
//전화 거는기낭,받는기능,화면에 폰으라고 출력 
interface PhoneInterface{
//	public static final int TIMEOUT=100; // 상수 
	int TIMEOUT=100; // 상수 / public static final생략 가능 
//	public abstract void sendCall();// 추상메소드
	void sendCall(); // public abstract 생략가능 / 추상메소드
	void receiveCall(); // public abstract 생략가능 / 추상메소드
	default void printLogo() {// default(일반메소드)는 구현해야함
		System.out.println("**Phone**");
	}
} 

//삼성폰을 만들떄 기본폰 기능을 사용(걸고 받는것)
class SamsungPhone implements PhoneInterface{
	//추상메소드 오버라이딩 2개 

	@Override
	public void sendCall() {
		System.out.println("삼성폰 딘디리리딘딘");
	}

	@Override
	public void receiveCall() {
		System.out.println("삼성폰 전화왔습니다");
		
	}
	//삼성폰 고유의 기능 
	public void flash() {
		System.out.println("삼성폰 불이 켜진다");
	}
	
}

public class InterfaceEx {
	public static void main(String[] args) {
		
		SamsungPhone phone = new SamsungPhone();
		
		phone.printLogo();// 인터페이스 상속받아서 사용 
		phone.sendCall();// 추상 메소드 구현해서 사용 
		phone.receiveCall();// 추상 메소드 구현해서 사용
		phone.flash();//삼성폰 고유의 기능 
		
//		PhoneInterface p = phone;
//		p.printLogo();
//		p.sendCall();
//		p.
//		
		
		
	}
}
