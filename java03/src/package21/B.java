package package21;

public class B {
	public B() {
		A a=new A();
		a.filed1=2;
		a.filed2=2;
//		a.filed3=2;//private 맴버는 자기클래스 안에서만 접근됨 //에러 남
		
		a.method1();
		a.method2();
//		a.method3();//private 맴버는 자기클래스 안에서만 접근됨 //에러 남
	}
}
