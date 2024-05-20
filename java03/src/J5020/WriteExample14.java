package J5020;

import java.io.FileWriter;
import java.io.Writer;

//자바안에서 택스트 파일을 생성하고 문자를 입력할수 있다 .
//writer.write(data,3,2); 사용법

public class WriteExample14 {
	public static void main(String[] args) throws Exception {
		
		Writer writer =  new FileWriter("d:/output14.txt");
		
		String data = "안녕 자바 프로그램";
		
		//자바 :  "안녕 자바 프로그램"에서 인덱스 3번에서 2자를 읽어 파일로 저장
		writer.write(data,3,2);
		
		writer.close();
	}
}
