package J240502;

import java.util.Scanner;

public class DivideByZeroHanding {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int dividend;
			int divisor;
			
			while (true) {
			System.out.print("분자를 입력하시오 : ");
			dividend=sc.nextInt();
			System.out.print("분모를 입력하시오 : ");
			divisor=sc.nextInt();
			
			//오류(불능)상황일떄 정상적인 메세지로 처리
			try {
				
				//오류(불능)가 발생할수 있는 실행문을 try안에 넣는다 
				System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
				break;
				//try에서 오류 발생시 처리 /catch (Exception e)그대로 놔둠
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
			}
			}
			
			
			
			
			
	}
}
