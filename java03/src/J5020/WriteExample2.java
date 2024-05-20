package J5020;

import java.io.FileOutputStream;
import java.io.OutputStream;

//자바안에서 택스트 파일을 생성하고 문자를 입력할수 있다 .
//os.write(data); 
//사용해 바로 출력


public class WriteExample2 {
	public static void main(String[] args) throws Exception {
		
		
		OutputStream os =  new FileOutputStream("d:/output2.txt");
		
		byte[] data = "DnF".getBytes();
		
		os.write(data);
		
//		for (int i = 0; i < data.length; i++) {
//			os.write(data[i]);
//		}
		
		os.close();
	}
}
