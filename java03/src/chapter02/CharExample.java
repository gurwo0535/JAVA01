package chapter02;

public class CharExample {
	public static void main(String[] args) {
		
		char c1 = 'A';
//		char로 받으면 유니코드로 인식한다 . 65 = A
		char c2 = 65;
//		\\u~ : 16진수 
		char c3 = '\u0041';
		char c4 = '가';
		int cc = '가';
		int cs = '권';
		int c6 = '\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(cc);
		System.out.println(cs);
		System.out.println(c6);
		
	}
}
