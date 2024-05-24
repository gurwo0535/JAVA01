package 중급;

import java.util.Scanner;

// 답 안나옴 다시 확인 요망 

public class NestedIf확인 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int score,grade ;
	
	System.out.print("점수를 입력하세요(0~100) :  ");
	score = scanner.nextInt();
	System.out.print("학년을입력하세요(1~4) :  ");
	grade = scanner.nextInt();

	
		if (score >=60) {
		}if (grade !=4) {
			System.out.println("합격");	
		}else if (score>=70) {
			System.out.println("합격");				
		}else if (score<60) {
			System.out.println("꾸짓을 갈");
		}
	}
	
}
//if (score >=60) {
//	if (year !=4) {
//		System.out.println("합격");
//	} else if(score>=70){
//		System.out.println("합격");
//	}
//}else if(score<60) {
//	System.out.println("블합격");
//	
	
	
	// 나 실패 
//	 if (grade == 4) {
//	} else if(score>=70){
//		System.out.println("합격");	
//	}
//	else {
//		
//		}
//	 if (score>=60) {
//		 System.out.println("합격");	
//		System.out.println("꾸짓을 갈");
	 
	


//점수와학년을입력받아60점이상이면합격, 
//미만이면불합격을출력한다. 4학년의경우70점이상이어야합격이다. 
//점수를입력하세요(0~100): 65
//학년을입력하세요(1~4): 4
//불합격!