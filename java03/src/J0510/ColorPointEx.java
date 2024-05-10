package J0510;

/*
 * Point 클래스 : (x,y) 한 점을 표현
 * Point 클래스를 상속받는 ColorPoint 클래스(색을 가진 점 )
 * 
 * */

class Point{
	private int x,y;  // 맴버 변수 / 4. (1,2)값의 이동
	public void set(int x, int y) { // 맴버 함수 		// 2번. (1,2)값의 이동
		this.x = x; this.y = y;// 3.(1,2)값의 이동
	}
	public void showPoint() { // 맴버 함수 
		System.out.println("("+x+","+y+")");
	}
}

//ColorPoint : 서브클래스   
//Point : 부모 클래스 
class ColorPoint extends Point{
	private String color;//4.("Red") 이동
	
	//setColor(String color) /setter 라고함 
	public void setColor(String color) {//2. ("Red") 이동
		this.color = color;//3.("Red") 이동
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		
		//1.메소드 호출 
		Point p = new Point(); // 객체를 생성, 맴버는 4개, 생성자 호출(기본);
		p.set(1, 2); 
		p.showPoint();
		
		//객체를 생성, 맴버는4+3개, 생성자 호출(기본) :Point(슈퍼)->ColorPointEx(서브)
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.showPoint();
		cp.setColor("Red");// 1. red값을 들고 메소드 호출  
		// 스트링이라 new 선언 안하는게 이건가 ?
		cp.showColorPoint();
		
		
	}
}
