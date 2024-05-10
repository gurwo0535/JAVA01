package J0510;
/**
 * 추상
 */
abstract class Calculator{//추상 클래스 선언[추상메소드 없어도 됨]
//	public int add(int a, int b) { return 1;}
	public abstract int add(int a, int b); // 추상 메소드 선언 
	public abstract int subtract(int a, int b); // 추상 메소드 선언 
	public abstract double average(int[] a); // 추상 메소드 선언 
		
	
}
//public abstract class GoodCalc extends Calculator {
	//abstract를 붙혀 추상클래스가 되면 구현 불필요 
	
	public class GoodCalc extends Calculator {
		//추상 메소드 오버라이딩해서 구현 안하면 오류 
		public static void main(String[] args) {
			GoodCalc c = new GoodCalc();// 추상클래스인 경우 객체 생성 못함 
			System.out.println(c.add(2, 3));
			System.out.println(c.subtract(2, 3));
			System.out.println(c.average(new int[]{2,3,4}));
		}
	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+= a[i];
		}
		return sum/a.length;
	}
}
