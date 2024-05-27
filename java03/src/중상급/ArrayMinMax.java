package 중상급;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		
		System.out.println("양수 10개를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int num[] = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		int min = Arrays.stream(num).min().getAsInt();
		int max = Arrays.stream(num).max().getAsInt();
		
		System.out.println("가장 작은수는 "+min+"이고, 가장 큰 수는 "+max+"이고, "
				+ "최소값+최대값은 "+(min+max)+"입니다");
		
	}
	
}


//양수 10개를 입력 받아 배열에 저장하고, 제일 작은 수와 제일 큰수를 더한
//값을 출력하는 프로그램을 작성하라. 
//양수 10개를 입력하세요.
//10
//9
//8
//7
//6
//5
//14
//13
//12
//11
//가장 작은 수는 5이고,가장 큰 수는 14이고,
//최소값+최대값은 19입니다