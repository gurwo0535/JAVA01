package J5020;

// 랜덤 중복 안나오게 하기 

public class Loto6 {
	public static void main(String[] args) {
		
		 int ran;
		 int[] array = new int[6];
		 int loto = 0;
		 
	        for (int i = 0; i < 6; i++) {
	            do {
	                ran = (int) (Math.random() * 45) + 1;
	            } while (array.length <6);
	            array[i] = ran;
	            loto =  array[i];
	         
	            System.out.print(loto+" ");
	        }
	}
}