package J5020;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

//

public class ReadExample12 {
	public static void main(String[] args) throws Exception {
		
		Reader reader =  new FileReader("D:\\text.txt");
		
		int readData;
		
		char[] cbuf = new char[2];
		
		String data = "";
		
		while (true) {
			
			//한개의 문자 단위를 읽는다
//			readData = reader.read();
			
			//두개의 문자 단위를 읽는다
			readData = reader.read(cbuf);
			
			if (readData == -1) {
				break;
			}
			
			//
//			System.out.print((char)readData);
			
			data += new String(cbuf, 0, readData);
		}
		System.out.print(data);
		
		
		reader.close();
	}
}	
