package 중상급;

public class twoDArray {
	public static void main(String[] args) {
		
		int arr[][] = new int[4][4];		
		int random = (int)(Math.random()*10)+1;
		
		
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * 10) + 1;
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
	}
}	
		
		
		// arr[i][j] 값에 random()을 줘야하기때문에 
		// arr[i][j] = (int)(Math.random() * 10) + 1; 로 수정한다 
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = random; 
//				System.out.print(arr[i][j]+"  ");
//			}
//			System.out.println();
//		}



// 4*4의 2차원 배열을만들고이곳에1에서10까지범위
//의정수를랜덤하게생성하여정수16개를배열에저장
//하고, 2차원 배열을 화면에출력하라.
// *.출력
// 9 10 3 1
// 1 7 3 2
// 9 10 6 2
// 8 4 2 7