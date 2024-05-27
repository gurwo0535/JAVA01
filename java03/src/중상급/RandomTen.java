package 중상급;

public class RandomTen {
	public static void main(String[] args) {
		
		int num[] = new int[10];
		double sum = 0;
		double aver=0;
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*10)+1;
			sum += num[i];
			System.out.println(num[i]);
			aver = sum /num.length;
		}
		System.out.println(aver);
	}
}

//
//정수를 10개 저장하는 배열을 만들고 1에서 10까지 범
//위의 정수를 랜덤하게 생성하여 배열에 저장하라.
// 그리고 배열에 든 숫자들과 평균을 출력하라.
// *.출력
// 랜덤한 정수들 : 8 7 3 4 1 5 3 2 9 9 
// 평균은 5.1