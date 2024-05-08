package J240508_package1;

import java.util.Scanner;

class Book3{
	String title;
	String author;
	public Book3(String title, String author) {
		this.title=title;
		this.author=author;
	}
}


public class BookArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book3[] book = new Book3[2];
		//Book3[] book; -객체배열선언
		//book -참조변수 // 참조변수가 참조변수 2개를 가리킴
		
		//book.length - 2
		for (int i = 0; i < book.length; i++) {
			System.out.print("제목 >> ");
//			String title = sc.next();
			String title = sc.nextLine();
			//nextLine()  : 띄어쓰기를 포함하지않고 한행을 다 받을수 있게 한다 
			System.out.print("저자 >> ");
//			String author = sc.next();
			String author = sc.nextLine();
			//참조변수 book[0], 참조변수 book[1] 객체를 2번 생성 /참조변수 2개 
			book[i] = new Book3(title, author);
		}
		for (int i = 0; i < book.length; i++) {
			System.out.println("("+book[i].title+","+book[i].author+")");
		}
	}
}
