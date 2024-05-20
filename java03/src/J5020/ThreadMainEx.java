package J5020;

import java.lang.Thread.State;

public class ThreadMainEx {
	public static void main(String[] args) {
		
		//currentThread : 현재실행중인 스레드의 이름 
		String name = Thread.currentThread().getName();
		
		//현재실행중인 스레드의 우선고유 getId();
		long id = Thread.currentThread().getId();//고유 번호 
		
		///현재실행중인 스레드의 우선순위 getPriority()
		int priority = Thread.currentThread().getPriority();
		
		//현재실행중인 스레드의 상태 getState()
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("현재 스레드의 이름 : " + name);
		System.out.println("현재 스레드의 아이디 : " + id);
		System.out.println("현재 스레드의 우선순위값 : " + priority);
		System.out.println("현재 스레드의 상태 : " + s);
	}
}
