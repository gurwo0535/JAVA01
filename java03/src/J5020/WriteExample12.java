package J5020;

import java.io.FileWriter;
import java.io.Writer;

//자바안에서 택스트 파일을 생성하고 문자를 입력할수 있다 .
//writer.write(data);
//사용해 바로 출력

public class WriteExample12 {
	public static void main(String[] args) throws Exception {
		
		Writer writer =  new FileWriter("d:/output12.txt");
		
		char[] data =  "홍길2".toCharArray();
		writer.write(data);
		
		
//		for (int i = 0; i < data.length; i++) {
//			writer.write(data[i]);
//		}
		
		writer.close();
	}
}
