package 중상급;

// 배열 공부 더 많이 하기 

public class ArrayParameterEx {
	
	public static void printStringArray(String[] text) {
		for (int i = 0; i < text.length; i++) {
			System.out.print(text[i]+" ");
		}
		System.out.println();
	}
	
	public static void replaceBe(String[] text) {
		for (int i = 0; i < text.length; i++) {
			if (text[i].equals("be")) {
				text[i] = "eat";
				
			}
		}
	}
	
	public static void main(String[] args) {
		
		
		// 문자 배열 쓰는법 제발좀 외워 병신아
		String text[] = {"to","be","or","not","to","be"};
		
		printStringArray(text);
		replaceBe(text);
		
		printStringArray(text);
		
		

	}
}


// String[] 배열을 전달받아 출력하는 printStringArray() 메소드와
//배열속의“be” 문자열을 “eat”로 대치하는 replaceBe() 메소드
//를작성하라.
// to be or not to be
// to eat or not to eat