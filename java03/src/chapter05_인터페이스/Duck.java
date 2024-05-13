package chapter05_인터페이스;



//인터페이스 사용후 객체생성시 (wing,walk,eat,life)+swim(인터페이스)
public class Duck extends Bird implements Swim2, Fly{

	@Override
	public void swim() {
		System.out.println("오리 헤엄 duck swiming");
	}

	@Override
	public void fly() {
		System.out.println("오리 날다 duck fly");
		
	}
	
}
