package J5020;

public class TimerThread extends Thread{
	int n = 0 ;
	
	@Override
	public void run() {
		while (true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000);//1초마다 실행 
				//예외 발생할떄 e로 catch해서 
			} catch (InterruptedException e) {
				
//				printStackTrace : 예외처리할떄의 기본메세지 출력 
				e.printStackTrace();
			}
		}
	}
	

}
