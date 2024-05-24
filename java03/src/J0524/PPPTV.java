package J0524;



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
		 private static int color;
		 
		public ColorTV(int size, int color) {
			super(size);
			this.color = color;	
		}
		 protected static int getColor() {
			 return color; 
			 }
	 }
	 
	 

class IPTV extends ColorTV{
	 private String ip;
	
	public IPTV(String ip,  int size, int color) {
		super(size, color);
		this.ip =ip; 
	}
	 public void printProperty() {
			
			System.out.println("나의 IPTV는 "+ip+"주소의"+getSize()+"인치 "+ getColor()+"컬러");
		} 
}

public class PPPTV {
public static void main(String[] args) {
	 IPTV iptv = new IPTV("192.1.1.2", 32, 2048); 
	
	 iptv.printProperty();
	}
}

//다음MAIN() 메소드와 실행 결과를 참고하여문제1의
//ColorTV를 상속받는 IPTV 클래스를 작성하라.
//  public static void main(String[] args) {
//  IPTV iptv = new IPTV("192.1.1.2", 32, 2048); 
// iptv.printProperty();
//  }
//  나의IPTV는 192.1.1.2 주소의 32인치 2048컬
