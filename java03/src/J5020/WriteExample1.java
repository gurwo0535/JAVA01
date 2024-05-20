package J5020;

import java.io.FileOutputStream;
import java.io.OutputStream;

//자바안에서 택스트 파일을 생성하고 문자를 입력할수 있다 .
// 배열을 이용한 방법

// ctrl+shift+ o : 안쓰는 import 한번에 삭제 

public class WriteExample1 {
	// throws Exception : 예외 처리 
	public static void main(String[] args) throws Exception {
		
		
		//FileOutputStream : 바이트 단위 출력을 위한 하위 스트림 클래스 
		//FileOutputStream : output.txt	 를 가지고 객체 생성한다 
		OutputStream os =  new FileOutputStream("d:/output.txt");
		
		//바이트 단위로 문자열을 읽는다.
		byte[] data = "ABC".getBytes();
		
		for (int i = 0; i < data.length; i++) {
			
			//FileOutputStream 객체에 바이트 배월원소를 넣는다.
			os.write(data[i]);
		}
		os.close();
	}
}
