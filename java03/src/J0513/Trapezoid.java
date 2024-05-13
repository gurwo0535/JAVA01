package J0513;

import java.util.Scanner;

public class Trapezoid {

	 int down;
	 int up;
	 int height;
	
	
//	public Trapezoid(int down, int up, int heght) {
//		this.down=down;
//		this.up=up;
//		this.height=heght;
//	}
	
	public  double getArea() {
		
		return (down+up)*height/2;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(">>>>>>>   ");
		Trapezoid trapezoid = new Trapezoid();
		
		 trapezoid.down = scanner.nextInt();// 객체로 맴버에 접근
		 trapezoid.up= scanner.nextInt();
		trapezoid.height = scanner.nextInt();
		
		//down, up, height
	
	System.out.println("사다리꼴의 면적은 :"+trapezoid.getArea());
	
	scanner.close();
	
		
		
		
}
	
}

//
//중상급B 4 Trapezoid 클래스 만들기 연습
//1
//아래변, 윗변과 높이를입력받아사다리꼴의면적을출력하는프로그램을
//작성하라. 아랫변(down), 윗변(up)와 높이(height) 필드, 그리고 면적 값을
//제공하는getArea() 메소드를 가진 Trapezoid 클래스를 만들어 활용하라. 
//>> 5 4 10
//사다리꼴의면적은45.0
