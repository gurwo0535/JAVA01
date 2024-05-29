package 중상급;



// 이거 안됨 외워 씨발 병신아 제발 
//String text = ["홍길동","장화","홍련","콩쥐","팝쥐"];


// 이 방식으로 풀어보자 
public class StringTokenizerEx {
	public static void main(String[] args) {

	String text = "홍길동,장화,홍련,콩쥐,팝쥐";

	
	for (int i = 0; i < text.length(); i++) {
		if (text.equals(",")) {
			text = "\n";
		}
	}
		System.out.println(text);
	}
}

// ======================= 형 ======================
//public class StringTokenizerEx {
//	public static void main(String[] args) {
//
//		String text = "홍길동,장화,홍련,콩쥐,팝쥐";
//		
//        String[] names = text.split(",");
//
//        // 배열의 각 요소를 출력
//        for (String name : names) {
//            System.out.println(name);
//        }
//		
//	}
//}
// =========== 선생님 ===============================
	// StringTokenizer클래스 활용법 
	// hasMoreTokens() 연계로 사용 
//
//import java.util.StringTokenizer;
//
//public class StringTokenizerEx {
//	
//	public static void main(String[] args) {
//		// st 객체는 5개의 토큰을 가진다 
//		StringTokenizer st = 
// new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
//		
//		
//		// st.hasMoreTokens() :토큰이 있으면 true
//		while (st.hasMoreTokens()) {
//			//st.nextToken(): 토큰을 꺼내온다
//			System.out.println(st.nextToken()); 
//			
//		}
//	}
//}


//“홍길동/장화/홍련/콩쥐/팥쥐”문자열을‘/’를 
//구분 문자로 하여 토큰을분리하여각토큰을출력하라.
//홍길동
//장화
//홍련
//콩쥐
//팥쥐