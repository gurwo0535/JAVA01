package J5020;

//Runnable 인터페이스 상속받아서 구현 
public class TimerRunnable implements Runnable {
int n = 0 ;
	
	@Override
	public void run() {
		while (true) {
			System.out.println(n);
			n++;
			try {
				
				// 상속받는 상위클래스의 확인이 필요 
			Thread.sleep(1000);//1초마다 실행 
				//예외 발생할떄 e로 catch해서 
			} catch (InterruptedException e) {
				
//				printStackTrace : 예외처리할떄의 기본메세지 출력 
				e.printStackTrace();
			}
		}
	}
}