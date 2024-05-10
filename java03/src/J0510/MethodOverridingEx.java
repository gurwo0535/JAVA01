package J0510;

class Shape{
		public void draw() {
			System.out.println("Shape");
		}
}
class Line extends Shape{
	//오버 라이딩(void: 리턴타입 일치,draw:메소드며 일치,매개변수없는것일치)
	public void draw() {
		System.out.println("line");
	
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
		
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
		
	}
}

public class MethodOverridingEx {
	//Shape p = new line(); 업캐스팅 
	// Shape p = new Shape();
	static void paint(Shape p) {
		//업캐스팅에 의해서 슈퍼클래스의 draw()메소드로 갔다가 오버라이딩되어서 line으로 간다
		//동적 바인딩 
		p.draw();
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);// Line(업캐스팅,오버라이딩) 
		paint(new Shape());// Shape
		paint(new Rect());// Rect(업캐스팅,오버라이딩) 
		paint(new Circle());// circle(업캐스팅,오버라이딩) 
	}
}
