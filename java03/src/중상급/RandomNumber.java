package 중상급;

//(int)(Math.random() 사용법 

public class RandomNumber {
	public static void main(String[] args) {
	
	
	
	while (true) {
		int rNumber = (int)(Math.random()*10)+1;
		System.out.println(rNumber);
		if (rNumber==7) {
			System.out.println("7등장");
			break;
		}
	}
		
	}
}



//
//*.main 메소드 설계
// 변수들  rNumber: 1부터 10사이의 임의의 정수  알고리즘 
//(1) 1부터 10사이의 정수를 임의로 만든다  
//(2) 숫자를 출력한다.  
//(3) 7이라는 숫자가 출력되면 종료한다.