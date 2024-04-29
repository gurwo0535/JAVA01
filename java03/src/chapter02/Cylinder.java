package chapter02;

public class Cylinder {
	public static void main(String[] args) {
		
		double r = 7;
		double h = 5;
//		1.메소드 호출
//		4. 원기둥 부피 값을 받음
		double v = volume(r , h);
		System.out.println
		("반지름이 "+r + " 높이가 " + h + "인 원기둥의 부피 : " + v);
	}
//	2.메소드 호출됨 
//	매개변수가 2개인 메소드 
	public static double volume(double radius, double height) {
//		return 0.0 ;
//		3. 원기둥 부피 구하기
		return Math.PI * radius* radius * height;
	}
}
