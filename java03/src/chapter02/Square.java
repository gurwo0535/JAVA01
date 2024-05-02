package chapter02;

import javax.print.DocFlavor.STRING;

/*
 * 실행시 찾아가는 순서 
1. public class 
2. main 메소드
3.  메소드 호출 / square(n);
4.  메소드 호출 / public static int square(int length) 
5. length를 반환 / retrun값을 반환 


*/
public class Square {
//	void : 리턴 타입 [리턴/반환/ 할것이 없다]
	public static void main(String[] args) {
		int n = 4 ;
		
//		square();// 메소드 호출부
//		square(n);// 메소드 호출부
	int s = square(n);// 메소드 호출부
	
	System.out.println("한변의 길이가 "+ n + "인 정사각형이 넓이 : "+ s);
	}
//	Square : 메소드명(호출부에서 파라미터가 있으면 오류)
//	public static void square() {//메소드 정의부
//	public static void square(int n) {//메소드 정의부
	
//	int length : int 타입의 매개변수(인자, 파라미터) : n -> length 로 받음
//	public static void square(int length) 
	
	
//		int : 리턴 타입, 반환 타입 
		public static int square(int length) {
//		return;
//		return "";   / 타입 불 일치시 오류 (STRING)+
//		return 0;  타입 불 일치시 오류 (int)
			int a= length*length;
			return a;
		
			
			// 클래스는 공장과 같아서 시스템을 만들어두고 메소드를 불러들여 리턴값을 활용한다 
	}
}
