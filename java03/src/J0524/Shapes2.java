package J0524;

interface Shape1{
	 final double PI = 3.14;
	 void draw(); // 도형을 그리는 추상 메소드
	 double getArea(); // 도형의 면적을 리턴하는 추상 메소드
	 default public void redraw() { // 디폴트 메소드
	 System.out.print("--- 다시 그립니다. ");
	 draw();
		 
	 }
 }
// --------------------------------------------
class Rect implements Shape{
	int x,y;
	public Rect(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void draw() {
		System.out.println(x+"x"+y+"인 원입니다.");
	}

	@Override
	public double getArea() {
		return x*y;
	}
	
}
// ---------------------------------------------------
class Oval implements Shape{
	int width,  height;
	public Oval(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width+"x"+height+"에 내접하는 타원입니다.");
	}
	@Override
	public double getArea() {
		return (width/2)*(height/2)*PI;
	}
 }
//---------------------------------------------------
class Circle3 implements Shape{
	int x;
	public Circle3(int x) {
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
	// ---------------------------------------------------
}
public class Shapes2 {
	public static void main(String[] args) {
		
		 Shape [] list = new Shape[3]; // Shape 인터페이스 타입인 레퍼런스 배열
		 list[0] = new Circle3(10); // 반지름이 10인 원 객체
		 list[1] = new Oval(20, 30); // 20x30 사각형에 내접하는 타원
		 list[2] = new Rect(10, 40); // 10x40 크기의 사각형
		 
		 for(int i=0; i<list.length; i++) 
			 list[i].redraw();
		 
		 for(int i=0; i<list.length; i++) 
		System.out.println("면적은 " + list[i].getArea());
		 
		 
		
	}
}

//다음main() 메소드와 실행결과를참고하여, 문제9에서인터페이스Shape 을
//구현한클래스Oval, Rect 를 추가 작성하고 전체 프로그램을완성하라.
// static public void main(String [] args) {
// Shape [] list = new Shape[3]; // Shape 인터페이스 타입인 레퍼런스 배열
// list[0] = new Circle(10); // 반지름이 10인 원 객체
// list[1] = new Oval(20, 30); // 20x30 사각형에 내접하는 타원
// list[2] = new Rect(10, 40); // 10x40 크기의 사각형
// for(int i=0; i<list.length; i++) list[i].redraw();
// for(int i=0; i<list.length; i++) System.out.println("면적은 " + list[i].getArea());
// }
//--- 다시 그립니다. 반지름이10인 원입니다.
//--- 다시 그립니다. 20x30에 내접하는 타원입니다.
//--- 다시 그립니다. 10x40크기의 사각형 입니다.
// 면적은314.0
// 면적은471.00000000000006
// 면적은400.0