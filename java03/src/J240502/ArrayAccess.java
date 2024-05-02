package J240502;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		
		
		//선생님
		int max = 0;
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[5];
		System.out.println("양수 5개를 입력하시오 : ");
		
		for (int i = 0; i < intArray.length; i++) {
//			5번 반복해서 양수 5개를 배열원소에 저장 
			intArray[i] = sc.nextInt();
			
		}
		
//		벼열 원소에 저장된 ex){1.2.3.4.5}를 받아서 
//		if에돌려 가장 큰값을 저장해서 프린트
		for (int i = 0; i < intArray.length; i++) { 
			if (intArray[i] > max) {
				max = intArray[i];
			}
			
		}
		
		System.out.println("가장 큰 수는 "+max+"입니다.");
		
	}
}		
		
		// 쳇 지피티 
//int max = Integer.MIN_VALUE;를 사용하지않고 값을 비교하는법을 모르겟음 
//		System.out.println("양수 5개를 입력하시오 : ");
//		Scanner sc = new Scanner(System.in);
//		
//		int[] num = new int[6];
//		
//		int max = 0;
//		
//		for (int i = 1; i < num.length; i++) {
//			num[i] = sc.nextInt();
//			if (num[i] >  num[i-1] ) {
//			
//				max = num[i];
//				
//		}
//	}
//		System.out.println("가장 큰 수는 "+max+"입니다.");
//}
//}








//중급C3 : 배열에 입력받은 수중제일큰수찾기(ArrayAccess)
//1
//양수5개를입력받아배열에저장하고,제일큰수를출력하는
//프로그램을작성하라. 
//양수5개를입력하세요.
//1
//39
//78
//100
//99
//가장큰수는100입니다.