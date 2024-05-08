package J240508_package1;

//default 접근 지정자
class Calc{
	//static(클래스)맴버는 객체 생성없이 클래스 이름으로 사용 가능 
//	public static int abs(int a) {
//		public  int abs(int a) {
	 // private 접근지정자는 같은 클레스 안에서만 접근 가능 
//	 private int abs(int a) {
	
//	protected 접근지정자는 같은 패키지 안+ 다른패키지 (상속에서만 접근가능 )
//	protected private int abs(int a) {
	// 같은 패키지 안에서 st
		 protected static int abs(int a) {
		return a>0?a:-a;//절대값 반환 
		
	}
		 
		 static int max(int a, int b) {
			 return a>b? a:b;// 둘중에 큰 수 반환
		 }
		public static int min(int a, int b) {
			 return a>b? b:a;// 둘중에 작은 수 반환
		 }
}

//public 접근지정자 
public class CalcEx {
	public static void main(String[] args) {
//		static 맴버로서 객체 생성없이 접근가능 
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10,8));
		System.out.println(Calc.min(-3,-8));
		
	}
}
