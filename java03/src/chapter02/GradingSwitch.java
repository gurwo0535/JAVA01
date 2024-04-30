package chapter02;

import java.util.Scanner;

//점수를 입력받아서 등급 매기기 

public class GradingSwitch {
	public static void main(String[] args) {
		
		System.out.print("점수를 입력하세요(0~100) : ");
		
		char grade;
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
	
		
		switch (score/10) {
		case 10://100점입닏당
			grade = 'A';
		case 9://90~99점입닏당
			grade = 'A';
			break;
		case 8://
			grade = 'B';
			break;	
		case 7://9
			grade = 'C';
			break;	
		case 6://
			grade = 'D';
			break;
		default:
			grade = 'F';
			System.out.println("삐빅... 당신은 퇴학입니다.");
			break;
		}
		
		if (grade != 'F') {
			System.out.println("삐빅.. 학점은 " + grade + "입니다.");
	
		sc.close();
	}
	}
}
