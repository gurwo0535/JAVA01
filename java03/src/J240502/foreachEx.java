package J240502;


/*
 * 열거형 이용(+vlaues()a메소드 이용)
 * foreach이용
 */

public class foreachEx {
	//열거형 : inner class(내부 클래스) 형태
	enum week{월,화,수,목,금,토,일};

	public static void main(String[] args) {
		int[] n = {1,2,3,4,5}; 
		String names[] = {"사과","배","바나나","체리","딸기","포도"};
		int sum = 0;
		
		for (int k : n) {
			System.out.print(k+" ");
			sum += k ;
		}
		System.out.println("합은 : "+sum);
	
	
		for (String s : names) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		for (week day : week.values()) {
//			String str = day; // 열거형값으로 string값을 받을수 없음
			week str = day;
			
//			System.out.print(day+"요일 ");
//			System.out.println();
			System.out.print(str+"요일 ");
		}
		
//		System.out.println(str[0]);
		
	}
}
