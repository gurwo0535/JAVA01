package J0513;


class Point2 {
	private int x,y;
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return x +","+ y; // 아직 
	}
}

public class ToStringEx2 {
	public static void main(String[] args) {
		Point2 p = new Point2(2, 3);
		
		System.out.println(p);//J0513.Point@75a1cd57 :  패키지.클래스@16진수 해시코드
		System.out.println(p.toString()+"입니다");//J0513.Point@75a1cd57 같음 / 생략 가능 
	}
}
