package J5020;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

//

public class ReadExample11 {
	public static void main(String[] args) throws Exception {
		
		//Reader : 문자 단위 입력을 위한 최상위 스트림 클래스 
		//FileReader : 문자 단위 입력을 위한 하위 스트림 클래스 
		Reader reader =  new FileReader("D:\\text.txt");
		
		int readData;
		
		while (true) {
			
			//한개의 문자 단위로 받는다
			readData = reader.read();
			if (readData == -1) {
				break;
			}
			//유니코드로 나오니 형변환
			System.out.print((char)readData);
		}
		reader.close();
	}
}	
