package J0522;

public class memo0522 {
	
	//로또 번호 중복되지않게 여섯자리 뽀ㅓㅂ기 
	// 추상메소드는 리턴값이 없다 ??
	
	//람다식이란 무엇인가 ?
	// 매소드 매개변수 안에 람다식으로 식을 넣어서 
	//빠르게 계산할수있게 하는것??
	//Integer 객체를 람다식에 넘겨준다 .
	//----------------
	// 오토 박싱 이란다 
	// 오토 박싱 : 생략 인가 ?
//	f2.print(Integer.valueOf(100));
	//f2.print(100); // 이거랑 뭐가 다름 ??
	
	//매개변수는 없지만 객체를 가르키는 구조로 만들어진다  ? 
	// 추상메소드에 매개변수가 있다면 숫자 ,없다면 문자열을 호출하는 방식인가 ?
	
	
	/*
	 *  String[] a = {"a","b","c","d"};
  Arrays.asList(a);
  .toString() :
  배열에도toString이 존재한다. 
 int[] b = {1,5,5,7,3,3,42,6,8,45323,4,63,2,1};
  System.out.println(Arrays.toString(b));
  [1, 5, 5, 7, 3, 3, 42, 6, 8, 45323, 4, 63, 2, 1
 
 -----------------질문 
 	 //System.out.println(student1);
	 //오버라이딩 하지않으면 위의 코드를 사용할수 없다
	 // toString() : 이기에 자동으로 호출이 된다 
	 // equals()사용 할시 
	 @Override
	 public String toString() {
		 
		return "이름 : " + Name + "\n학번 : " + Number + "\n소속학과 : " + Department;
	
	}
}
		Student_qq student1 = new Student_qq();
		
		student1.setName("갑돌");
		student1.setNumber(100);
		student1.setDepartment("컴퓨터 공학과");
		
		System.out.println(student1);.
		
			// 오버라이딩하고 
		//student2.toString() 사용 해도 되네 ?
		
		System.out.println(student2.toString());
 
 --------------------------
  --- 오버라이딩 예시 
  
  자식 클래스에서 부모 클래스에 선언된 메소드를 중복 작성하여 
  부모 클래스에 작성된 메소드를 무력화시키고 주인 노릇을 하는 것이다.

즉, 자식 클래스의 레퍼런스를 이용하든 부모 클래스의 레퍼런스를 이용하든 
항상 자식 클래스에 오버라이딩한 메소드가 실행된다.

자식 클래스에 오버라이딩한 메소드는 반드시 부모 클래스에 작성된
 메소드의 이름, 리턴 타입, 매개변수 리스트가 모두 같도록 작성되어야 한다. 
 
클래스 A의 메소드 f()를 클래스 B가 오버라이딩하는 예를 들면 다음과 같다. 

  
	 	class A {
	   void f() {
	       System.out.println("A의 f()호출");
	   }
	}
	class B extends A {
	   void f() { //A의 f를 오버라이딩
	      System.out.println("B의 f()호출");
	    }
	}

	 */
}
