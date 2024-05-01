package JA240501_q3_q4;

import java.util.Scanner;

public class ExGloblaStock {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("매수 금액을 입력하세요 : ");
		int mesu = sc.nextInt();
		System.out.print("매도 금액을 입력하세요 : ");
		int medo = sc.nextInt();
		
		double yangdo = (medo-mesu)*0.22;
		
		if (medo<=mesu) {
			System.out.println("양도세 : "+ 0.0);
		} else {
			System.out.println("양도세 : "+ yangdo);

		}
		
	}
}

//
//급9 해외주식양도세계산(ExGlobalStock)
//1
// 1. 매수금액, 매도금액을입력받는다.
// 2. 매도금액이매수금액보다크면
//양도세=(매도금액-매수금액)*22%
// 3. 매도금액이매수금액보다같거나작으면
//양도세=0
// 4. 양도세를출력한다.
// *.출력
// 매수금액을입력하세요: 100000
// 매도금액을입력하세요: 150000
// 양도세= 11000.0
// 매수금액을입력하세요: 90000
// 매도금액을입력하세요: 80000
// 양도세= 0.0