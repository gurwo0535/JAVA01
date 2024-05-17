package J0517;

//String[]; 사용 
//메소드를 호출해서 문자열을 변경 
//to be or not to be -> to eat or not to eat

public class ArrayParameterEx {
	// 문자열 배열을 매개변수로 받아서 출력 
	public static void printStringArray(String a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	public static void replaceBe(String a[]) {
		//문자열 배열을 매개변수로 받아서 "be"->"eat"로 변경 
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("be")) {
				a[i]="eat";
			}
		}
	}
	public static void main(String[] args) {
		//스트링 배열 생성하는법 
		String s[]= {"to ","be ","or ","not ","to ","be"};
		
		printStringArray(s);
		replaceBe(s);
		printStringArray(s);
	}
	
}
	
	
	//나
//	static String a= new String("be");
//	
//	static String b= new String("eat");
//
//	public static void printStringArray() {
//		String[] a = new String[6];
//		
//	}
//	public static void replaceBe() {
//		b = b.replace("be", "eat");		
//	}
//	public static void main(String[] args) {	
//	}
//}




//String[] 배열을 전달받아 출력하는 printStringArray() 메소드와
//배열 속의 “be” 문자열을 “eat”로 대치하는 replaceBe() 메소드를 작성하라
//to be or not to be
//to eat or not to eat