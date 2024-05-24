package J0524;
// default 메소드란 무엇인가 ?? redraw()
//오버라이딩 /동적바인딩 ?? 

interface Shape{
	 final double PI = 3.14;
	 void draw(); // 도형을 그리는 추상 메소드
	 double getArea(); // 도형의 면적을 리턴하는 추상 메소드
	 default public void redraw() { // 디폴트 메소드
	 System.out.print("--- 다시 그립니다. ");
	 draw();
		 
	 }
}

class Circle2 implements Shape{
	int x;
	public Circle2(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	@Override
	//오버라이딩 /동적바인딩
	public void draw() {
		System.out.println("반지름이 "+getX()+"인 원입니다.");
	}

	@Override
	public double getArea() {
		return getX()*getX()*PI;
	}
	
}

public class Shapes질문 {
	public static void main(String[] args) {
		
		Shape donut = new Circle2(10); // 반지름이 10인 원 객체
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
		
	}
	
}
