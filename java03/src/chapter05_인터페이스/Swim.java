package chapter05_인터페이스;

public class Swim {
	public void swim() {
		System.out.println("차차 헤엄 penguin swiming");
	}
}
// 클래스는 다중상속을 받을수 없다는것을 설명하기 위한 클래스 
// Duck extends Bird implements Swim2, Fly{
// 이런식으로 인터페이스를 사용해 다중상속을 받을수 있게 된다 