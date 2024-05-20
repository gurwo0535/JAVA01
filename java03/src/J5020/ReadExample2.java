package J5020;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample2 {
	
	public static void main(String[] args) throws Exception {
		
	InputStream is = new FileInputStream("D:\\text.txt");
	
	int readByte = 0;
	
	 byte[] readBytes = new byte[3];
	 String data = "";
	
	 while (true) {
		 readByte = is.read(readBytes);
			if (readByte == -1) {
				break;
			}
		//문자 3개를 형변환하면서 오류 ex>aaa -> char
//		System.out.print((char)readByte);
		
		//readBytes 를 인덱스에서 raedByte 길이만큼 읽는다 
		data += new String(readBytes, 0, readByte);
	}
	 System.out.println(data);
	 
	 is.close();
}
}
