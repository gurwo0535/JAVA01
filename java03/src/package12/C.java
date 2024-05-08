package package12;

//다른 패키지에서 접근할떄 import
import J240508_pakage11.A;

public class C {
	A a1= new A(true);
	//default 접근지정자는 다른패키지에서 접근 불가 
//	A a2= new A(1); // 패키지가 달라서 가져오지못함 
	
//	A a3 = new A("문자열");//private 접근지정자 이기떄문에 가져오지 못함 (자기 클래스만 접근가능)
}
