package J240503_q4;

public class Book {
	//4. 맴버에 저장
	String title;//맴버변수/필드 /어린왕자
	String author;//맴버변수/필드 / 생텍쥐베리
	
	
	//2. "어린왕자", "생텍쥐베리" 2개를 매개변수로 받는다
	public Book(String t, String a) {//생성자 
		//매개변수를 맴버변수에 넣음 
		//3.매개변수를 맴버로 저장 
		title= t; 
		author = a;
	}
	//2. "춘향전"매개변수로 받는다
	public Book(String t) {//생성자 
		//3. 매개변수로 맴버저장
		title= t;// "춘향전" 
//		author = "작자 미상"; 
	}
	
	public static void main(String[] args) {
		//기본 생성자를 자동으로 만들어서 호출(컴파일러)
	
		//new Book();// 생성자가 하나라도 존재하면 자동으로 기본생성자를 만들지 못해서 오류
		
		
		//1.매개변수 가지고 생성자 호출 
		Book littlePrince = new Book("어린왕자", "생텍쥐베리");
		//1.매개변수 가지고 생성자 호출 /춘향전
		Book loveStory = new Book("춘향전");
		
		
		
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);
		
	}
	
}
