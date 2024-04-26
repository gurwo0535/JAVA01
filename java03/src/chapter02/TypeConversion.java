package chapter02;

public class TypeConversion {
	public static void main(String[] args) {
		
//		연산결과는 큰타입으로 int 
		byte b = 127;
		int i = 10;
		
		System.out.println(b+i);
		System.out.println(b/i);
//		실수타입이 정수 타입보다 큼 Float > long 
		System.out.println(10.0/4);
		System.out.println(2.9+1.8);
//		(int)2.9 = 정수가 되어 2 
		System.out.println((int)2.9+1.8);
		System.out.println((int)2.9+(int)1.8);
		System.out.println((int)(2.9+1.8));
	}
}
