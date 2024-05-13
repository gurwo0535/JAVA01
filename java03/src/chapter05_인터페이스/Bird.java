package chapter05_인터페이스;


//Bird가 Animal의 상속을 받는다
//객체 생성시 (wing,walk,eat,life) 4개의 맴버 생성 

//추상 클래스에 추상메소드가 없어도됨 (객체 생성 안됨)
abstract class Bird extends Animal {
	public int wing=2; // wing : 필드
	
	public void walk() {
		System.out.println("걷는다");
	}
	public void eat() {
		System.out.println("먹는다");
	}
}
