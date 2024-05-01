package JA240501_q3_q4;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		
		System.out.println("exit 입력시 종료됩니다 : ");
		Scanner sc = new Scanner(System.in);
		
		
		//무한반복 : 반복횟수는알수 없음(exit가 나오면 break)
		while (true) {
			System.out.print(">> ");
			String a = sc.next();
			
			//입력값중에 글자를선택해 수행하는 메소드
			//입력받은 붐자열이 exit 면 빠져나옴
			if (a.equals("exit")) {
				break;
			}
		}
		System.out.println("삐빅...종료합니다...");
		sc.close();
	}
}




//중급B 6 : break 문을 이용하여 while 문 벗어나기(BreakExample)
//1
//"exit"이 입력되면 while 문을 벗어나도록 break 문을 활용하는
//프로그램을작성하라.
//exit을 입력하면 종료합니다.
//>>edit
//>>exit
//종료합니다...