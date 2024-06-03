package 중급2;

import java.util.Scanner;

public class ComputeBalance_2 {
	public static void main(String[] args) {
		int purchaseAmount,balance = 0,result=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("구매금액을 입력하시오 :");
		purchaseAmount = scanner.nextInt();
		
		if (purchaseAmount >=300000) {
			balance = purchaseAmount-30000;
		}else if (purchaseAmount>=100000) {
			balance = purchaseAmount -5000;
		}
		System.out.println("구매금액 : "+purchaseAmount);
		System.out.println("청구금액 : "+ balance);
	}
}
