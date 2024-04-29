package quset01;

import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		
		System.out.println("가로, 세로 길이를 입력하세요>>");
		
	 Scanner sc = new Scanner(System.in);
	 
	 int garo = sc.nextInt();
	 int sero = sc.nextInt();
	 
	 int myonzyok = (garo*sero);
	 
	 System.out.println("사각형의 면적은 " + myonzyok + "입니다.");
		
	 sc.close();
	}
	
}