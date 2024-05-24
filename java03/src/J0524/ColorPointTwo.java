package J0524;

// 파라미터 3개짜리가 필요한가   
// -- 필요없다
//public ColorPointTwo(int x, int y, String color) {
//this.color = color;
//}

//--*- BLACK색의 (0,0)의 점입니다. 
//   를 출력하기 위한 과정  
//public ColorPointTwo(){
//	this(0, 0);
//}
//public ColorPointTwo(int x, int y) {
//	super(x, y);
//	this.color = "BLACK";
//}


//파라미터가 없는 생성자에서 오류가 생기는이유 
//   ----------안에 this(0,0); 사용해서 값지정 
//public ColorPointTwo(){
//		this(0,0);
//}

// move의 x,y에서 오류가 생기는이유 
// --- int i, int j /x, y 로 수정 
//private void setXY(int i, int j) {
//move(x, y);
//}


class pointTwo{
	private int x,y;

	public pointTwo(int x, int y) {
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

public class ColorPointTwo extends pointTwo {
	private String color;
	


	public ColorPointTwo(){
		this(0, 0);
	}

	public ColorPointTwo(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}
	
	private void setXY(int x, int y) {
		move(x,y);
	}
	private void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return color+"색의 ("+getX()+","+getY()+")의 점";
	}


	public static void main(String[] args) {
//		
		ColorPointTwo zeroPoint = new ColorPointTwo();
//		
		 System.out.println(zeroPoint.toString() + "입니다.");
		
		 ColorPointTwo cp = new ColorPointTwo(10, 10);
		 cp.setXY(5, 5);
		 cp.setColor("RED");
		 System.out.println(cp.toString() + "입니다.");
	}




}

//
//Point(PointTwo 로 rename) 를 상속받아 색을 가진 점을 나타내는
//ColorPointTwo 클래스를 작성하라.
//  다음main() 메소드를 포함하고 실행결과와같이출력되게하라.
//  public static void main(String[] args) {
//  ColorPointTwo zeroPoint = new ColorPointTwo(); // BLACK 색에 (0,0) 위치
//의점
// System.out.println(zeroPoint.toString() + "입니다.");
//  ColorPointTwo cp = new ColorPointTwo(10, 10);
//  cp.setXY(5, 5);
//  cp.setColor("RED");
//  System.out.println(cp.toString() + "입니다.");
//  }
//  BLACK색의 (0,0)의 점입니다.
//  RED색의 (5,5)의 점입니다.