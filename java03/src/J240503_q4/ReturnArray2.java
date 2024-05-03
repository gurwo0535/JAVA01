package J240503_q4;

public class ReturnArray2 {
	public static void main(String[] args) {
	
		//나
		// 배열을 전달받아 
		int[] array = makeArray();
		
		//100을 더한값을 출력한다
		for (int i = 0; i < array.length; i++) {
			System.out.print((array[i]+100)+" ");
		}
	
	}	//배열을 리턴하는 makeArray() 작성
		public static int[] makeArray() {
		
		//정수 10개를 가지는 1차원 배열 생성
		int newArray[] = new int[10];		
		
		
		//1~10으로 초기화
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i+1;
		}
		
			return newArray;
	}
}



// t선생님
//public static int[] makeArray() {
//	int temp[] = new int[10];
//	
//	for (int i = 0; i < temp.length; i++) {
//		temp[i] = i+1;
//	}
//	return temp;
//	
//}
//
//public static void main(String[] args) {
//	int intArray[];
//	intArray = makeArray();
//	
//	for (int i = 0; i < intArray.length; i++) {
//		System.out.print(intArray[i]+100+" ");
//	}
//}
//}	



//
//급D2 : 배열 리턴(ReturnArray2)
//1
//정수10개를가지는일차원배열을생성하고1,2,3…10로초기화한다음, 배
//열을리턴하는makeArray()를 작성하고, 이 메소드로부터 배열을 전달받아
//100을 더한 값을출력하는프로그램을작성하라.
//101 102 103 104 105 106 107 108 109 110 
