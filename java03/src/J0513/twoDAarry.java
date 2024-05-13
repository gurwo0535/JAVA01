package J0513;

public class twoDAarry {
	public static void main(String[] args) {
		
		int array[][] = new int[4][4];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random()*10+1);
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
		// 나
//		int array[][] = new int[4][4];
//		
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) { // 배열 왜 안쓰누 
//				System.out.print(rNumber()+"\t");
//			}
//			System.out.println();
//		}
//	}
//	public static int rNumber() {
//		double a =10* Math.random();
//		int temp = (int)a;
//		return temp+1;
//	}
//}

