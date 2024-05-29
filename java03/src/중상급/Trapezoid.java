package 중상급;

import java.util.Scanner;

// 오래 걸렸으니까 또 보기 

public class Trapezoid {
	
	int down;
	int up;
	int height;
	
	double getArea() {
		
		return (down+up)*height/2;
		}
	
public static void main(String[] args) {
	
	Trapezoid tr = new Trapezoid();
	
	Scanner scanner= new Scanner(System.in);
	System.out.println("3가지 입력 : ");
	tr.down = scanner.nextInt();
	tr.up = scanner.nextInt();
	tr.height = scanner.nextInt();
	
	System.out.println(tr.getArea());

	
	}
}


//아래변, 윗변과 높이를입력받아사다리꼴의면적을출력하는프로그램을
//작성하라. 아랫변(down), 윗변(up)와 높이(height) 필드, 그리고 면적 값을
//제공하는getArea() 메소드를 가진 Trapezoid 클래스를 만들어 활용하라. 
//>> 5 4 10
//사다리꼴의면적은45.0