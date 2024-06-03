package 중급2;

import java.util.Scanner;
// 또 틀림 미친 
public class ExStock_2또틀림 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int KOSPI, rate;
		System.out.print("코스피 지수 :");
		KOSPI = scanner.nextInt();
		System.out.print("환율 :");
		rate = scanner.nextInt();

		if (rate<1150) {
			if (KOSPI>=2300) {
				System.out.println("상승장");
			}else if (KOSPI>=2000) {
				System.out.println("횡보장");
			}else {
				System.out.println("히락장");				
			}
		} else {	
			if (KOSPI>=2200) {
				System.out.println("상승장");
			}else if (KOSPI>=2000) {
				System.out.println("횡보장");
			}else {
				System.out.println("히락장");				
			}

		}
		
		
		
//		if (KOSPI >= 2300) {
//			if (KOSPI >= 2200 && rate >= 1150) {
//				System.out.println("상승장");
//			} else {
//			}if (KOSPI >= 2200) {
//					if (KOSPI >= 2000 && rate >= 1150) {
//						System.out.println("횡보장");
//					}
//				}
//			
//		}else {
//				System.out.println("하락장");
//				
//			
//		}
		
	}
}
