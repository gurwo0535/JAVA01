package chapter02;

public class PromoptionExample {
	public static void main(String[] args) {
		
		byte byteValue = 10;
//		int byteValue = 1000;
		int intvalue = byteValue ; 
		
		System.out.println("intvalue : " + intvalue);
		
		
		char charValue = '가';
//		변수에 유니코드가 저장 
		intvalue = charValue ; 
		System.out.println("intvalue : " + intvalue);
		
		intvalue = 50;
//		작은 타입을 큰타입으로 받음 : 자동 변환
		long longvalue = intvalue;
		System.out.println("longvalue : " + longvalue);
		
		longvalue = 100;
		float floatValue = longvalue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue  : " + doubleValue );
		
	}
}
