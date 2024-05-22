package J0522;

//추상메소드 2개 
//매소드 매겨변수로 인터페이스를 받음 
//함수형 인터페이스
//MyFuntion4 f 함수형 인터페이스를 매개변수로 받는다
interface MyFuntion4{
	int calc(int x, int y);
}
public class LambdaEx4 {
	public static void main(String[] args) {
		printMultiply(3, 4, (x,y)->x*y);
		
	}
	//MyFuntion4 f 함수형 인터페이스를 매개변수로 받는다
	//매소드 매겨변수로 인터페이스를 받음
	static void printMultiply(int x, int y,MyFuntion4 f) {
		
		//f로 (x,y)->x*y 람다식 받음
		// == 
		//MyFuntion4 f = (x,y)->x*y
		System.out.println(f.calc(x, y));
	}
}
