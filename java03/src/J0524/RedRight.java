package J0524;

// 게터 세터 단축키 사용 
//파리미터 세팅 단축키 사용 
class Point {
	
  private int x, y;
  
  public Point(int x, int y) {
	  this.x = x; 
	  this.y = y; 
	  }
  
  public int getX() { 
	  return x; 
	  }
  
  public int getY() {
	  return y; 
	  }
  
  protected void move(int x, int y) {
	  this.x = x; 
	  this.y = y; 
	  }


  }

class ColorPoint extends Point{
	
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color =color;
	}
	  protected void setXY(int x, int y) {
		  move(x, y);	 
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	  @Override
		public String toString() {
			return  color+"색의 ("+getX()+","+getY()+")의 점";
		}

}

public class RedRight {
	public static void main(String[] args) {
		
	ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
	cp.setXY(10, 20);
	cp.setColor("RED"); 
	String str = cp.toString();
	System.out.println(str + "입니다.");
	
	}
}


//다음은2차원상의한점을표현하는Point 클래스이다.
// class Point {
// Private int x, y;
// Public Point(int x, int y) { this.x = x; this.y = y; }
// Public int getX() { return x; }
// Public int getY() { return y; }
// Protected void move(int x, int y) { this.x = x; this.y = y; }
// }
// Point 를 상속받아 색을 가진점을나타내는ColorPoint 클래스를 작성하라.
// 다음main() 메소드를 포함하고실행결과와같이출력되게하라.
// public static void main(String[] args) {
// ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
// cp.setXY(10, 20);
// cp.setColor("RED");
// String str = cp.toString();
// System.out.println(str + "입니다.");
// }
// RED색의(10,20)의 점입니다.