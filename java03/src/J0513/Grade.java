package J0513;

import java.util.Scanner;


public class Grade {
	private int math;
	private int science;
	private int english;
	
	public  Grade(int math, int science, int english) {
		this.math = math;
		this.science =science;
		this.english = english;
	}
	public int Average() {
		return (math+science+english)/3;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("수학 과학 영어 순으로 3개의 정수입력 : ");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		
		
	}
	
}
	
	
//	static int math, science,english,average  ;
//	
//	public Grade(int math, int science, int english) {
//		this.math =math;
//		this.science =science;
//		this.english = english;
//		
//	}
//	private int average() {
//		average=(math+science+english)/3;
//		return average;
//	}
//	
//	public static void main(String[] args) {
//	
//		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
//		
//		Scanner scanner = new Scanner(System.in); 
//
//		int math = scanner.nextInt();
//		int science = scanner.nextInt();
//		int english = scanner.nextInt();
//		
//		Grade me = new Grade(math, science, english);
//		
//		
//		 System.out.println("평균은 " + me.average());
//		 scanner.close();
//	}
//}

//
//3과목의점수를입력받아Grade 객체를생성하고성적평균을출력
//하는main() 과 실행 예시는 다음과같다.
//  public static void main(String [] args) {
//  Scanner scanner = new Scanner(System.in);
//  System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
//  int math = scanner.nextInt();
//  int science = scanner.nextInt();
//  int english = scanner.nextInt();
//  Grade me = new Grade(math, science, english);
//  System.out.println("평균은 " + me.average());
//  scanner.close();
//  }
//  수학, 과학, 영어 순으로 3개의 점수입력>>90 88 96
//  평균은91