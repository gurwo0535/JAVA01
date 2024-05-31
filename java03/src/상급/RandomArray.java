package 상급;

import java.util.Scanner;

public class RandomArray {

	public static void main(String[] args) {

		System.out.print("정수의 개수 : ");
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int num = scanner.nextInt();
		for (int i = 0; i <num ; i++) {
			 int random = (int)(Math.random()*100)+1;
			System.out.print(random + " ");
			count++;
			if (count%10 ==0) {
				System.out.println();
			}
		}
		
	}

}



//정수를몇개저장할지키보드로부터개수를입력받아
//(100이하 개수) 정수 배열을 생성하고, 이곳에 1에서
//100까지 범위의 정수를랜덤하게삽입하라.
// *.출력
// 정수몇개?24
// 48 29 69 57 95 21 11 91 37 63 
// 56 88 20 6 81 8 4 24 7 65 
// 1 89 72 90