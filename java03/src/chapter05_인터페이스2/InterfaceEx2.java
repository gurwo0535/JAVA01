package chapter05_인터페이스2;


interface PhoneInterface2{
	int TIMEOUT=100; 
	void sendCall(); 
	void receiveCall();
	default void printLogo() {
		System.out.println("**Phone**");
	}
} 

//인터페이스 간의 상속 /  implements가 아닌  extends 사용
//문자를 보내고 받는 기능을 추상메소드로 선언 
interface MobilePhoneInterface extends PhoneInterface2{
	void sendSMS();
	void receiveSMS();
}

//MP3Interface : 음악 재생,정지 기능을 추상 메소드로 선언 
interface MP3Interface {
	void play();
	void stop();
}
//계산 기능을 메소드로 구현 
class PDA {
	public int calculate(int x, int y) {
		return x+y;
	}
}

///SmartPhone : 추가로 계산기능 문자전송, 음악 기능을 상속 받음 
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{

	@Override
	public void sendCall() {
		System.out.println("삼성폰 딘디리리딘딘");
	}

	@Override
	public void receiveCall() {
		System.out.println("삼성폰 전화왔습니다");
		
	}

	@Override
	public void play() {
		System.out.println("음악을 연주합니다");
	}

	@Override
	public void stop() {
		System.out.println("음악을 정지합니다");
		
	}

	@Override
	public void sendSMS() {
		System.out.println("문자를 보냅니다");
		
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자를 받습네다");
		
	}
	public void schedule() {
		System.out.println("일정을 관리 합니다 아아앙앙아");
		
	}
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone();
		
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println(phone.calculate(3, 5));
		phone.schedule();
//		phone.TIMEOUT = sam;
		
	}
}
