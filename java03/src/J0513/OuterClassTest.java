package J0513;


class OuterClass{// 외부클래스
//	public String secret = "Time is money";
	private String secret = "Time is money";
	public OuterClass() {//2. 생성자 호출 
//		new InnerClass();//3. 노른자 객체 생성 
	 InnerClass obj =	new InnerClass();
	 obj.method();//a
	 
	}
//	public class InnerClass{// 내부(중첩,inner) 클래스 라고 브름 
		public class InnerClass{ 
		public InnerClass() {//4. 생성자 호출 
			System.out.println("내부 클래스의 생성자 입니다.");
			
		}
		//b
		public void method() {
			//노른자에서 달걀을 privte 로 접근 
			//c
			System.out.println(secret);
		}
	}
	
}

public class OuterClassTest {
	public static void main(String[] args) {
		
//		new OuterClass();//1. 달걀 객체 생성 
		OuterClass outer = new OuterClass();
		// private이지 않아도  접근 제한 
//		outer.secret =""; // private 이면 접근 제한 	
//		new InnerClass(); // 접근 제한, 노른자 객체 생성(오류)
		
	}
}
