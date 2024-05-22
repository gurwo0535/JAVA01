package iamgood;

import java.util.Arrays;

public class BubbleSorting2 {
	public static void main(String[] args) {
		
		int score[] = new int[7];
		int temp;
		
		for (int i = 0; i < score.length; i++) {
			score[i] = (int)(Math.random()*45+1);
		}
		System.out.print("정렬 전 : ");
		System.out.println(Arrays.toString(score));
		
		System.out.println("-------------------------");
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length-1; j++) {
				if (score[j]>score[j+1]) {
					temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
				}
			}
			// for문 안에 위치해 흐름을 눈으로 볼수 있다.
			System.out.println("\t"+Arrays.toString(score));
			
		}
		//메인 메소드 안에 있기 떄문에 프린트메소드가 사용가능하다 
		System.out.println("-------------------------");
		System.out.print("정렬 후 : ");
		System.out.println(Arrays.toString(score));
		
	}
	
	
}
