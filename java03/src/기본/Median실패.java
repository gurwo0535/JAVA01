package 기본;

import java.util.Scanner;

// 한번에 못풀었음 
// 숫자의 크기 비교하는 연습 하기 

public class Median실패 {

	public static void main(String[] args) {
		
		int a,b,c;
		System.out.print("3정수 : ");
		
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		int median;
		
		// 중간값을 설정하고 최대값 최소값을  ||로 두가지 가설을 세워서 진행
		if ((a > b && a < c) || (a < b && a > c)) {
            median = a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            median = b;
        } else {
            median = c;
        }
		   System.out.println("중간값: " + median);
	        
	        scanner.close();	
	}
	
}


// Scanner 클래스로 정수 3개를 입력 받고 3개의 숫자중
//중간크기의수를출력하라.
// 중복되지않는숫자를입력하라.
// 평균값을구하는것이아님에주의하라.
// *.출력
// 정수3개입력>>20 100 33
// 중간값은33