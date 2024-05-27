package 중상급;

public class Song {
	String title;
	String arist;
	int year;
	String county;
	
	public Song(String title, String arist, int year, String county) {
		this.title = title;
		this.arist = arist;
		this.year = year;
		this.county = county;
	}

	private void song() {
	}
	
	void show() {
		System.out.println(year+"년 "+county+"국적의 "+arist+"가 부른 "+title);
	}
	
	public static void main(String[] args) {
		Song song = new Song("Dancing Queen","ABBA",1978,"스웨덴");
		song.show();
		
		
	}
}
//
//
//래 한곡을 나타내는 Song클래스를 작성하라.
// Song 은 다음 필드로 구성된다.
// 노래의 제목을 나타내는 title
// 가수를 나타내는 artist
// 노래가 발표된 연도를 나타내는 year
// 국적을 나타내는 country
// 또한 Song 클래스에 다음 생성자와 메소드를 작성하라.
// 생성자 2개: 기본생성자와 매개변수로 모든 필드를 초기화하는 생성
//자
// 노래 정보를 출력하는 show() 메소드
// main() 메소드에서는 1978년, 스웨덴 국적의 ABBA 가 부른
//“Dancing Queen” 을 Song 객체로 생성하고 show() 를 이용하여 노
//래의 정보를 다음과 같이 출력하라.
// 1978년 스웨덴국적의 ABBA가 부른 Dancing Queen
