package J5020;

import java.io.FileOutputStream;
import java.io.OutputStream;

//자바안에서 택스트 파일을 생성하고 문자를 입력할수 있다 .
//os.write(data,1,2); 사용법
//os.flush(); 사용법 



public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		
		
		OutputStream os =  new FileOutputStream("d:/output3.txt");
		
		byte[] data = "DnF".getBytes();
		
//		os.write(data);
		
		//nF :  인덱스 1에서 2글자 
		os.write(data,1,2);
		
		//인터넷이 불안정한 상태에서 네트워크가 끊겼을때 
		// 전송되지 못한 데이터를 보낸다.
		os.flush();
		
		os.close();
	}
}
