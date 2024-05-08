package J240508_package1;



public class Song {
	private String title;
	private String artist; 
	private int year;
	private String country;
	
	
	
	public Song() {
		
	}
//	소스 - 제네레이터 유징 필드 - 바로 입력 
	public Song(int year, String country, 
			String artist ,String title) {
		this.artist=artist;
		this.year=year;
		this.country=country;
		this.title=title;
	}
	
	void show() {
		System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title );
	}


	public static void main(String[] args) {
		
		Song mySong = new Song(1978,"스웨덴","ABBA","Dancing Queen");;
		
		mySong.show();
	}
}

//중상급6 주어진멤버를가진클래스(Song)
//1
// 노래한곡을나타내는Song클래스를작성하라.
// Song 은 다음필드로구성된다.
// 노래의제목을나타내는title
// 가수를나타내는artist
// 노래가발표된연도를나타내는year
// 국적을나타내는country
// 또한Song 클래스에 다음생성자와메소드를작성하라.
// 생성자2개: 기본생성자와 매개변수로모든필드를초기화하는생성
//자
// 노래정보를출력하는show() 메소드
// main() 메소드에서는 1978년, 스웨덴 국적의 ABBA 가 부른
//“Dancing Queen” 을 Song 객체로 생성하고 show() 를 이용하여 노
//래의정보를다음과같이출력하라.
// 1978년 스웨덴국적의 ABBA가 부른Dancing Queen