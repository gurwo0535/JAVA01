package 중급2;

import java.util.Scanner;
 /// if 문 사용법 외우자 
public class NestedIf_2또틀림 {
	public static void main(String[] args) {
		int score = 0, grade = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		score = scanner.nextInt();
		System.out.print("학년를 입력하세요 : ");
		grade = scanner.nextInt();

		if (score >= 60) {
			if (grade == 4 && score >= 70) {
				System.out.println("합격");
			} else if (grade != 4) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		}else {
			System.out.println("불합격");
			
		}
	}
}
