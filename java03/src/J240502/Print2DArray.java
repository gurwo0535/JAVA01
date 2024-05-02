package J240502;

public class Print2DArray {
	public static void main(String[] args) {
		//열의 크기가 각각 달라서 비정방형 배열
		int n[][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		
		
		// 각 행의 길이만큼 반복하여 요소 출력
		// n.length : 5(행의크기) => 중괄호 안에 중괄호 갯수
		for (int i = 0; i < n.length; i++) {
//			n[0].length =1;
//			n[1].length =3;
//			n[2].length =1;
//			n[3].length =4;
//			n[4].length =2;
			for (int j = 0; j < n[i].length; j++) {
		
				//n[i][j] : 2차원 배열 원소
				System.out.print(n[i][j]+" ");
//				System.out.println("ii----"+i);
//				System.out.println("jj----"+j);
				
			}
			System.out.println();// 한 행 출력 후 줄 바꿈
		}	
		
	}
}


//
//중급C5 : 2차원 배열 (Print2DArray)
//1
// 다음2차원배열n을출력하는프로그램을작성하라.
// int n [][] = { {1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
// *.출력
// 1
// 1 2 3
// 1
// 1 2 3 4
// 1 2