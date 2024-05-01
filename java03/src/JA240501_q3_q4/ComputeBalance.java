package JA240501_q3_q4;

import java.util.Scanner;

public class ComputeBalance {
	public static void main(String[] args) {
		
		System.out.print("구매 금액을 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int purchaseAmount = sc.nextInt();
		int balance = 0;
		
		System.out.println("구매 금액 : "+purchaseAmount);
	
		
		
		
		// 선생님 예시 
//		
//		if (purchaseAmount>=300000) {
//			balance = purchaseAmount-30000;
//		} else if(purchaseAmount>=100000){
//			balance = purchaseAmount-5000;
//		}else {
//			balance=purchaseAmount;
//		}
//		System.out.println("구매 금액 : "+purchaseAmount);
//		System.out.println("청구금액 : "+ balance);
//		
//		
		
		 // 내 예시 
		if (purchaseAmount>=300000) {
			System.out.println("청구금액 : "+(balance=purchaseAmount-30000));
		} else if(purchaseAmount>=100000) {
			System.out.println("청구금액 : "+(balance=purchaseAmount-5000));
		}else {
			System.out.println("청구금액 : "+purchaseAmount);
			}
		sc.close();
	}
}

//
//급8 구매금액에따라청구금액을계산(ComputeBalance)
//purchaseAmount: 구매금액
//balance: 청구금액
//구매금액을입력받는다.
//구매금액이300000원 이상이면 청구금액 = 구매금액–30000
//구매금액이300000원 미만이고 100000원 이상이면 청구금액 = 구매금액–5000
//구매금액이100000원 미만이면 청구금액 = 구매금액
//구매금액과청구금액을출력한다.
// 구매금액을입력하세요: 300000
// 구매금액= 300000
// 청구금액= 270000