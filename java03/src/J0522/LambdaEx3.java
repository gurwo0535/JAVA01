package J0522;

interface MyFuntion3{
	//매개변수 없는 추상 메소드 
	void print();
}

public class LambdaEx3 {
	public static void main(String[] args) {
		
		//매개변수는 없지만 객체를 가르키는 구조로 만들어진다  ? 
		// 추상메소드에 매개변수가 있다면 숫자 ,없다면 문자열을 호출하는 방식인가 ?
		
		MyFuntion3 f = () ->{System.out.println("Hello");};
		
		//f객체에서 print메소드 호출 // 람다식 호출
		f.print();
		
		//람다식 재작성 / 람다식 초기화 
		f = () ->{System.out.println("안녕");};
		f.print();
	}
}
