package java240430_cha03;

import java.util.Scanner;

public class ExMaxMin {
	public static void main(String[] args) {
		
		System.out.print("정수 3개 입력 >> ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max =0;
		int min =0;
		
		
		
		
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
		
		
		
//		if ((a>b&&a>c&&b<c) ){    값이 틀리게 나옴 
//			max = a;
//			min = b;
//		}else  if((a<b&&b>c&&a>c)) {
//			max = b;
//			min = c;
//		}else if((a<c&&b<c&&a<b)) {
//			max = c;
//			min = a;
//		}
		
		if (a==b || a==c || b==c) {
			System.out.println("삐빅");
		}else {
		System.out.println("최대값은 : "+ max);
		System.out.println("최대값은 : "+min);
		}
	}
}


//기본10 Scanner 와 if 문 연습(ExMaxMin)
//1
// Scanner 클래스로 정수 3개를 입력 받고3개의숫자중
//최대값과최소값을출력하라.
// 중복되지않는숫자를입력하라.
// *.출력
// 정수3개입력>>20 100 33
// 최대값은100
// 최소값은20