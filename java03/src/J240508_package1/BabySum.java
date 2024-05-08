package J240508_package1;



public class BabySum {
	public static void main(String[] args) {
	
		int sum = 0;
		
		int baby[][] = new int[120][5];
		
		for (int month = 0; month < baby.length; month++) {
			for (int country = 0; country < baby[month].length; country++) {
				baby[month][country] = (month+1)*100+country+1 ;
				sum += baby[month][country];
			}
		}
		System.out.println("10년간 5개 나라의 총 신생아 수는 : " + sum+"명입네다");
	}	
}
