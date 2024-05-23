package 기본;

import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		
		int a,b;
		System.out.print("가로,세로 길이를 입력하세요 : ");
		
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		int result = a*b;
		System.out.println("사각형의 면적은 : "+result+"입니다.");
	}
}
//
//
//Scanner 클래스를 이용하여 가로, 세로 길이를 입력받아
//사각형의면적출력하는프로그램을작성하라.
// *.출력
// 가로, 세로 길이를입력하세요>>4 5
// 사각형의면적은20입니다.