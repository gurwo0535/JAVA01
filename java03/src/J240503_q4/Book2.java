package J240503_q4;


public class Book2 {
	String title; //필드 // 맴버변수
	String author;
	
	
	public Book2(String title, String author) {
		System.out.println("생성자1 호출됨 ");
		//매개변수를 this 자기자신의 객체 맴버로 저장 
		this.title= title;
		this.author =author;
	}
	public Book2(String title) {
		this(title , "작자 미상");
		//Constructor call must be the first statement in a constructor
		//=생성자 호출은 생성자의 첫줄에서만 가능하다 //첫번쨰 라인에 안오면 오류 발생
		System.out.println("생성자2 호출됨 ");

	}
	public Book2() {
		this("" , "");
		System.out.println("생성자3 호출됨 ");
		
		
	}
	
	void show() {
		System.out.println(title+" "+author);
	}
	
	public static void main(String[] args) {
	
	Book2 littlePrince = new Book2("어린왕자","생택쥐베리");
	Book2 loveStory = new Book2("춘향전");
	Book2 emptyBook = new Book2();
		
//	System.out.println(littlePrince.title+" "+littlePrince.author);
	littlePrince.show();
	loveStory.show();
	emptyBook.show();
	
	}
}
