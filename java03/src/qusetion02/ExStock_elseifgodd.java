package qusetion02;

import java.util.Scanner;

public class ExStock_elseifgodd {
	public static void main(String[] args) {


	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("코스피 지수를 입력하세요(1800~2500) : ");
		int kospi = sc.nextInt();
		System.out.print("환율을 입력하세요(1100~1200) : ");
		int rate = sc.nextInt();
	
		
		if (rate<1150) {
			if (kospi>=2300) {
				System.out.println("상승장");
			}else if (kospi>=2000) {
				System.out.println("횡보장");
			}else {
				System.out.println("히락장");				
			}
		} else {	
			if (kospi>=2200) {
				System.out.println("상승장");
			}else if (kospi>=2000) {
				System.out.println("횡보장");
			}else {
				System.out.println("히락장");				
			}

		}
	}
}

		
		
//		if (cospy>=2300 || (cospy>=2200&&dollar>=1150)) {
//			System.out.println("상승장");
//		} else if(cospy>=2000 || cospy>=2000 && dollar>=1150){
//			System.out.println("횡보장");
//		}else {
//			System.out.println("하락장");
//			
//		}
		
//중급5 중첩if-else 문 사례(ExStock)
//1
//코스피지수와환율을입력받아환율이1150이상인경우는
//코스피가2200 이상이면상승장, 2199~2000이면 횡보장을 출력한다.
//환율이1150미만인 경우는
//코스피가2300 이상이면상승장, 2299~2000이면 횡보장을 출력한다. 
//단코스피지수가2000 미만이면하락장을출력한다.
