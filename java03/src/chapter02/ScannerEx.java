package chapter02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		
//		System.in : 바이트 표준 입력 스트림
//		System.in : 매개변수 (인자, 파라미터, argument)

//		sc : 변수
//		new Scanner(System.in) : 객체 생성
		Scanner sc = new Scanner(System.in);
//		sc : 객체
//		next(); : 문자열 입력받는 메소드
		String name =  sc.next();
		String city = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		boolean single = sc.nextBoolean();
		
//		입력 받을때 스페이스나 탭으로 구분해서 토큰단위로 받음
		System.out.println("이름은 " + name);
		System.out.println("도시는 " + city);
		System.out.println("나이는 " + age +"살");
		System.out.println("몸무게는 " + weight + "kg");
		System.out.println("독신 여부는 " + single + "입니다");
		
		
//		sc.close(); : Scanner 객체 종료(자원 반납)
//		-- 메모리를 더 사용할 수 있고, 안하면 가비지 콜렉터가 자동으로 정리
		sc.close();
	
		
		
	}
}
