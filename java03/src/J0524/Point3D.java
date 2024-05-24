package J0524;

class PointThree{
	private int x,y,z;

	public PointThree(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
    protected void setZ(int z) {
        this.z = z;
    }
}

public class Point3D extends PointThree{
	
	// z값을 Point3D 클래스에 선언해도 된다 
	
	public Point3D(int x, int y, int z) {
		super(x, y, z);
	}
	
	private void moveUp() {
		//z를 Point3D클래스에서 선언한다면 
		//z++;로 대체 가능하다 
		setZ(getZ()+1);
	}
	private void moveDown() {
		//z를 Point3D클래스에서 선언한다면 
		//z--;로 대체 가능하다 
		setZ(getZ()-1);
	}
	private void move(int x, int y) {
		setX(x);
		setY(y);;
	}
	private void move(int x, int y, int z) {
		//z를 Point3D클래스에서 선언한다면 
		
		setX(x);
		setY(y);
		setZ(z);
	}

	
	@Override
	public String toString() {
		return "("+getX()+","+getY()+","+getZ()+")의 점";
	}

	public static void main(String[] args) {
		
		 // 1, 2, 3은 각각 x, y, z축의 값
		Point3D p = new Point3D(1, 2, 3);
		System.out.println(p.toString() + "입니다.");
		
		 p.moveUp(); 
		 System.out.println(p.toString() + "입니다.");
		
		 p.moveDown(); // z 축으로 아래쪽 이동
		 p.move(10, 10); // x, y 축으로 이동
		 System.out.println(p.toString() + "입니다.");
		 
		 p.move(100, 200, 300); // x, y, z 축으로 이동
		 System.out.println(p.toString() + "입니다.");
		
	}



	


}
