package J0517;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		 ArrayList<String> array = new ArrayList<>();
		String allname = null;
		 
		 for (int i = 0; i < 4; i++) {
			 System.out.print("이름을 입력하세요 : ");
			 String name = scanner.next();
			 array.add(name);
			 if (i == 3) {
				 System.out.print(name+" ");
			 } 
			  allname+= name;
			 
		}
	}
}


//이름을 4개 입력받아 ArrayList에 저장하고 모두 출력한 후 제일 긴 이름을 출력하라
//이름을 입력하세요>>Mike
//이름을 입력하세요>>Jane
//이름을 입력하세요>>Ashley
//이름을 입력하세요>>Helen
//Mike Jane Ashley Helen 
//가장 긴 이름은 : Ashley
