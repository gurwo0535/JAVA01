package java240430_cha03;

/*
 * 문자열에서 특정 문자를 찾는다
 * 찾은 갯수를 출력
 * ex>life is cool. /l -> 2개 
 */

public class ContinueTest {
	public static void main(String[] args) {
		int count = 0;
		//알파벳 n의 갯수
		String s= "no news is good news";
		
		//스페이스 포함해서 20자
		//length() : 문자열의 크기를 구하는 메소드
//		System.out.println(s.length());
		
		for (int i = 0; i < s.length(); i++) {
			//(s.charAt(0) : 첫번째 문자 0~
//			System.out.println(s.charAt(i));
			//charAt(i) : 문자를 가져오는 메소드
//			System.out.println(s.charAt(i));
			
			
			//n의 갯수를 구하는 메소드 사용법
			if (s.charAt(i) != 'n') {
				continue;
			}
			//n일떄 카운트 한다 
			count++;
		}
		System.out.println("문장에서 발견된 n의 갯수 : "+count);
	}
}
