package J240503_q4;

import java.util.Scanner;

public class Arraymin_1 {
	public static void main(String[] args) {
		
//int min = 0; // 최소값은 구할떄 초기값을 0으로 잡으면 0이 가장작기에 답을 구할수없음
		
		int min = Integer.MAX_VALUE;
		//인트 타입의 가장큰 숫자로 초기화 
		
//		if (i == 0) {
//			min =intArray[i];
//		}  초기화 한다면 i의 첫값을 0으로 잡지않아도되기에 삭제한다 
		
		
		System.out.println("양수 7개를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[7];
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
			
//			1.첫번쨰 방법
//			첫번쨰 반복할때 무조건 배열원소를 min에 저장
			//배열의 첫값에 양수를 집어넣어서 가능하게 만들기
			if (i == 0) {
				min =intArray[i];
				
			}
			
			
			if (intArray[i]<min) {
				min =intArray[i];
			}
		}
		
		System.out.println("가장 작은 수는 : "+min+"입니다");
		sc.close();
		
		
		
	}
}		
		
//		나  ㅇㅋ 
//		System.out.println("양수 7개를 입력하세요 : ");
//		Scanner sc = new Scanner(System.in);
//		
//		int num[] = new int [7];
//		// 포인트
//		int min = sc.nextInt(); // 첫 번째 수로 초기화
//		
//		for (int i = 1; i < num.length; i++) {// 두 번째 요소부터 반복
//			num[i] = sc.nextInt();
//			
//			if (num[i]<min&&num[i]>0) {// 0보다 큰 수만 고려
//				min = num[i];
//	
//				
//			}
//		}
//		System.out.println("가장 작은 수는 : "+min+"입니다");
//	}
//}
//	

//중급C8 : 배열에 입력받은 수중제일작은수찾기(ArrayMin)
//1
//양수7개를입력받아배열에저장하고,제일작은수를출력하는프로그램을작성하라. 
//양수7개를입력하세요.
//5
//4
//2
//7
//8
//9
//10
//가장작은수는2입니다.