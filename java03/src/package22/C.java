package package22;

import package21.A;

public class C {
		
	public C() {//생성자
		A a = new A();
		a.filed1 = 2;
//		a.filed2 = 2; // default 다른 패키지에 관여할수없다
//		a.filed3 = 2; // private 다른 패키지에 관여 할 수 없다
		
		a.method1();
//		a.method2();// default 다른 패키지에 관여할수없다
//		a.method3();// private 다른 패키지에 관여 할 수 없다
	} 	
		
		
		
		
		
		
	
	
}
