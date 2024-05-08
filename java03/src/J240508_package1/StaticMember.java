package J240508_package1;

import java.util.Scanner;


/*
 * static 사용(필드, 메소드 )
 * 클래스 이름으로 static 맴버 접근 
 * 환율을 입력받아 100만원 몇달러 ?
 * 환율 -> 100달러가 몇원 ?
 * 
 * */

	//접근지정자 :  default
	class CurrencyConverter{
//		자기 클래스에서만 접근(객체생성없이)
//		맴버 변수는 일반적으로 private 많이사용 (보안 )
//		jsp,spring 할떄도 많이 사용 
//		메소드를 사용해서 맴버변수를 접근해서 사용 (직접적인 값 수정을 막음-> 보안)
//		getter(ex> getAbc:값을 가져올때), 
//		setter(ex>setAbc : 값을 저장할떄) 메소드 사용해서 맴버변수 사용
		private static double rate ;
			public static void setRate(double rate) {
				//매개변수를 클래스 맴버로 저장 
//				static맴버 = 클래스맴버
//						non-static맴버 == 객체 맴버
				CurrencyConverter.rate = rate;
			}
			
			//1300원, 환율 1300 -> 1300원/환율 1300 = 1달러 
		public static double toDollar(double won) {
			return won/rate;
		}
		public static double toKWR(double dollar) {
			return dollar*rate;
		}
	}
	
public class StaticMember {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("환율(1달러)>>>>>> ");
		double rate = scan.nextDouble();
		
		// setRate사용법 공부
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $"+CurrencyConverter.toDollar(1000000)+"입니다");
		System.out.println("100$는 "+CurrencyConverter.toKWR(100)+"입니다");
		
	}
}
