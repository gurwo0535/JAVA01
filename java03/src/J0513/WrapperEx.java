package J0513;

public class WrapperEx {
	public static void main(String[] args) {
		
		char c1= '4', c2 = 'F';
		//Character : 래퍼 클래스
		//isDigit : 숫자 체크하는 메소드 
		if (Character.isDigit(c1)) {
			System.out.println("숫자");
		} else {
			System.out.println("숫자 아님 ");

		}
		if (Character.isDigit(c2)) {
			System.out.println("숫자");
		} else {
			System.out.println("숫자 아님 ");
			
		}
		//isAlphabetic : 알파벳 인지 체크하는 메소드
		if (Character.isAlphabetic(c1)) {
			System.out.println("알파벳");
		} else {
			System.out.println("알파벳 아님 ");
			
		}
		//parseInt : 문자열을 정수로 변환 
		System.out.println(Integer.parseInt("-123"));
		
		//toHexString : 16진수
		System.out.println(Integer.toHexString(28));// 16진수 
		
		//toBinaryString : 2진수
		System.out.println(Integer.toBinaryString(28));
		
		//bitCount : 2진수에서 1의 갯수 
		System.out.println(Integer.bitCount(28));
		
		// 3.14를 포함하는 객체를 가리키는 d 참조변수
		Double d =  Double.valueOf(3.14);
		
		//문자열 3.14를출력
		System.out.println(d.toString());
		
		//parseDouble : 문자열을 실수로 변환하는 메소드 
		System.out.println(Double.parseDouble("3.14"));
		
		boolean b = (4>3);
		
		//Boolean.toString(b) : Boolean 래퍼클래스의 toString 메소드로 불린값을 문자열로 변환 
		System.out.println(Boolean.toString(b));
		
		//Boolean 값을 문자열로 변환하여 false 출력 
		System.out.println(Boolean.parseBoolean("false"));
		
		
		
	}
}
