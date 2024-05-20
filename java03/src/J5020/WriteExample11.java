package J5020;

import java.io.FileWriter;
import java.io.Writer;

//자바안에서 택스트 파일을 생성하고 문자를 입력할수 있다 .
//배열을 이용한 방법

public class WriteExample11 {
	public static void main(String[] args) throws Exception {
		
		//Writer : 바이트 단위 출력을 위한 최상위 스트림 클래스 
		//FileWriter : 바이트 단위 출력을 위한 최상위 스트림 클래스  
		Writer writer =  new FileWriter("d:/output11.txt");
		
		//문자열을 문자 하나씩 배열로 받는다.
		char[] data =  "홍길동".toCharArray();
		
		for (int i = 0; i < data.length; i++) {
			
			//Writer 객체에 write()로 "홍길동"을
			// 한글자 씩 받아서 파일로 저장한다
			writer.write(data[i]);
		}
		writer.close();
	}
}
