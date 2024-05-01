package JA240501_q3_q4;

import java.util.Scanner;

public class CalculateGrade {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("부정 행위 여부 : ");
		
	boolean	cheating = sc.nextBoolean();// 선생님
	
//			String cheating = sc.next();  나  //
	
 		System.out.print("출석률 : ");
			int attendrate = sc.nextInt();
		System.out.print("총점 : ");
			int totalscore = sc.nextInt();
		
			
			char grade;//선생님 
//		String grade ; // 나

		
			//선생님
		if (cheating) {
			grade= 'F';
		}else if (attendrate<80) {
			grade= 'F';
		}else {
			if (totalscore>=90) {
				grade='A';
			}else if (totalscore>=80) {
				grade='B';
			}else if (totalscore>=80) {
				grade='C';
			}else if (totalscore>=80) {
				grade='D';
			}else {
				grade='F';
			}
		}
		System.out.println("학점은 : "+grade);
	}
}
	
		
/*		
		if (cheating.equals("true")) {
			grade = "F";
		} else if(attendrate<80){
			grade = "F";
		}else {
			switch (totalscore/10) {
		case 9:
			grade =  "A";
			break;
		case 8:
			grade =  "B";
			break;
		case 7:
			grade =  "C";
			break;
		case 6:
			grade =  "D";
			break;

		default:
			grade = "F";
			break;
			
			}
		}
		System.out.println("당신읜 학점은 "+grade+"학점입니다.");
		

	}
}
*/

//
//
//중급B 8 학생의 부정행위여부, 출석률과총점을
//입력받아학점을부여한다(CalculateGrade)
//
//변수들
//cheating: 부정행위 여부
//attendrate: 출석률
//totalscore: 총점
//grade: 학점
//알고리즘
//부정행위여부(true 혹은 false): false
//출석률(0~ 100사이의 정수값): 80
//총점(0~ 100사이의 정수값): 90
//학점= A
//부정행위여부를입력받아cheating에 저장한다.
//출석률을입력받아attendrate에 저장한다.
//총점을입력totalscore에 저장한다
//cheating이 true라면 grade = ‘F’ 이다.
//  아니면attendrate < 80 이면 grade = 'F'
//아니면
//
//  5.
// totalscore >= 90이면 grade = 'A'
//아니고totalscore >= 80 이면 grade = 'B'
//아니고totalscore >= 70 이면 grade = 'C'
//아니고totalscore >= 60 이면 grade = 'D'
//아니고grade = 'F';
//학점을출력한다
