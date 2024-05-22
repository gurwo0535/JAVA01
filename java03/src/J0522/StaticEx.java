package J0522;

import java.util.Arrays;

/// 나 
//class ArrayUtil {
//	 public static int[] concat(int[] a, int[] b) {
//		 int[] result = new int[a.length + b.length];
//		
//		return result;	 
//	 }
//	 
//	 public static void print(int[] a) {
//		System.out.print("[");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+ " ");
//		}
//		System.out.println("]");
//	 }
//}
//	  -- [0,0,0,0,0,0,0,0,0] 나옴 
	

 // 선생님  ----------------------------------------------
class ArrayUtil {
	//concat() : 스트링 값을 합치는 메소드 
	 public static int [] concat(int[] a, int[] b) {
		 int[] result = new int[a.length+b.length];
		 
		 for (int i = 0; i < a.length; i++) {
			result[i]=a[i];
		}
		 for (int i = 0; i < b.length; i++) {
			 int index = a.length+i;
			 result[index]=b[i];
		 }
		return result;
		 
		 }
	
	 public static void print(int[] a) {
		 System.out.print("[");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+ " ");
			}
			System.out.println("]");
	 }
}


public class StaticEx {
	
	public static void main(String[] args) {
		
		int [] array1 = { 1, 5, 7, 9 };
		int [] array2 = { 3, 6, -1, 100, 77 };
		int [] array3 = ArrayUtil.concat(array1, array2);
		 ArrayUtil.print(array3);
		
	}
}


//다음2개의static 가진 ArrayUtil 클래스를 만들어 보자. 다음 코드의 실행
//결과를참고하여concat()와 print()를 작성하여 ArrayUtil 클래스를 완성하
//라.
//  class ArrayUtil {
// 
//  }
// public static int [] concat(int[] a, int[] b) {}
// public static void print(int[] a) {}
//  public class StaticEx {
// 
// 
// 
// 
// public static void main(String [] args){
// int [] array1 = { 1, 5, 7, 9 };
// int [] array2 = { 3, 6, -1, 100, 77 };
// *.출력
//[ 1 5 7 9 3 6 -1 100 77 ]
// int [] array3 = ArrayUtil.concat(array1, array2);
// 
// 
// ArrayUtil.print(array3);
//	}
//}