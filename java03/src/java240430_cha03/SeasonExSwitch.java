package java240430_cha03;

import java.util.Scanner;

public class SeasonExSwitch {
	public static void main(String[] args) {
		
		System.out.print("달을 입력하세요(1~12) >> ");
		Scanner sc =new Scanner(System.in);
		int month = sc.nextInt();
		
		String gyezul = null;
		
		
		switch (month) {
		case  12,1,2   :
			gyezul = "겨울";
			break;
		case  3,4,5   :
			gyezul = "봄";
			break;
		case  6,7,8   :
			gyezul = "여름";
			break;
		case  9,10,11   :
			gyezul = "가을";
			break;

		default:
			System.out.println("삐빅");
			break;
		}
		if (month>=1 && month<=12) {
			System.out.println(gyezul + "이 도래했다..");
		}
		sc.close();
	}
}


//기본9 switch(SeasonExSwitch)
//1
// 숫자를입력받아3~5는“봄”, 6~8은 “여름”, 9~11은 “가
//을”, 12,1,2의 경우 “겨울” 을, 그 외 숫자를 입력한 경우
//“잘못입력” 을 출력하는 프로그램을작성하라.
// *.출력
// 달을입력하세요(1~12)>>9
// 가을
// switch 문을 이용하여 프로그램을 작성하라.
