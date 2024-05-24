package 기본;

import java.util.Scanner;

// else문 사용 공부 
// if, else if , else 차이점 정리 

public class Rectangle확인 {

	public static void main(String[] args) {
		int a,b;
		
		System.out.print("점(x,y)의 좌표를 입력하시오>> ");
		Scanner scanner = new Scanner(System.in);
		a= scanner.nextInt();
		b= scanner.nextInt();

		if ((a>=100 && 200>=a) && (b>=100 && 200>=b)  ) {
			System.out.println("("+a+","+ b+")는 사각형 안에 있습니다. ");
			
		} else {
			System.out.println("없습니다. ");

		}
		
		
		// 나 오류 
//		if (a>=100 && 200<=a ) {
//		} if (b>=100 && 200<=b ) {	
//		}else {
////			System.out.println("없습니다. ");
////			return;
//		}
//		
	}	
	
}




// 2차원평면에서직사각형은왼쪽하단모서리와오른쪽
//상단모서리의두점으로표현한다.
// (100, 100)과 (200, 200)의 두점으로 이루어진 사각형이
//있을때, Scanner 를 이용하여 정수 x와 y값을 입력받고
//점(x,y)가 이 직사각형 안에 있는지를판별하는프로그램
//을작성하라.
// *.출력
// 점(x,y)의 좌표를 입력하시오>>150 150
// (150, 150)는 사각형 안에 있습니다.