package 기본;

import java.util.Iterator;
import java.util.Scanner;

// 스캐너로 배열을 받아서 실행 했음 

//for문의 반복구간 범위에 주의 하자

public class ExArea {

	public static void main(String[] args) {
		
		double[] num = new double[3];
		
		System.out.print("정수를 도죠 : ");
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			 num[i] = scanner.nextInt();
		}
			 if (num[2] == 0) {
				 System.out.println("삼각형의 넓이는 : "+num[0]*num[1]/2+"입니다");
				 
			 }else {
				 System.out.println("사다리꼴의 넓이는 : "+ (num[0]+num[1])*num[2]/2 +"입니다");
				 
			 }
			
		
		
	}
	
	
	
}

//
//Scanner 를 이용하여 입력받은 숫자가 3개는 사다리꼴
//의넓이, 2개는 삼각형의넓이를구하라.
// 단, 3개는 윗변,아랫변,높이
// 2개는밑변,높이와0
// *.출력
// 정수를입력하시오>>4 5 0
// 삼각형의넓이는10.0
// 정수를입력하시오>>2 3 4
// 사다리꼴의넓이는10.0