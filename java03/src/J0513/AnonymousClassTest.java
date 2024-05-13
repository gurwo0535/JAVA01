package J0513;


interface RemoteControl{
	void turnOn();
	void turnOff();
}



public class AnonymousClassTest {
	public static void main(String[] args) {
		//익명 클래스 정의(인터페이스 이름 사용 ->객체 구현)
		// 익명 클래스
		 //부모클래스 변수 = new 부모클래스() {....}; 
		//일회용으로 사용되기떄문에 자식클래스 없이 부모클래스 만으로 
		//객체를 생성해 사용한다 
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("턴온");
			}
			
			@Override
			public void turnOff() {
				System.out.println("턴오프");
				
			}
		};
		//익명클래스 객체의 메소드 호출 
		rc.turnOn();
		rc.turnOff();
	}
}
