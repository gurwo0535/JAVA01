package J0513;

import java.util.Scanner;

public class Computelnterest {
	public static void main(String[] args) {
	
		int principal;//원금
		double rate;//연이율
		double balance;//원리금
		int years=0;

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원금을 입력하세요 : ");
		principal = scanner.nextInt();
		System.out.print("연이율을  입력하세요 : ");
		rate = scanner.nextDouble();
		
		balance = principal;

		System.out.println("연도수\t원리금");
		
		
		
//		do {   // do whlie 문 
//			years++;
//			balance = balance * (1.0 + rate / 100.0) ;
//			System.out.println(years+"\t"+balance);
//		} while (balance<=principal*2);
//
//		
		
		
		while (balance<=principal*2) {
				System.out.println(years+"\t"+balance);
				balance = balance * (1.0 + rate / 100.0) ;
				years++;
		}
		System.out.println("\n필요한 연도수 : "+years);
		scanner.close();
	}
}



//main 메소드설계
// (1)변수
// principal: 원금
// rate: 연이율
// balance: 원리금
// years: 연도수
// scan: Scanner 객체참조변수
// (2)알고리즘
// ① years = 0
// ② "원금을입력하세요"를출력한다.
// ③원금을입력받아principal에저장한다.
// ④ "연이율을입력하세요"를출력한다.
// ⑤연이율을입력받아rate에저장한다.
// ⑥ “연도수원리금”을출력한다.
// ⑦ balance = principal
// ⑧ years = years + 1
// ⑨ balance = balance * (1.0 + rate / 100.0) // 1년후원리금을계산한다.
// ⑩ years와balance를출력한다.
// ⑪ balance가principal(원금)의두배보다작거나같으면(8) 번으로간다.
// ⑫ years를출력한다
//
//원금을입력하세요: 1000000
//연이율을입력하세요: 3.3
//연도수원리금
//1 1032999.9999999999
// 2 1067088.9999999998
// 3 1102302.9369999997
// 4 1138678.9339209995
// 5 1176255.3387403924
// 6 1215071.7649188251
// 7 1255169.1331611462
// 8 1296589.714555464
// 9 1339377.175135794
// 10 1383576.6219152752
// 11 1429234.6504384791
// 12 1476399.3939029488
// 13 1525120.573901746
// 14 1575449.5528405034
// 15 1627439.3880842398
// 16 1681144.8878910195
// 17 1736622.6691914229
// 18 1793931.2172747396
// 19 1853130.9474448059
// 20 1914284.2687104843
// 21 1977455.64957793
// 22 2042711.6860140017
//필요한연도수= 2
