package 중급2;

import java.util.Scanner;

public class TaxiFare_2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int income =0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("요금을 입력하세요 : ");
			int fare = scanner.nextInt();
			income += fare;
		}
	System.out.println("총수입 : "+income);
		
	}
}
