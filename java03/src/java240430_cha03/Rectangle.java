package java240430_cha03;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		
		System.out.print("점(x,y)의 좌표를 입력하시오 >>");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean aa= ((a >99)&&(a<201));
		boolean bb =((b>99)&&(b<201) );
		
//		if (aa ){    이것도 됨 
//			
//		}if(bb){
//			System.out.println((a+ ","+ b) + "는 사각형 안에 있습니다.");
//		}else {
//			System.out.println("no");
//		}
//			
		if ((aa && bb) ){
			System.out.println((a+ ","+ b) + "는 사각형 안에 있습니다.");
		}
		else {
			System.out.println("no");
		}
		
		sc.close();
		
	}
}
//
//
//기본 7 if 조건과 논리 연습(Rectangle)
// 2차원 평면에서 직사각형은 왼쪽 하단 모서리와 오른쪽
//상단 모서리의 두 점으로 표현한다.
// (100, 100)과 (200, 200)의 두점으로 이루어진 사각형이
//있을때, Scanner 를 이용하여 정수 x와 y값을 입력받고
//점(x,y)가 이 직사각형 안에 있는지를 판별하는 프로그램
//을 작성하라.
// *.출력
// 점(x,y)의 좌표를 입력하시오>>150 150
// (150, 150)는 사각형 안에 있습니다.
