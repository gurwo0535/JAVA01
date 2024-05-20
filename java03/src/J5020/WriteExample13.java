package J5020;

import java.io.FileWriter;
import java.io.Writer;

//자바안에서 택스트 파일을 생성하고 문자를 입력할수 있다 .
//writer.write(data,1,2); 사용법


public class WriteExample13 {
	public static void main(String[] args) throws Exception {
		
		Writer writer =  new FileWriter("d:/output13.txt");
		
		char[] data =  "홍길동3".toCharArray();
		
//		writer.write(data);
		
		//길동 :  "홍길동3"에서 인덱스 1번에서 2자를 읽어 파일로 저장
		writer.write(data,1,2);
		

		writer.close();
	}
}
