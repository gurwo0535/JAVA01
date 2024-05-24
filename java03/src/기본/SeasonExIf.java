package 기본;

import java.util.Scanner;

public class SeasonExIf {
	public static void main(String[] args) {
		
		System.out.print(" 달을입력하세요(1~12)>>  ");
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		if (num>2 &&num<6) {
			System.out.println("봄");
		}else if (num>5 &&num<9) {
			System.out.println("여름");
		}else if (num>8 &&num<12) {
			System.out.println("가을");
		}else if (num ==12 || num ==1 || num ==2) {
			System.out.println("겨울");
		}else {
			System.out.println("잘못입력");
		}
		
	}
}


// 숫자를입력받아3~5는“봄”, 6~8은 “여름”, 9~11은 “가
//을”, 12,1,2의 경우 “겨울” 을, 그 외 숫자를 입력한 경우
//“잘못입력” 을 출력하는 프로그램을작성하라.
// *.출력
// 달을입력하세요(1~12)>>9
// 가을
// if-else 문을 이용하여 프로그램을 작성하라.