package 중상급;


public class TV {		
	
	 String lg;
	 int i;
	 int j;
	
	// public static 넣었을떄 안된이유 
//	public static void show() {
//	public static void show(String lg, int i, int j) {
	 
	 //void show() {  -> 인스턴스 메서드 (Non-static)
	 //public static void show() { -=>정적 메서드 (Static)
	 
//	 메서드에 static 키워드를 사용하면 작동하지 않는 이유는
//	 static 메서드가 클래스 자체에 속하기 때문입니다.
//	 반면에 인스턴스 변수(lg, i, j)는 특정 객체에 속합니다. 
	 //static 메서드는 인스턴스 변수에 직접 접근할 수 없기 때문에 오류가 발생합니다.
	public  void show() {
		
		
		System.out.println(lg+"에서 만든 "+i+"년형 "+j+"인치 TV");
	}
	

	public TV(String lg, int i, int j) {
		this.lg=lg;
		this.i=i;
		this.j=j;
		
	}

	public static void main(String [] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	
		
	}
}


// 자바클래스를 작성하는 연습을 해보자.
// 다음 main() 메소드를 실행하였을 때 예시와 같이 출력
// public static void main(String [] args) {
// TV myTV = new TV("LG", 2017, 32);
// myTV.show(); 
// }
// LG에서 만든 2017년형 32인치 TV