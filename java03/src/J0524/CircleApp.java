package J0524;

/// equals 사용해서 구하기 불가 
//a의 반지름이 30이 나오는 이유 구하기 
/// get 쓸필요없는 이유 찾기 

/// get 쓸필요없는 이유 찾기 
//	public static int getX() {
//		return x;
//	}
//	public static int getY() {
//		return y;
//	}
//	public static int getRadius() {
//		return radius;
//	static의 사용 유무에 대해 잘 알아보기 
//원 a : Circle(2,3)반지름5
//원 b : Circle(2,3)반지름30

class Circle{
	
	private  int x,y,radius;
//	private static int x,y,radius;
	
	public Circle(int x, int y, int radius) {
		this.x =x;
		this.y = y;
		this.radius =radius;
	}
	@Override
	public String toString() {
		return "Circle(" + x + "," + y + ")반지름" + radius;
		
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Circle b = (Circle)obj;
//		if (x == b.x && y == b.y) {
//			return true;
//		}else {
//			return false ;
//			
//		}
//	}
	
	public boolean equals(Circle a,Circle b) {
		if (a.radius == b.radius) {
			return true;
		}else {
			return false ;
			
		}
	}
}
public class CircleApp {
	public static void main(String[] args) {
		
		 Circle a = new Circle(2,3,5); // 중심 (2,3)에 반지름 5인 원
		 Circle b = new Circle(2,3,30); // 중심 (2,3)에 반지름 30인 원
		 
		 System.out.println("원 a : " + a);
		 System.out.println("원 b : " + b);
		 
		 if(a.equals(b)) {
		 System.out.println("같은 원");
		 }else {
		 System.out.println("서로 다른 원");
		 }
	}
}

//@Override
//public boolean equals(Object obj) {
//    if (this == obj) {
//        return true;
//    }
//    if (obj == null || getClass() != obj.getClass()) {
//        return false;
//    }
//    Circle circle = (Circle) obj;
//    return x == circle.x && y == circle.y;
//}


//원a : Circle(2,3)반지름5
// 원b : Circle(2,3)반지름30
// 같은원
// 중심을나타내는정수x,y와반지름radius 필드를가지는Circle 클
//래스를작성하고자한다. 생성자는3개의인자(x,y,radius)를 받아 해
//당필드를초기화하고, euqals() 메소드는 두 개의Circle 객체의 중
//심이같으면같은것으로판별하도록한다.