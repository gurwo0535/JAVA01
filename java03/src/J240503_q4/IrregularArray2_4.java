package J240503_q4;

public class IrregularArray2_4 {
	public static void main(String[] args) {
		
		
		int num[][]= new int[5][];
		num[0]=new int[5];
		num[1]=new int[1];
		num[2]=new int[4];
		num[3]=new int[2];
		num[4]=new int[3];//4행(n[0])의 열의크기는 2
		
		//5행
		for (int i = 0; i < num.length; i++) {
			//5열 불규칙 
//			/num[i].length (5.1.4.2.3)
			for (int j = 0; j < num[i].length; j++) {
				
				num[i][j] = (i+3)*10+j+5;
//(첫째자리 + 스타트가 30이니 3)*10(10의자리니까)+(두번쨰 배열의 값)+(시작이 5니까)
				System.out.print(num[i][j]+ " ");
				
			}
			System.out.println();
		}
	}
}


//급D1 : 비정방형배열의생성과접근(IrregularArray2)
//다음그림과같은비정방형배열을만들어값을초기화하고출력하시오.
// 35 36 37 38 39 
//45 
//55 56 57 58 
//65 66 
//75 76 77