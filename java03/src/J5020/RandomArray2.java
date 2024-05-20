package J5020;

import java.util.Scanner;

public class RandomArray2 {
	//난수의 중복을 체크하는 메소드
	//a[]: array, to: 0, r: 23
	public static boolean exists(int a[], int to, int r) {
		for (int i = 0; i < to; i++) {
			if (a[i] == r) {
				return  true;
			}
		}
		return false;
	}
    public static void main(String[] args) {
   
    	Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = scanner.nextInt();
		int array[] = new int[num];
		
		for (int i = 0; i < array.length; i++) {
//			i = 0, r = 23
			int r = (int)(Math.random()*100)+1;
			if (exists(array, i, r)) {
				i--;
				continue;
			} ;
			
//			array[0] =23
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
    	
    	
//    	Scanner scanner = new Scanner(System.in);
//        System.out.print("정수를 입력하시오 (100 이하): ");
//        int num = scanner.nextInt();
//        int r;
//        int[] array = new int[num];
//     // 1~100까지의 숫자 사용 여부를 저장
//        boolean[] isUsed = new boolean[101]; 
//
//        for (int i = 0; i < num; i++) {
//            do {
//                r = (int) (Math.random() * 100) + 1;
//            } while (isUsed[r]);
//            array[i] = r;
//            isUsed[r] = true;	
//        }
//
//        // 배열 출력 (10개씩 줄 바꿈)
//        for (int i = 0; i < array.length; i++) {
//            if (i > 0 && i % 10 == 0) {
//                System.out.println();
//            }
//            System.out.print(array[i] + " ");
//        }
    }
}