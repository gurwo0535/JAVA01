package J0522;

class TV {
 private static int size;

 public TV(int size) {
	 this.size = size;
	 }

 protected static int getSize() {
	 return size; 
	 }
 }

 class ColorTV extends TV{
	 private int color;
	 
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
		
	}
	 public void printProperty() {
		
			System.out.println(getSize()+"인치 "+ color+"컬러");
		} 
 }
 
public class SuperTV {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		 myTV.printProperty();
	}
}

//고급1 super(), 서브클래스1(ColorTV)
//1
// 다음TV클래스가있다.
// class TV {
// private int size;
// public TV(int size) { this.size = size; }
// protected int getSize() { return size; }
// }
// 다음MAIN() 메소드와 실행 결과를 참고하여TV를상속받은
//ColorTV 클래스를 작성하라.
// public static void main(String [] args) {
// ColorTV myTV = new ColorTV(32, 1024);
// myTV.printProperty();
// }
// 32인치 1024컬러