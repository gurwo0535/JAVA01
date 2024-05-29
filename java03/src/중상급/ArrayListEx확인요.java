package 중상급;

import java.util.Scanner;

// 버블소팅 가능 유무 

public class ArrayListEx확인요 {
	public static void main(String[] args) {
		String text[] = new String[4];
		Scanner scanner = new Scanner(System.in);
		
		int maxText = 0;
		
		
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 : ");
			text[i] = scanner.next();
//			result = text[i];
			
			if (text[0].length()>0) {
				maxText = text[0].length();
			}else if (text[0+i].length() > maxText) {
				maxText = text[0+i].length(); 
			}else {
				System.out.println(maxText);
			}
	
		
		
	}
}
}
// ====================선생님 ================================
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ArrayListEx {
//	public static void main(String[] args) {
//	
//	ArrayList<String> a =  new ArrayList<>();
//	Scanner scanner = new Scanner(System.in);
//	
//	for (int i = 0; i < 4; i++) {
//		 System.out.print("이름을 입력하세요 : ");
//		 String s = scanner.next();
//		a.add(s);
//		
//	}
//	for (int i = 0; i < a.size(); i++) {
//		String name = a.get(i);
//		System.out.print(name+ " ");
//		
//	}
//		int longsetIndex=0;
//		for (int i = 0; i < a.size(); i++) {
//			if (a.get(longsetIndex).length() < a.get(i).length()) {
//				longsetIndex=i;
//			}
//			
//		}
//		
//	System.out.println("\n가장 긴 이름은 : "+a.get(longsetIndex));
//	scanner.close();
//	}
//}
// =========================================================

//이름을 4개 입력받아 ArrayList에 저장하고 모두 출력한 후 제일 긴 이름을 출력하라
//이름을 입력하세요>>Mike
//이름을 입력하세요>>Jane
//이름을 입력하세요>>Ashley
//이름을 입력하세요>>Helen
//Mike Jane Ashley Helen 
//가장 긴 이름은 : Ashley
