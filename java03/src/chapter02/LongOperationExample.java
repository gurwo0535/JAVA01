package chapter02;

public class LongOperationExample {
	public static void main(String[] args) {
		
		byte value =10;
		int value2 =100;
		long value3 =1000;
		
		
//		long 타입이 있는데 int로 출력하려하니 오류가 남 long으로 수정하던가 int 묶던가 
//		int result =  (value + value2 + value3);   
		int result =  (int) (value + value2 + value3); 
		
		
		System.out.println(result);
	}
}