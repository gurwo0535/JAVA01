package J240502;

/*
 * 예외 처리 
 * 배열 인덱스 벗어나는 것 
 */

public class ArrayException {
	public static void main(String[] args) {
		
		int[] intArray= new int[5];
		intArray[0]=0;
		
		try {
			for (int i = 0; i < intArray.length; i++) {
				//0+1+0 -> intArray[1]=1; i=0
				//1+1+1 -> intArray[2]=3 i=1
				//2+1+3 -> intArray[3]=6 i=2
				//3+1+6 -> intArray[4]=10 i=3
				//의 식이 되었을떄 
				//intArray[i+1]가 인덱스 5가 되어 성립하지않아 오류 발생
 				intArray[i+1] = intArray[i]+i+1;
				System.out.println(intArray[i]);
				
		
			}
			
//		} catch (Exception e) {// 예외처리 종류 상관없이 다 처리(실무에서 많이 사용)
		} catch (ArrayIndexOutOfBoundsException e) {// 예외처리 종류 상관없이 다 처리(실무에서 많이 사용)
			
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
			
		}
		
	}
}

//
//0
//1
//3
//6
//배열의 인덱스가 범위를 벗어났습니다.