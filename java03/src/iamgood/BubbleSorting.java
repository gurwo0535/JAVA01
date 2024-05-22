package iamgood;

import java.util.Arrays;

public class BubbleSorting {
	public static void main(String[] args) {
		
		int[] BS = {10,6,5,3,2,1,4};
		
		System.out.println("정렬 전 : "+Arrays.toString(BS));
		int tmp = 0;
		for (int i = 0; i < BS.length; i++) {
			for (int j = 0; j < BS.length-1; j++) {
				
				if (BS[j]>BS[j+1]) { // 오름차순
//				if (BS[j]<BS[j+1]) { // 내림차순 
					tmp = BS[j];
					BS[j]=BS[j+1];
					BS[j+1] = tmp;
					
//				swap(&BS[j], &BS[j+1]);	
				}
			}
			System.out.println("\t"+Arrays.toString(BS));
		}
		System.out.println("정렬 후 : " +Arrays.toString(BS));
	}
}

//
//이 문제는 버블소팅 관련 문제이다. 
//[6 5 2 1 4 3] 을 오름차순으로 만들기 위해선 
//0과1, 1과2, 2과3, 3과4, 4과5 이렇게 비교를 해가며 작은 수를 오른쪽으로 이동시켜주는 것이 포인트이다.
//또한, 수를 이동시킬 때에는 변수를 하나 만들어 두 값을 바꾸는 방법을 사용한다.
//회차수? 모든 인덱스의 수만큼 비교하기 위해 iArr.length-1번 해야한다.
//비교횟수? 모든 인덱스를 하나하나 비교하기 위해 iArr.length-1를 해야 하나, 
//		여기서 또 마지막 값은 점점 고정되어 가기 때문에 굳이 할 필요가 없어지므로, 
//		-i 또한 붙여주게 되어 iArr.length-(1+i)가 된다.