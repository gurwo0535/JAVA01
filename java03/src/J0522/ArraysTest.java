package J0522;

import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		
		int[] array = {9,4,5,6,2,1};
		printArray(array);
		System.out.println();
		// sort() : 정렬한다
		Arrays.sort(array);
		printArray(array);
		System.out.println();
		
		//9를 탐색한다. (인덱스 변환, 없으면 음수)
		System.out.println(Arrays.binarySearch(array, 9));
		//-1를 탐색한다. / 값이 없으면 음수로 랜덤 도출 
		System.out.println(Arrays.binarySearch(array, -1));
		System.out.println(Arrays.binarySearch(array, 0));
		System.out.println(Arrays.binarySearch(array, 3));
		System.out.println(Arrays.binarySearch(array, 7));
		System.out.println(Arrays.binarySearch(array, 10));
		System.out.println(Arrays.binarySearch(array, 99));
		
		//fill(array, 8) : 배열 안을 지정하는 숫자로 채운다.
		Arrays.fill(array, 8);
		printArray(array);
		
		
	}
//	printArray() : 배열을 매개변수로 받아서 출력하는 메소드 
	private static void printArray(int[] array) {
		
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(+array[i]+" ");
			
			
		}
		System.out.print("]");
		
	}
}
