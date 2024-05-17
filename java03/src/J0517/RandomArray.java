package J0517;

import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = scanner.nextInt();
		int array[] = new int[num];
		
		for (int i = 0; i < array.length; i++) {
			int r = (int)(Math.random()*100)+1;
			array[i] =r;
			if (i==0) {
				System.out.print(array[i]+" ");
				
			} else {
				if (i%10==0) {
					System.out.println();
				}
				System.out.print(array[i]+" ");
			}
		}
		
	}
}		
		//나 
//		System.out.print("정수를 입력하시오 : ");
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		int n[] = new int[num];
//		int count = 0;
//	
//		for (int i = 0; i < n.length; i++) {
//			int r = (int)(Math.random()*100)+1;
//			n[i] =r;
//			System.out.print(n[i]+" ");
//			count++;
//			if (count%10 == 0) {
//				System.out.println();
//			}
//				
//			}
//		}
//	}

//정수를 몇 개 저장할지 키보드로부터 개수를 입력받아
//(100이하 개수) 정수 배열을 생성하고, 이곳에 1에서
//100까지 범위의 정수를 랜덤하게 삽입하라.
// *.출력
// 정수 몇개?24
// 48 29 69 57 95 21 11 91 37 63 
// 56 88 20 6 81 8 4 24 7 65 
// 1 89 72 90