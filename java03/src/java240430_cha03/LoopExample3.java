package java240430_cha03;


/*
 * do while문
 * 변화되는 i값 출력
 */

public class LoopExample3 {
	public static void main(String[] args) {
		int i =10;
		
		
		
//		do while 문 => 최소 한번은 수행
		do {
//			i의 값 : 10 => 한번만 출력
			System.out.println(i);
			i--;//9 바뀌고
//			9<3 => 거짓으로 종료 
		} while (i<3);
	}
}
