package java240430_cha03;

import java.util.Scanner;

public class SeasonExlf {
	public static void main(String[] args) {
		
		System.out.print("달을 입력하세요(1~12) >> ");
		Scanner sc = new Scanner(System.in);
		int dal = sc.nextInt();
//		String a = sc.next();
		String gye = null ;
		
		
		
//		dal >=3 && dal <=5 --- 간소화 하면 이렇게 됨 
		
		if (dal == 3 || dal == 4 || dal == 5 ) {
			gye = "봄";
		}else if (dal == 6 || dal == 7 || dal == 8 ) {
			gye = "여름";
		} else if (dal == 9 || dal == 10 || dal == 11 ) {
			gye = "가을";
		}else if (dal == 12 || dal == 1 || dal == 2 ) {
			gye = "겨울";
		}else {
			System.out.println("삐빅.. 틀렸습니다");
		}
		
		if(dal>=0 && dal<=12) {
		System.out.println(gye + " 와쪄여~~~~ ^^7");
		}
		sc.close();
	}
}


//기본 8 if-else(SeasonExIf)
// 숫자를 입력 받아 3~5는 “봄”, 6~8은 “여름”, 9~11은 “가
//을”, 12,1,2의 경우 “겨울” 을, 그 외 숫자를 입력한 경우
//“잘못입력” 을 출력하는 프로그램을 작성하라.
// *.출력
// 달을 입력하세요(1~12)>>9
// 가을
// if-else 문을 이용하여 프로그램을 작성하라.