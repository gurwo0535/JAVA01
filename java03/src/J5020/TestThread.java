package J5020;



public class TestThread {
	public static void main(String[] args) {
		
		//스레드 객체 생성 
		TimerThread th = new TimerThread();
		
		//스레드 실행되면서 JVM 가동
		th.start();
	}
}
