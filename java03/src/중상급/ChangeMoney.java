package 중상급;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		
		int num ;
		
		Scanner scanner = new Scanner(System.in);
		 System.out.print("금액을 입력하시오 >> ");
		 num = scanner.nextInt();
		 
		 int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		 
		 for (int i = 0; i < unit.length; i++) {
			 int res =num/unit[i]; 
			 if (res >0) {
				 System.out.println(unit[i]+"원 짜리 : "+res+"개");
				 num = num%unit[i];
			 }
		}
		 scanner.close();
		
	}
}



// 배열과반복문을이용하여프로그램을작성해보자.
// 키보드에서정수로된돈의액수를입력받아오만원권, 만원권, 천원
//권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1
//원짜리동전각몇개로변환되는지예시와같이출력하라.
// 이때반드시다음배열을이용하고반복문으로작성하라.
// int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의
//종류
// *.출력
// 금액을입력하시오>>65123
// 50000원 짜리 : 1개
// 10000원 짜리 : 1개
// 1000원 짜리 : 5개
// 100원 짜리: 1개
// 10원 짜리: 2개
// 1원짜리: 3개