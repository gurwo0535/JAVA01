package J5020;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample1 {
	
	//throws Exception : 파일이 없을 수 있기 떄문에 예외 처리를 해둔다 
	public static void main(String[] args) throws Exception {
		
	// InputStream : 바이트 단위 입력을 위한 최상위 스트림 클래스 
	// FileInputStream : 바이트 단위 입력을 위한 하위 스트림 클래스 
	InputStream is = new FileInputStream("D:\\text.txt");
	
	int readByte;
	
	//1번과 2번은 같다 축약
	while ((readByte = is.read()) != -1) {
		System.out.print((char)readByte);
	}
	
	//2번
//	while (true) {
//		if (readByte == -1) {
//			break;
//		}System.out.print((char)readByte);
		
		
	/*
	while (true) {
		
		//byte 단위로 읽는다 / 정수로 받음
		readByte = is.read();
		
		//파일의 끝에는 -1이 존재(프로그래밍 언어 동일)
		// EOF (end of file) 
		if (readByte == -1) {
			break;
		}
		
		// 문자를 넣으면 유니코드로 표시
		//13 : 엔터 
		// 10 : 첫번쨰열 
		// ㅁㅁㅁ : 97 
//		System.out.println(readByte);
		
		
		// 문자열을 출력하려면 형변환 
		// ((char)readByte);
		System.out.print((char)readByte);
		}
		*/
	
		is.close();
	}
}
