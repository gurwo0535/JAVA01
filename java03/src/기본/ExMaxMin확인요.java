package 기본;

import java.util.Scanner;

// 숫자의 크고 작음 구별법 
// 큰값 작은값 중간값 가정법으로 구하기 연습 필요 

public class ExMaxMin확인요 {
	public static void main(String[] args) {
		int a,b,c;
		
		System.out.print(" 정수3개입력>>  ");
		
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		int max,min;
		
		if (a>b && a>c) {
			max =a ;
		} else if (b>a && b>c) {
			max = b;
		} else  {
			max = c;
		}
		
		if (a<b && a<c) {
			min =a ;
		} else if (b<a && b<c) {
			min = b;
		} else  {
			min = c;
		}
	
		if (a==b || b == c || a==b ) {
			System.out.println("중복입니다");
		}else {
			System.out.println("최대값은 : "+max);
			System.out.println("최소값은 : "+min );
			
		}
			
		
		
		//else에서 최소값 도출시 오류 --------------------
//		while (a !=b && a!=c && b!=c) {
//			if (a >b && a>c && b>c) {
//				System.out.println("최대값은 : "+a);
//				System.out.println("최소값은 : "+c);
//			} else if(b >c && b>a && c>a){
//				System.out.println("최대값은 : "+b);
//				System.out.println("최소값은 : "+a);
//			}else {
//				System.out.println("최대값은 : "+c);
//				System.out.println("최소값은 : "+b);
//			}
//			break;
//		}
	}
}


//Scanner 클래스로 정수 3개를 입력 받고3개의숫자중
//최대값과최소값을출력하라.
// 중복되지않는숫자를입력하라.
// *.출력
// 정수3개입력>>20 100 33
// 최대값은100
// 최소값은20