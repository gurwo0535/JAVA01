package 기본;

import java.util.Scanner;

// while 문 
// continue , break 사용 
// 정답이 나올떄까지 무한루프 

public class DivAndRemains {

	public static void main(String[] args) {
		
		System.out.print("2자리 정수 입력(10~99) : ");
		
		Scanner scanner= new Scanner(System.in);
		int num = scanner.nextInt();
		
		while (num>9 && num<100) {
			if (num%11==0) {
				System.err.println("wow good excllent");
			}else {
				System.out.println("replay");
				System.out.print("2자리 정수 입력(10~99) : ");
				 num = scanner.nextInt();
				continue;
			}
			break;
		}
		
	}
	
}
//
//
// Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를
//입력받고, 십의 자리와1의자리가같은지판별하여출
//력하는프로그램을작성하라.
// *.출력
// 2자리수정수입력(10~99)>>77
// Yes! 10의 자리와 1의 자리가 같습니다.