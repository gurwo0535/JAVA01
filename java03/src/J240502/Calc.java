package J240502;
			
/*
 * main 메소드 매개변수 이용
 * 
 */




public class Calc {
	// args : main 메소드의 매개변수 /string type의 변수 
	// 인자 전달 / 매개변수 / 파라미터
	public static void main(String[] args) {
		double sum = 0.0;
		
		//run - run configurations - arguments - 값 입력 - finish
		
//		main 메소드 매개변수 크기만큼 반복
		for (int i = 0; i < args.length; i++) {
//			Double.parseDouble();
//			Double : Wrapper 클래스
//			parseDouble() : 실수로 변환하느 메소드
			sum+= Double.parseDouble(args[i]) ;
		}
		
		System.out.println("합계 : "+sum);
		
	}
}
