package chapter02;

public class RandomNumber {
	public static void main(String[] args) {
		
		int n = rolldie(); 
		System.out.println("주사위의 눈 : "+n);
//		int v =rolldie(n);
		
	}
	
//	매개변수가 없는 메소드(주사위의 숫자 구하기 = 1~6)
	public static int rolldie() {
//		random(); : 0이상 1미만의 난수 발생
//		Math.random();
		
//		random(); : 0이상 6미만의 난수 발생
		double x = 6 * Math.random();
//		0~5 의 난수
		int temp = (int)x;
//		1~6의 난수를 반환 
		return temp + 1;
	}
}
