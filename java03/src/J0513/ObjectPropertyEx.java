package J0513;


class Point {
	private int x,y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
}

public class ObjectPropertyEx {
	public static void print(Object obj) {//Object obj = new Point(2,3) / 업캐스팅
		System.out.println(obj.getClass());//class J0513.Point /실행중인 클레스 
		//getName() : 클래스 이름 
		System.out.println(obj.getClass().getName()); //J0513.Point 
		System.out.println(obj.hashCode());//1694819250 : 객체의 서명(10진수 해시코드)
		System.out.println(obj.toString());//J0513.Point@6504e3b2 : 패키지.클래스@16진수 해시코드
		System.out.println(obj);// toString() 생략가능  
		}
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		print(p);
		
	}
}
