package J0522;

import java.util.Scanner;


//[김현영] [오후 2:03] 메소드는
//[김현영] [오후 2:03] 계속중복으로
//[김현영] [오후 2:03] 쓰이는 규칙보임?
//[김현영] [오후 2:03] 이런거 추상메서드로 만들어서
//[김현영] [오후 2:03] 구현해서쓰면
//[김현영] [오후 2:03] 오버라이드 업캐스팅 개념
//[김현영] [오후 2:03] 복습 한번더되네?

class Add{
	int a; int b;
	public void setValue(int a,  int b) {
		this.a = a;
		this.b = b;
		
	}// 리턴값 int 도 가능 
	public Object calculate() {
		return a+b;
	}
}
class Sub{
	
	int a; int b;
	public void setValue(int a,  int b) {
		this.a = a;
		this.b = b;
		
	}
	public Object calculate() {
		return a-b;
	}
}
class Mul{
	int a; int b;
	public void setValue(int a,  int b) {
		this.a = a;
		this.b = b;
		
	}
	public Object calculate() {
		return a*b;
	}
}
class Div{
	int a; int b;
	public void setValue(int a,  int b) {
		this.a = a;
		this.b = b;
		
	}
	public Object calculate() {
		// 0이 입력되었을경우 오류가 발생하기에 
		// try catch 문으로 오류가뜨는것을 예방한다 
		int res = 0;
		try {
			res = a/b;
		} catch (Exception e) {
			System.out.println("0으로 나눌수 없습니다");
			return 0;
		}
		return res;
	}
}

public class Calc {
	public static void main(String[] args) {
		
		System.out.print("두 정수와 연산자를 입력하시오 : ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		String obj = scanner.next();
		// 밑의 코딩처럼 짜는것도 가능하다.
//		char operator = scanner.next().charAt(0);
		
	
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		switch (obj) {
		case "+":
			add.setValue(a, b);
			System.out.println(add.calculate()); 
			break;
		case "-":
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
		case "*":
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		case "/":
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;

			default: // 사직연산 외의 것을 입력할시 
				System.out.println("잘못된 연산자 입니다.");
				break;
		}
		
	}
}


//다수의클래스를만들고활용하는연습을해보자.
// 더하기(+), 빼기(-), 곱하기(*), 나누기(/)를 수행하는 각 클래스 Add, Sub, 
//Mul ,Div 를 만들어라.
// 이들은모두다음필드와메소드를가진다.
// int 타입의 a, b 필드: 2개의 피연산자
// void setValue(int a, int b): 피연산자 값을 객체 내에 저장한다.
// int calculate(): 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.
//Add
//int a
//int b
//setValue()
//calculate()
//Sub
//int a
//int b
//setValue()
//calculate()
//Mul
//int a
//int b
//setValue()
//calculate()
//Div
//int a
//int b
//setValue()
//calculate()
// main() 메소드에서는 다음 실행 사례와 같이두연산자를입력받고
//Add, Sub, Mul, Div 중에서 이 연산을 실행할 수 있는 객체를 생성하고
//setValue() 와 calculate() 호출하여 결과를 출력하도록 작성하라.
// 두정수와연산자를입력하시오>>5 7 *
// 35
