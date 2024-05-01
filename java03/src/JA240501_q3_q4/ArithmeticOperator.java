package JA240501_q3_q4;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		
		System.out.print("정수를 입력하세요 : ");
		Scanner sc= new Scanner(System.in);
		int a  =sc.nextInt();
		
		int hour =  a/3600;
		int min = a%3600/60;
		int sec = a%3600%60;
		
		
		System.out.println(a+"초는 "+hour+"시간, "+min+"분, "+sec+"초입니다.");
		sc.close();
	}
}

//급10 % 산술연산(ArithmeticOperator)
//1
//초단위의정수를입력받고, 몇시간, 몇분, 몇초인지출력하는프로그
//램을작성하라.
//정수를입력하세요:5000
//5000초는 1시간, 23분, 20초입니다.