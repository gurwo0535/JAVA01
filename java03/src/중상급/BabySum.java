package 중상급;

public class BabySum {
	public static void main(String[] args) {
		int baby[][] = new int[120][5];
		
		int sum =0;
		for (int i = 0; i < baby.length; i++) {
			for (int j = 0; j < baby[i].length; j++) {
				baby[i][j] = (i+1)*100+j+1;
				sum += baby[i][j];
			}
		}
		System.out.println(sum);
	}
}


//차원 배열에 월별로 5개의 나라에 발생된 신생아수를 저장하고, 10년간 전체 신생
//아수를 출력하라. (단, 1월은 5개의 나라에 각각 101, 102, 103, 104, 105 명 발생하고, 
//2월은 201, 202, 203, 204, 205 … 12월은 1201,1202,1203,1204,1205, 120개월째에는
//12001,12002,12003,12004,12005 이다.)
//10년간 5개 나라의 총 신생아수는 3631800