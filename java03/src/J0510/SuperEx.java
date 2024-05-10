package J0510;

/*
 * super()사용 예시 
 * */
//this.x = this.y = 0; == this.x = x;	this.y = y;

class Point2{
	private int x,y;//4. (0,0) 저장   // b. (5, 6) 저장 
	public Point2() {// 2. (5, 6, "blue")/슈퍼 클래스 생성자 호출
		this.x = this.y = 0; //3 맴버 저장 
	}
	public Point2(int x, int y) {
		this.x = x;	this.y = y;	 //c.(5, 6) 맴버 저장 
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint2 extends Point2{
	private String color; // 맴버변수 //6. blue 출력

	public ColorPoint2(int x, int y, String color) {//1. (5, 6, "blue")
		super(5, 6); // a.(5, 6)
		this.color = color;// 5. 맴버 저장 
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}

public class SuperEx {
	public static void main(String[] args) {
		
		ColorPoint2 cp = new ColorPoint2(5, 6, "blue");
		cp.showColorPoint(); // 객체생성 (0,0), blue 생성 
	
	}
}
