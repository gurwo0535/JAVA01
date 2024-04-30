package qusetion02;

import java.util.Scanner;

public class ArithmeticExlf {
	public static void main(String[] args) {
		
		System.out.print("연산 >> ");
		
		Scanner sc =new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		int c = sc.nextInt();
		int res = 0;
		//선생님
		
		if (b.equals("+")) {
			res = a+c;
		}else if (b.equals("-")) {
			res = a-c;
		}else if (b.equals("x")) {
			res = a*c;
		}else if (b.equals("^")) {
			res = (int) Math.pow(a, c);
		}else if (b.equals("/")) {
			if (c == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;  // 여기서 끝내버림
			}else {
				res = a/c;				
			}
		}else {
			//  사칙연산기호를 제외한 글자는 이게 뜬다
			System.out.println("사칙 연산이 아닙니다.");
			return;
		}
	
		System.out.println(a+b+c+"의 계산 결과는 "+(res) );
	}
}
		
		
		//나
//			if (b.equals("+")) {
//			res = a+c;
//		}else if (b.equals("-")) {
//			res = a-c;
//		}else if (b.equals("x")) {
//			res = a*c;
//		}else if (b.equals("/")) {
//			 if (a==0||c==0) {
//				System.out.println("0으로 나눌 수 없습니다.");
//				return;
//			}
//			 // res = a/c; 나누기는 추가로 if가 들어가서 0이 될경우 꺼버리기떄문에 
//			 res = a/c;
//		}
		

