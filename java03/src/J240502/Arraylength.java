package J240502;

import java.util.Iterator;
import java.util.Scanner;

public class Arraylength {
	public static void main(String[] args) {

		
		//선생님
		double averageArr = 0;
		int intArray[] = new int[5];
		int sum=0 ;
		
		Scanner sc = new Scanner(System.in);
		System.out.print(intArray.length+"개의 정수를 입력하시오 >> ");
		
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
			sum+= intArray[i];
		}
		
		averageArr= sum/intArray.length;
		
		System.out.println(averageArr);
	}
}		
		
		//나 오답 나옴 
//		double averageArr = 0;
//		int sum = 0;
//		System.out.print("5개의 정수를 입력하시오 >> ");
//		Scanner sc = new Scanner(System.in);
//		int intArr[] = new int[5];
//		
//		for (int i = 0; i < intArr.length; i++) {
//			intArr[i] = sc.nextInt();
//			sum += intArr[i];
//		}
//		
//		averageArr = sum+intArr.length;
////		
//		
//		System.out.println("평균은 : "+averageArr);
//
//
//
//	}
//}




//
//
//중급C 4 : 배열원소의평균구하기(ArrayLength)
//1
//배열의length 필드를 이용하여배열크기만큼정
//수를입력받고평균을구하는프로그램을작성
//하라.
//5개의 정수를입력하세요>> 2 3 4 5 9
//평균은4.6