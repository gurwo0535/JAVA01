package J0524;

import java.util.Scanner;


//두 정수와 연산자를 입력하시오 : 12 0 /
//0으로 나눌수 없습니다
//0
// 결과값 0이 안나오게 하고싶음 

abstract class Calc {
	// public,protected 이어야하는이유 
	//	private 는 안됨
	//범위를 좁게 잡는게 좋은건가 ??
	
	
    protected int a, b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public abstract int calculate();
}

class Add extends Calc{
	@Override
	public int calculate() {
		return a+b;
	}
}

class Sub extends Calc{
	
	@Override
	public int calculate() {
		return a-b;
	}
}

class Mul extends Calc{
	
	@Override
	public int calculate() {
		return a*b;
	}
}

class Div extends Calc{
	
	@Override
	public int calculate() {
		int res = 0;
		try {
			res = a/b;
		} catch (Exception e) {
			System.out.println("숫자 0은 입력할수 없습니다.");
			return 0;
		}
		return a/b;
	}
}


public class Calculator확인 {
	public static void main(String[] args) {
		
		
		
		System.out.print("두 정수와 연산자를 입력하시오 : ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String obj = scanner.next(); // 기호 받기 
		int b = scanner.nextInt();
		
		// 추상 클래스,인터페이스 사용하는이유은 간략화 
		Calc op = null;
		
		switch (obj) {
		case "+":
			op = new Div();	break;
		case "-":
			op = new Div();	break;
		case "*":
			op = new Div();	break;
		case "/":
			op = new Div();	break;
//		case "+":
//			op = new Add();
//			op.setValue(a, b);
//			System.out.println(op.calculate());
//			break;
//		case "-":
//			op = new Sub();
//			op.setValue(a, b);
//			System.out.println(op.calculate());
//			break;
//		case "*":
//			op = new Mul();
//			op.setValue(a, b);
//			System.out.println(op.calculate());
//			break;
//		case "/":
//			op = new Div();
//			op.setValue(a, b);
//			System.out.println(op.calculate());
//			break;

		default:
			System.out.println("잘못된 연산자 입니다.");
			scanner.close();
			break;
		}
		
//		  이렇게 사용할수 있다 
	

		op.setValue(a, b);
		if (op instanceof Div && b== 0) {
			
			System.out.println("계산할수 없습니다.");
		} else {
			System.out.println(op.calculate());
		}
		
		scanner.close();
	}
	
	
}


//더하기(+), 빼기(-), 곱하기(*), 나누기(/)를 수행하는 4개의 클래스
// int 타입의 a, b 필드: 2개의 피연산자
// void setValue(int a, int b): 피연산자 값을 객체 내에 저장한다.
//  int calculate(): 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.

//  Add, Sub, Mul, Div 클래스에 공통된 필드와 메소드가 존재하므로 새로운 추상
//클래스Calc 를 작성하고Calc 를 상속받아각클래스Add, Sub, Mul ,Div 를 만
//들어라.
//  Calculator 클래스에 main() 메소드에서는 다음 실행 사례와 같이 두 연산자를
//입력받고Add, Sub, Mul, Div 중에서 이 연산을 실행할 수 있는 객체를 생성하
//고setValue() 와 calculate() 호출하여 결과를 출력하도록 작성하라.
//  두정수와연산자를입력하시오>>5 7 *
//  35