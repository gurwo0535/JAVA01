package J0517;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
	
	ArrayList<String> a =  new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	for (int i = 0; i < 4; i++) {
		 System.out.print("이름을 입력하세요 : ");
		 String s = scanner.next();
		a.add(s);
		
	}
	for (int i = 0; i < a.size(); i++) {
		String name = a.get(i);
		System.out.print(name+ " ");
		
	}
		int longsetIndex=0;
		for (int i = 0; i < a.size(); i++) {
			//a.get(0).length() < a.get(0).length()
			//a.get(0).length() < a.get(1).length()  / 참이면 longsetIndex=i
			//a.get(0 or 1).length() < a.get(2).length()/ 참이면 longsetIndex=i
			//a.get(0 or 1 or 2).length() < a.get(3).length()/ 참이면 longsetIndex=i
			if (a.get(longsetIndex).length() < a.get(i).length()) {
				longsetIndex=i;
			}
			
		}
		
		System.out.println("\n가장 긴 이름은 : "+a.get(longsetIndex));
		scanner.close();
		//나 
//		Scanner scanner = new Scanner(System.in);
//		
//		 ArrayList<String> array = new ArrayList<>();
//		String allname = null;
//		 
//		 for (int i = 0; i < 4; i++) {
//			 System.out.print("이름을 입력하세요 : ");
//			 String name = scanner.next();
//			 array.add(name);
//			 if (i == 3) {
//				 System.out.print(name+" ");
//			 } 
//			  allname+= name;
//			 
//		}
	}
}


//이름을 4개 입력받아 ArrayList에 저장하고 모두 출력한 후 제일 긴 이름을 출력하라
//이름을 입력하세요>>Mike
//이름을 입력하세요>>Jane
//이름을 입력하세요>>Ashley
//이름을 입력하세요>>Helen
//Mike Jane Ashley Helen 
//가장 긴 이름은 : Ashley
