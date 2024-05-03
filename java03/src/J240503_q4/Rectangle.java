package J240503_q4;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	
	public int getArea() {
		return width*height;

	}
	public static void main(String[] args) {
//		new Rectangle();//구성 : 맴버 3개(맴버변수[필드]2개+맴버함수[메소드]1개)
		//  연잔사로 Rectangle 객체를 생성하면서,
		//	Rectangle 클래스 타입의 참조변수 rect가 가르킴
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		//객체의 맴버변수로 접근해서 스캐너에서 입력받은 정수가 셋팅 
		rect.width =  sc.nextInt();
		rect.height =  sc.nextInt();
		//메소드를 호출하면사각형의 넓이를 구할수 있음 
		System.out.println("사각형의 면적은 : "+rect.getArea());
	}
}
