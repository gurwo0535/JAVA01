package J0517;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	
	public static void main(String[] args) {
		// st 객체는 5개의 토큰을 가진다 
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
		
		
		// st.hasMoreTokens() :토큰이 있으면 true
		while (st.hasMoreTokens()) {
			//st.nextToken(): 토큰을 꺼내온다
			System.out.println(st.nextToken()); 
			
		}
	}
}


//홍길동/장화/홍련/콩쥐/팥쥐”문자열을‘/’를 구분 문자로 하여 토큰을 분리하여 각 토큰을 출력하라.
//홍길동
//장화
//홍련
//콩쥐
//팥쥐
