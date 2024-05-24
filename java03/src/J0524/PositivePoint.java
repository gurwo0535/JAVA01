package J0524;

//초기화 방법 this랑 super 차이 
//양수일때만 초기화 할때 super 사용하는 이유
//부모 클래스의 move 메서드 호출할떄 super 사용 이유 

class PointFour{
	private int x,y;

	public PointFour(int x, int y) {
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

public class PositivePoint extends PointFour {

	public PositivePoint() {
//		this(0, 0);
		
		 // 디폴트 생성자는 (0,0)으로 초기화
		// 초기화 방법 this랑 super 차이 
		
		//(선생님 )생성자 생성후 찾아갈떄 오류가 나므로  super(0, 0); 생성 
		 super(0, 0);
	}

	public PositivePoint(int x, int y) {
		super(x, y);
		//음수일떄는 if문으로 막아서 0,0도출 / 선생님 
		if (x<0 || y<0) {
			super.move(0, 0);
		}
		// 양수일 때만 초기화
		// 이것도 super 사용하는 이유
//		 super(x > 0 ? x : 0, y > 0 ? y : 0);
	}
	
	//protected 꼭 사용하지않아도 된다 /그러면 ??
	protected void move(int x, int y) {
		
		//0보다 작을경우에는 if문을 타지않기떄문에 
		//전에 도출된 값을 그대로 들고 간다.
		if (x>0 && y>0) {
			// 부모 클래스의 move 메서드 호출
			// 상위클래스의 move메소드를사용하기 위해 super / 추측 
			 super.move(x, y);
//			 move(x, y);
		}	
}
	
	
	@Override
	public String toString() {
		return "("+getX()+","+getY()+")의 점";
	}
	

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		 p.move(10, 10);
		 System.out.println(p.toString() + "입니다.");
		 
		 p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
		 System.out.println(p.toString() + "입니다.");
		 
		 PositivePoint p2 = new PositivePoint(-10, -10);
		 System.out.println(p2.toString() + "입니다.");
	}
}
