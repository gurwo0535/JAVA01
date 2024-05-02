package J240502;

public class IrregularArray {
	public static void main(String[] args) {
		
//		int n[][] = {{10,11,12},{20,21},{30,31,32},{40,41}};
		
		//비정방향 배열 : 행만 정의하고 열은 비워둠 
		int n[][] = new int[4][];
		n[0]=new int[3];//1행(n[0])의 열의크기는 3
		n[1]=new int[2];//2행(n[0])의 열의크기는 2
		n[2]=new int[3];//3행(n[0])의 열의크기는 3
		n[3]=new int[2];//4행(n[0])의 열의크기는 2
		
//		4번 반복
		for (int i = 0; i < n.length; i++) {//행의 크기만큼 반복
//			3,2,3,2 반복
			for (int j = 0; j < n[i].length; j++){//열의 크기만큼 반복
			
//				System.out.println("ii---"+i);
//				System.out.println("jj---"+j);
//				
				
				n[i][j]=(i+1)*10+j;
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}
}		
	
		
		
		
		
		//나
//		int n[][] = new int[4][];
//		
//		int n[][] = {{10,11,12},{20,21},{30,31,32},{40,41}};
//		
//		for (int i = 0; i < n.length; i++) {
//		
//			for (int j = 0; j < n[i].length; j++) {
//		
//				System.out.print(n[i][j]+" ");
//			}
//			System.out.println();
//		}	
//		
//		
//	}
//
//}


//
//중급C 6 : 비정방형 배열의 생성과접근(IrregularArray)
//1
//다음그림과같은비정방형배열을만들어값을초기화하고출력하시오