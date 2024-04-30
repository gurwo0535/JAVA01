package qusetion02;

import java.util.Scanner;

public class Nestedlf {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100) >> ");
		int score = sc.nextInt();
		System.out.print("학년을 입력하세요(0~4) >> ");
		int year = sc.nextInt();
		
		
		
		
		if (score >=60) {
			if (year !=4) {
				System.out.println("합격");
			} else if(score>=70){
				System.out.println("합격");
			}
		}else if(score<60) {
			System.out.println("블합격");
		}
	}
}
		
//		if (year>=4 && score>=75) {
//			System.out.println("합격");
//		} else if(score>=60&& year<=3) {
//			System.out.println("합격");
//
//		}else {
//			System.out.println("불합격");
//			
//		}
		

//중급4 중첩if-else 문(NestedIf)
//1
//점수와학년을입력받아60점이상이면합격, 
//미만이면불합격을출력한다. 4학년의경우70점이상이어야합격이다. 
//점수를입력하세요(0~100): 65
//학년을입력하세요(1~4): 4
//불합격
