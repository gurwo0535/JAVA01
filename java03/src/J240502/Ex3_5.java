package J240502;

public class Ex3_5 {
	public static void main(String[] args) {
		
//		new int[5] : 배열 생성(크기가 5-> 인덱스->4)
		int[] sales = new int[5];
		
		
//		배열 원소를 다른 값으로 지정 
		sales[0]=52; //sales[0] - 배열 원소 - 배열 원소에 초기값 지정 
		sales[1]=50;
		sales[2]=55;
		sales[3]=42;
		sales[4]=38;
		
		int sum =sales[0]+sales[1]+sales[2]+sales[3]+sales[4];
		System.out.println(sum);
		
	}
}
