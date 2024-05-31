package 상급;

import java.util.Scanner;
// 중복없는 랜덤 배열 숫자 
public class RandomArray2확인요망 {
	
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
		System.out.print("정수의 개수 : ");
		int num = scanner.nextInt();
		int arr[] = new int[num];
		
		for (int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random()*100)+1;
			if (exists(arr, i, random)) {
				i--;
				continue;
			};
		}
	
	}
}


// 정수를 몇 개 저장할지 키보드로부터 개수를 입력받아
//(100이하 개수) 정수 배열을 생성하고, 이곳에 1에서
//100까지 범위의 정수를 랜덤하게 삽입하라.
// 배열에는 같은 수가 없도록 하고 배열을 출력하라.
// *.출력
// 정수 몇개?24
// 48 29 69 57 95 21 11 91 37 63 
// 56 88 20 6 81 8 4 24 7 65 
// 1 89 72 90