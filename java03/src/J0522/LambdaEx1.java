package J0522;


//람다식을 구현할 함수형 메소드 
interface MyFuntion{
	//람다식을 구현할 추상메소드 :calc(int x, int y)
	int calc(int x, int y);
}

public class LambdaEx1 {

	public static void main(String[] args) {
		
		MyFuntion add = (x,y)->{return x+y;}; // 람다식 
		
		 // 람다식 {중괄호}와 return은 생략 가능 
		MyFuntion minus = (x,y)-> x-y;
		
		//합구하기 (람다식 객체에서 calc 메소드 호출 )
		System.out.println(add.calc(1, 2));
		
		//차 구하기 (람다식 객체에서 calc 메소드 호출 )
		System.out.println(minus.calc(1, 2));
		
		
		
	}
	
}
